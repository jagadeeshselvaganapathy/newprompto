package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkPopups;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckPopup extends BaseClass{



	@Given("user with valid credentials they login popups")
	public void userWithValidCredentialsTheyLoginPopups() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click popups")
	public void userValidateClickPopups() throws InterruptedException, AWTException, IOException {
		
		ClkPopups c = new ClkPopups();
	   	c.clkPopups();

	
	}
	@Then("user logout popups")
	public void userLogoutPopups() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	    	l.logOut();


	
	}





}
