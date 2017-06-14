package com.github.adrieldomagalski.java.AppTwitter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


/**
 * Created by ilegra0267 on 13/06/17.
 */
@Configuration
public class AppConfig{

    @Bean
    public Twitter buildTwitter() {
        ConfigurationBuilder cb = new ConfigurationBuilder ();
        cb.setDebugEnabled (true)
                .setOAuthConsumerKey(System.getenv("CONSUMERKEY"))
                .setOAuthConsumerSecret(System.getenv("CONSUMERSECRET"))
                .setOAuthAccessToken(System.getenv("ACESSTOKEN"))
                .setOAuthAccessTokenSecret(System.getenv("ACESSTOKENSECRET"));
        TwitterFactory tf = new TwitterFactory (cb.build ());
        Twitter twitter = tf.getInstance ();
        return twitter;
    }
}

