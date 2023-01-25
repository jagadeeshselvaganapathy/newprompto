package com.pojo;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class LogoutPage extends BaseClass {
	
	public LogoutPage() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='sidebarButton_Workspaces']")
	private WebElement workSpaceButton;
	
	@FindBy(xpath = "//div[@class='sc-iNGGcK fcjTJT']")
	private WebElement logOutButton;
	
	
	
	public WebElement getWorkSpaceButton() {
		return workSpaceButton;
	}


	public WebElement getlogOutButton() {
		return logOutButton;
	}

	
	
	public void logOut() throws InterruptedException, IOException {
		

	clickButton(getWorkSpaceButton());
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click()", getlogOutButton());
//	clickButton(getlogOutButton());
		
		
	}

}
