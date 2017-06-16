package com.github.adrieldomagalski.java.AppFedarate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ilegra0267 on 16/06/17.
 */
@SpringBootApplication
@RequestMapping("/fedarate/*")
public class Fedarate {
    private final String ipTwitter = "http://localhost:7001/tweets/";
    private final String ipGitHub = "http://localhost:7000/github/";
    private RestTemplate rest;
    private ResponseEntity responseTwitter;
    private ResponseEntity responseGitHub;

    @RequestMapping("/{twitteruser}/{githubuser}")
    @ResponseBody
    public Object twetterAndGitHub(@PathVariable(value = "twitteruser") String tweetUser, @PathVariable (value = "githubuser") String gitHubUser){
        return twitter(tweetUser) + " and " + gitHub(gitHubUser);
    }

    public Object twitter(String tweetUser){
        try{
            responseTwitter = rest.getForEntity(ipTwitter + tweetUser, String.class);
            return responseTwitter.getBody();
        }catch (Exception e){
            return "Twitter service unavailable";

        }

    }

    public Object gitHub(String gitHubUser){
        try {
            responseGitHub = rest.getForEntity(ipGitHub  + gitHubUser, String.class);
            return  responseGitHub.getBody();
        }catch (Exception e){
            return "GitHub service unavailable";
        }
    }

}
