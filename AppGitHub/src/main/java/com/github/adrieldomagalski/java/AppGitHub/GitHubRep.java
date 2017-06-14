package com.github.adrieldomagalski.java.AppGitHub;

import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ilegra0267 on 14/06/17.
 */
@SpringBootApplication
@RequestMapping("/github/*")
public class GitHubRep {
    @Autowired
    private GitHub gh;

    @RequestMapping("/github/{username}")
    @ResponseBody
    public String numberOfRepositories(@PathVariable String username){
        try {
            return  "Number Repositories of " + gh.getUser(username).getName() + "is " + gh.getUser(username).getPublicRepoCount();
        }catch (Exception e){
            return "GitHub not found";
        }
    }
}

