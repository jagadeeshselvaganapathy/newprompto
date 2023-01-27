package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkUpload;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckUploadFile extends BaseClass{
	


	@Given("user with valid credentials they login upload")
	public void userWithValidCredentialsTheyLoginUpload() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		

	
	}
	@When("user validate click upload")
	public void userValidateClickUpload() throws AWTException, InterruptedException, IOException {
		
		ClkUpload c = new ClkUpload();
    	c.clkUpload();

	
	}
	@Then("user logout upload")
	public void userLogoutUpload() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
       	

	}





}
