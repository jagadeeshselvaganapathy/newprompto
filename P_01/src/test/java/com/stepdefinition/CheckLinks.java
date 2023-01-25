package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkLink;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckLinks extends BaseClass {



	@Given("user with valid credentials they login Link")
	public void userWithValidCredentialsTheyLoginLink() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	
	@When("user validate click Link")
	public void userValidateClickLink() throws AWTException, InterruptedException {
		
		ClkLink c = new ClkLink();
	   	c.clkLink();

	
	}
	@Then("user logout Sixth time Link")
	public void userLogoutSixthTimeLink() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	       	l.logOut();

	
	}






}
