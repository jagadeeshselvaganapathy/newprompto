package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkUrl;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckUrl extends BaseClass {
	


	@Given("user with valid credentials they login url")
	public void userWithValidCredentialsTheyLoginUrl() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		

	
	}
	@When("user validate click url")
	public void userValidateClickUrl() throws InterruptedException, AWTException, IOException {
		
		ClkUrl c = new ClkUrl();
	    c.clkUrl();

	
	}
	@Then("user logout url")
	public void userLogoutUrl() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       	

	
	}





}
