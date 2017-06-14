package com.github.adrieldomagalski.java.AppTwitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import twitter4j.Twitter;

import javax.websocket.server.PathParam;

/**
 * Created by ilegra0267 on 14/06/17.
 */
@SpringBootApplication
@RequestMapping("/tweets/*")
public class Twittes {

    @Autowired
    private Twitter twitter;

    @RequestMapping("/tweets/{user}")
    @ResponseBody
    public String tweet(@PathVariable String user){
        try {
            return  "number of twittes "+ twitter.users().showUser(user).getStatusesCount() + " user " + user;

        }catch (Exception e){
            return "twitter not found";
        }
    }
}