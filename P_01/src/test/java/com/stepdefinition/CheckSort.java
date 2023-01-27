package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkSort;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckSort extends BaseClass{
	


	@Given("user with valid credentials they login sort")
	public void userWithValidCredentialsTheyLoginSort() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));


	
	}
	@When("user validate click sort")
	public void userValidateClickSort() throws AWTException, InterruptedException, IOException {
		
		ClkSort c = new ClkSort();
		c.clkSort();

	
	}
	@Then("user logout sort")
	public void userLogoutSort() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	    	l.logOut();

	
	}






}
