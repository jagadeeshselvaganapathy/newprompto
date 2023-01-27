package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import com.base.BaseClass;
import com.pojo.ChkDropDown;
import com.pojo.ClkDragAndDrop;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckDragAndDrop extends BaseClass{
	


	@Given("user with valid credentials they login draganddrop")
	public void userWithValidCredentialsTheyLoginDraganddrop() throws InterruptedException, IOException, AWTException {
		
		lanchBrowser();
		loadUrl(valueFromProperty("url"));
		Thread.sleep(10000);
		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));
		
		

	
	}
	@When("user validate check draganddrop")
	public void userValidateCheckDraganddrop() throws AWTException, InterruptedException, IOException {
		
		ClkDragAndDrop c = new ClkDragAndDrop();
	  	c.clkDragAndDrop();
	

	
	}
	@Then("user logout draganddrop")
	public void userLogoutDraganddrop() throws InterruptedException, IOException {
		
		LogoutPage l = new LogoutPage();
       	l.logOut();
	


	
	}







}
