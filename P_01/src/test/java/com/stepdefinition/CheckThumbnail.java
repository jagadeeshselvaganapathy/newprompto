package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ClkthumbNail;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckThumbnail extends BaseClass{
	


	@Given("user with valid credentials they login thumbnail")
	public void userWithValidCredentialsTheyLoginThumbnail() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}
	@When("user validate click thumbnail")
	public void userValidateClickThumbnail() throws AWTException, InterruptedException, IOException {
		
		ClkthumbNail a = new ClkthumbNail();
		a.thumbNail();

	
	}
	@Then("user logout secound time thumbnail")
	public void userLogoutSecoundTimeThumbnail() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();

	
	}






}
