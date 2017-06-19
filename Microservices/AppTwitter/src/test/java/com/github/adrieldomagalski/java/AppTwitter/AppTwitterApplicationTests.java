package com.github.adrieldomagalski.java.AppTwitter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import twitter4j.Twitter;

import java.io.IOException;

import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigurationTest.class)
public class  AppTwitterApplicationTests {

	@Autowired
	private TwitterService twitterService;

	@Autowired
	private Twittes twittes;

	@Test
	public void twittesTestOk() throws IOException {
		when(twittes.tweet("renanrhoden")).thenReturn("renanrhoden number of twittes: " + 41503);
		Assert.assertEquals("renanrhoden number of twittes: " + 41503, twittes.tweet("renanrhoden"));
	}
	@Test
	public void twittesTestNotFound() throws IOException{
		when(twittes.tweet("adriel_dev")).thenReturn("User not found");
		Assert.assertEquals("User not found", twittes.tweet("adriel_dev"));
	}

}
