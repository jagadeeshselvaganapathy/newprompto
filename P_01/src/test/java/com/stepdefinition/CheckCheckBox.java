package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkCheckBox;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckCheckBox extends BaseClass{
	


	@Given("user with valid credentials they login")
	public void userWithValidCredentialsTheyLogin() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		
		
	}
	
	 
	@When("user validate click checkbox")
	public void userValidateClickCheckbox() throws AWTException, InterruptedException, IOException {
		
		ClkCheckBox c = new ClkCheckBox();
    	c.clkCheckBox();
	
	}
	
	
	@Then("user logout")
	public void userLogout() throws InterruptedException, IOException {

		LogoutPage l = new LogoutPage();
		l.logOut();
		
	
	}







}
