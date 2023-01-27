package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkColor;
import com.pojo.ClkHover;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckHover extends BaseClass {
	


	@Given("user with valid credentials they login Hover")
	public void userWithValidCredentialsTheyLoginHover() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click Hover")
	public void userValidateClickHover() throws InterruptedException, AWTException, IOException {
		
		ClkHover c = new ClkHover();
    	c.clkHover();

	
	}
	@Then("user logout Hover")
	public void userLogoutHover() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	       	l.logOut();

	
	}







}
