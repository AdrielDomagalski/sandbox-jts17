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
    private GitHubService gitHubService;

    @RequestMapping("/{user}")
    @ResponseBody
    public String numberOfRepositories(@PathVariable String user){
        try {
            return " repositories user " + user + " " +gitHubService.gitHubServiceResp(user);
        }catch (Exception e){
            return "GitHub not found";
        }
    }
}

