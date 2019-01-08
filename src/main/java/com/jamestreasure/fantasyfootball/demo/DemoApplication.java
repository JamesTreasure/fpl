package com.jamestreasure.fantasyfootball.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamestreasure.fantasyfootball.repository.FantasyPremierLeagueApiRetrofit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(value = {"com.jamestreasure.fantasyfootball"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
			}
		};
	}

    @Bean
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }

	@Bean
    public FantasyPremierLeagueApiRetrofit fantasyPremierLeagueApi(){

        Retrofit build = new Retrofit.Builder()
                .baseUrl("https://fantasy.premierleague.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        return build.create(FantasyPremierLeagueApiRetrofit.class);
    }
}
