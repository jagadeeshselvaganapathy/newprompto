package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.Failtestcase;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class failtestcase extends BaseClass{
	

	@Given("user with valid credentials they login failcase")
	public void userWithValidCredentialsTheyLoginFailcase() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate check failcase")
	public void userValidateCheckFailcase() throws AWTException, InterruptedException {
		
		Failtestcase f = new Failtestcase();
		f.failtestcase();
		

	
	}
	@Then("user logout failcase")
	public void userLogoutFailcase() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
		l.logOut();

	
	}




}
