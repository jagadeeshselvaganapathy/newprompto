package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ChkDropDown;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckDropDown extends BaseClass {
	


	@Given("user with valid credentials they login dropdown")
	public void userWithValidCredentialsTheyLoginDropdown() throws InterruptedException, IOException, AWTException {

		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click dropdown")
	public void userValidateClickDropdown() throws AWTException, InterruptedException {
		
		ChkDropDown a = new ChkDropDown();
		a.dropdown();

	
	}
	@Then("user logout dropdown")
	public void userLogoutDropdown() throws InterruptedException, IOException {
		
		 LogoutPage l = new LogoutPage();
	       	l.logOut();

	
	}







}
