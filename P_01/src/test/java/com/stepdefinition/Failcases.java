package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.FailedOne;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Failcases extends BaseClass{
	

	@Given("user with valid credentials they login failing")
	public void userWithValidCredentialsTheyLoginFailing() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate check failing")
	public void userValidateCheckFailing() throws AWTException, InterruptedException {
		
		FailedOne f = new FailedOne();
		f.chkButton();

	
	}
	@Then("user logout failing")
	public void userLogoutFailing() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
		l.logOut();

	
	}




}
