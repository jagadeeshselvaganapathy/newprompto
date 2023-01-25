package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ChkNewTab;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckNewTab extends BaseClass{
	


	@Given("user with valid credentials they login newtab")
	public void userWithValidCredentialsTheyLoginNewtab() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		

	
	}
	@When("user validate click newtab")
	public void userValidateClickNewtab() throws InterruptedException, AWTException {
		
		ChkNewTab c = new ChkNewTab();
	  	c.chkNewTab();

	
	}
	@Then("user logout fiftinth time newtab")
	public void userLogoutFiftinthTimeNewtab() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       	 
	}







}
