package com.github.adrieldomagalski.java.AppGitHub;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.mockito.Mockito.when;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigTest.class)
public class AppGitHubApplicationTests {
    @Autowired
    private GitHubRep gitHubRep;

    @Autowired
    private GitHubService gitHubService;

    @Test
    public void gitHubRepTestOK() throws IOException {
        when(gitHubService.gitHubServiceResp("AdrielDomagalski")).thenReturn("Public Repositories of AdrielDomagalski: [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]");
        Assert.assertEquals("Public Repositories of " + "AdrielDomagalski" + ":" + " [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]", gitHubService.gitHubServiceResp("AdrielDomagalski"));

    }

    @Test
    public void gitHubRepTestTestNotFound() throws IOException{
        when(gitHubService.gitHubServiceResp("AdrielDomagalski")).thenReturn("User not found");
        Assert.assertEquals("User not found", gitHubService.gitHubServiceResp("AdrielDomagalski") );
    }


}


