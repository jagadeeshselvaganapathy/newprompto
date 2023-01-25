package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkTab;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckTab extends BaseClass{
	


	@Given("user with valid credentials they login tab")
	public void userWithValidCredentialsTheyLoginTab() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		

	
	}
	@When("user validate click tab")
	public void userValidateClickTab() throws AWTException, InterruptedException {
		
		ClkTab c = new ClkTab();
        c.clkTab();

	
	}
	@Then("user logout ninth time tab")
	public void userLogoutNinthTimeTab() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       	

	
	}





}
