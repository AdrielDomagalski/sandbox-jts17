package com.github.adrieldomagalski.java.AppGitHub;

import org.kohsuke.github.GitHub;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.mockito.Mockito.mock;

/**
 * Created by ilegra0267 on 19/06/17.
 */
@Profile("test")
@Configuration
public class AppConfigTest {

    @Bean
    public GitHubRep gitHubRep(){
        return mock(GitHubRep.class);
    }
    @Bean
    public GitHubService gitHubService(){
        return mock(GitHubService.class);
    }
    @Bean
    public GitHub gitHub(){
        return mock(GitHub.class);
    }
}
