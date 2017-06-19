package com.github.adrieldomagalski.java.AppTwitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import twitter4j.Twitter;

/**
 * Created by ilegra0267 on 19/06/17.
 */
@SpringBootApplication
public class TwitterService {

    @Autowired
    Twitter twitter;

    public String twitterServiceAccount(String user){
        try{
            return "" + twitter.users().showUser(user).getStatusesCount();
        }catch (Exception e){
            return "User Not Found";
        }
    }
}