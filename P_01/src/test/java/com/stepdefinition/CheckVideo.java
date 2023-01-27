package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkVideo;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckVideo extends BaseClass{
	

	@Given("user with valid credentials they login video")
	public void userWithValidCredentialsTheyLoginVideo() throws InterruptedException, IOException, AWTException {

		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		
	
	}
	@When("user validate check video")
	public void userValidateCheckVideo() throws AWTException, InterruptedException, IOException {
		
		ClkVideo c = new ClkVideo();
		c.clkVideo();
		

	
	}
	@Then("user logout video")
	public void userLogoutVideo() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       	

	
	}




}
