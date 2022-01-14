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
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration
@EnableScheduling
public class CacheConfiguration {

    @Bean
    public CacheManager cacheManager(Ticker ticker) {
        CaffeineCache userPicks = buildCache("userPicks", ticker, 100000);
        CaffeineCache metadata = buildCache("metadata", ticker, 100000);
        CaffeineCache transfers = buildCache("transfers", ticker, 100000);
        CaffeineCache about = buildCache("about", ticker, 100000);

        SimpleCacheManager manager = new SimpleCacheManager();
        manager.setCaches(Arrays.asList(userPicks, metadata, transfers, about));
        return manager;
    }

    private CaffeineCache buildCache(String name, Ticker ticker, int maxiumumSize) {
        return new CaffeineCache(name, Caffeine.newBuilder()
                .maximumSize(maxiumumSize)
                .ticker(ticker)
                .build());
    }

    @Bean
    public Ticker ticker() {
        return Ticker.systemTicker();
    }

}