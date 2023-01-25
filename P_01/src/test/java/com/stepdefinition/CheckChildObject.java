package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkChldObjs;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckChildObject extends BaseClass {
	


	@Given("user with valid credentials they login two")
	public void userWithValidCredentialsTheyLoginTwo() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click chldobjs")
	public void userValidateClickChldobjs() throws InterruptedException, AWTException {
		
		ClkChldObjs c = new ClkChldObjs();
    	c.clkChldObjs();

	
	}
	@Then("user logout two")
	public void userLogoutTwo() throws InterruptedException, IOException {

		LogoutPage l = new LogoutPage();
		l.logOut();
		
	
	}







}
