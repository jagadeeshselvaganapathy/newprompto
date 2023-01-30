package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;
import com.pojo.SettingupPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingupApplication extends BaseClass{
	

	@Given("user with valid credentials they login to setup")
	public void userWithValidCredentialsTheyLoginToSetup() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate the application for execution")
	public void userValidateTheApplicationForExecution() throws IOException, InterruptedException, AWTException {
		
		SettingupPage s = new SettingupPage();
		s.method();

	
	}
	@Then("user logout the application")
	public void userLogoutTheApplication() throws InterruptedException, IOException {
		
		
		LogoutPage l = new LogoutPage();
       	l.logOut();

	
	}




}
