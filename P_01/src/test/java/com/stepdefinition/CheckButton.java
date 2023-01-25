package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ChkButton;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckButton extends BaseClass {
	


	@Given("user with valid credentials they login one")
	public void userWithValidCredentialsTheyLoginOne() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		

	}
	
	
	@When("user validate click button")
	public void userValidateClickButton() throws AWTException, InterruptedException {
		
		ChkButton a = new ChkButton();
		a.chkButton();

	
	}
	@Then("user logout one")
	public void userLogoutOne() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
		l.logOut();

	
	}




	



}
