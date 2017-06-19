package com.github.adrieldomagalski.java.AppFedarate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.when;
import java.io.IOException;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigTest.class)
public class AppFedarateApplicationTests {

	@Autowired
	private Federate federate;


	@Test
	public void federateTestOk() throws IOException{
		when(federate.twetterAndGitHub("renanrhoden", "AdrielDomagalski")).thenReturn("user renanrhoden number of twittes 41503 and repositories user AdrielDomagalski [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]");
		Assert.assertEquals("user renanrhoden number of twittes 41503 and repositories user AdrielDomagalski [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]", federate.twetterAndGitHub("renanrhoden", "AdrielDomagalski"));
	}

	@Test
	public void federateTestNotFound() throws IOException {
		when(federate.twetterAndGitHub("adriel_dev", "AdrielDomagalski")).thenReturn("Twitter service not found and GitHub service not found");
		Assert.assertEquals("Twitter service not found and GitHub service not found", federate.twetterAndGitHub("adriel_dev", "AdrielDomagalski"));
	}

	@Test
	public void federateTestNotFoundTwitter() throws IOException{
		when(federate.twetterAndGitHub("adriel_dev", "AdrielDomagalski")).thenReturn("Twitter service not found and repositories user AdrielDomagalski [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]");
		Assert.assertEquals("Twitter service not found and repositories user AdrielDomagalski [DEV2, ProjetoIlegra, RestingaServicosCliente, SistemaVendasRoupas, TestGit, ads20151, jts.cloud-native.2017, sandbox-jts17, test]", federate.twetterAndGitHub("adriel_dev", "AdrielDomagalski"));

	}

	@Test
	public void federateTestNotFoundGitHub() throws IOException{
		when(federate.twetterAndGitHub("renanrhoden", "AdrielDomagalski")).thenReturn("user renanrhoden number of twittes 41503 and GitHub service not found");
		Assert.assertEquals("user renanrhoden number of twittes 41503 and GitHub service not found", federate.twetterAndGitHub("renanrhoden", "AdrielDomagalski"));

	}
}

