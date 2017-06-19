package com.github.adrieldomagalski.java.AppGitHub;

import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by ilegra0267 on 19/06/17.
 */
@SpringBootApplication
public class GitHubService {
    @Autowired
    private GitHub gh;

    public String gitHubServiceResp(String user){
        try{
            return  "" + gh.getUser(user).getRepositories().keySet();
        }catch (Exception e){
            return "User not Found";
        }
    }
}
