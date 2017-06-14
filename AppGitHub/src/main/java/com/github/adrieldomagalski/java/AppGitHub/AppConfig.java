package com.github.adrieldomagalski.java.AppGitHub;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ilegra0267 on 14/06/17.
 */
@Configuration
public class AppConfig{

    @Bean
    public GitHub buildGitHub() throws Exception{
        GitHubBuilder gh = GitHubBuilder.fromCredentials();
            return  gh.build();
    }
}
