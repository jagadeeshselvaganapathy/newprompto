package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkColor;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckColor extends BaseClass{
	


	@Given("user with valid credentials they login color")
	public void userWithValidCredentialsTheyLoginColor() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click color")
	public void userValidateClickColor() throws InterruptedException, AWTException, IOException {
		
		 ClkColor c = new ClkColor();
	 	 c.clkColor();

	
	}
	@Then("user logout color")
	public void userLogoutColor() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
       	l.logOut();

	
	}







}
