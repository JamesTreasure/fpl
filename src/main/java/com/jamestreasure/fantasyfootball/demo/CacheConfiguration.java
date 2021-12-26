package com.jamestreasure.fantasyfootball.demo;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Ticker;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration
public class CacheConfiguration {

    public static final String CACHE_A = "cacheA";
    public static final String CACHE_B = "cacheB";
    public static final String CACHE_C = "cacheC";

    @Bean
    public CacheManager cacheManagerTicker(Ticker ticker) {

        List<Cache> caches = new ArrayList<>();

        // Cache A
        caches.add(this.buildCache(CACHE_A, ticker, 2000L, 1L, TimeUnit.HOURS));

        // Cache B
        caches.add(this.buildCache(CACHE_B, ticker, 2000L, 1L, TimeUnit.HOURS));

        // Cache C
        caches.add(this.buildCache(CACHE_C, ticker, 3500L, 15L, TimeUnit.MINUTES));

        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(caches);
        return cacheManager;
    }

    private CaffeineCache buildCache(String cacheName, Ticker ticker, Long maxSize, Long ttl, TimeUnit ttlUnit){

        Caffeine<Object, Object> cacheBuilder = Caffeine.newBuilder();

        // TTL
        if (ttl != null && ttl > 0 && ttlUnit != null){
            cacheBuilder.expireAfterWrite(ttl, ttlUnit);
        }

        // Max size
        if (maxSize != null && maxSize > 0){
            cacheBuilder.maximumSize(maxSize);
        }

        // Ticker
        cacheBuilder.ticker(ticker);

        return new CaffeineCache(cacheName, cacheBuilder.build());
    }

    @Bean
    public Ticker ticker() {
        return Ticker.systemTicker();
    }

}