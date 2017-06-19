package com.github.adrieldomagalski.java.AppFedarate;

import org.springframework.beans.factory.annotation.Autowired;
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
public class Federate {
    @Autowired
    private RestTemplate rest;
    private ResponseEntity responseTwitter;
    private ResponseEntity responseGitHub;

    @RequestMapping("/{twitteruser}/{githubuser}")
    @ResponseBody
    public Object twetterAndGitHub(@PathVariable(value = "twitteruser") String twitteruser, @PathVariable (value = "githubuser") String gitHubUser){
        return twitter(twitteruser) + " and " + gitHub(gitHubUser);
    }

    public Object twitter(String user){
        try{
            responseTwitter = rest.getForEntity("http://localhost:7001/tweets/" + user, String.class);
            return responseTwitter.getBody();
        }catch (Exception e){
            return "Twitter service not found";
        }

    }

    public Object gitHub(String user){
        try {
            responseGitHub = rest.getForEntity("http://localhost:7000/github/"  + user, String.class);
            return  responseGitHub.getBody();
        }catch (Exception e){
            return "GitHub service not found";
        }
    }

}
