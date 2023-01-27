package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkShowcase;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckShowcase extends BaseClass{
	



	@Given("user with valid credentials they login showcase")
	public void userWithValidCredentialsTheyLoginShowcase() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click showcase")
	public void userValidateClickShowcase() throws AWTException, InterruptedException, IOException {
		
		ClkShowcase c = new ClkShowcase();
		c.clkShowcase();

	
	}
	@Then("user logout showcase")
	public void userLogoutShowcase() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	       	l.logOut();

	
	}





}
