package com.github.adrieldomagalski.java.AppTwitter;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import twitter4j.Twitter;

import static org.mockito.Mockito.mock;

/**
 * Created by ilegra0267 on 19/06/17.
 */
@Profile("test")
@Configuration
public class AppConfigurationTest {

    @Bean
    public TwitterService twitterService(){
        return mock(TwitterService.class);
    }

    @Bean
    public Twittes twittes(){
        return mock(Twittes.class);
    }

    @Bean
    public Twitter twitter(){
        return mock(Twitter.class);
    }
}


