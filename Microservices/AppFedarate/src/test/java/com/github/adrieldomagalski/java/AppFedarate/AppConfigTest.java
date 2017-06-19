package com.github.adrieldomagalski.java.AppFedarate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

/**
 * Created by ilegra0267 on 19/06/17.
 */
@Profile("test")
@Configuration
public class AppConfigTest {
    @Bean
    public ResponseEntity responseEntity(){
        return mock(ResponseEntity.class);
    }

    @Bean
    public RestTemplate restTemplate(){
        return mock(RestTemplate.class);
    }

    @Bean
    public Federate fedarate(){
        return mock(Federate.class);
    }
}
