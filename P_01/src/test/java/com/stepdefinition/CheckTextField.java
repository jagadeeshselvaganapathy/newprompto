package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkTextfield;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckTextField extends BaseClass{
	

	@Given("user with valid credentials they login TextField")
	public void userWithValidCredentialsTheyLoginTextField() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click TextField")
	public void userValidateClickTextField() throws InterruptedException, AWTException, IOException {
		

		ClkTextfield c = new ClkTextfield();
	  	c.clkTextFields();

	
	}
	@Then("user logoutTextField")
	public void userLogoutTextField() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	       	l.logOut();
		
	}




}
