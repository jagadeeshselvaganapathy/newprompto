package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkIcons;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckIcon extends BaseClass{
	


	@Given("user with valid credentials they login Icons")
	public void userWithValidCredentialsTheyLoginIcons() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click Icons")
	public void userValidateClickIcons() throws InterruptedException, IOException {
		
		ClkIcons c = new ClkIcons();
		c.clkIcons();

	
	}
	@Then("user logout forth time Icons")
	public void userLogoutForthTimeIcons() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       
	
	}







}
