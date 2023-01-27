package com.pojo;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkTab extends BaseClass{
	public ClkTab() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;

	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//p[normalize-space()='Sharecodes']")
	private WebElement shareCodesTab;
	
	@FindBy(xpath = "//button[@id='sidebarButton_settings']")
	private WebElement settingTab;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectTab;
	
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTab;
	
	
	@FindBy(xpath = "//button[normalize-space()='Unit Types']")
	private WebElement unitTypeTab;
	
	public WebElement getsearchField() {
		return searchField;
	}
	

	public WebElement getProjectOpen() {
		return projectOpen;
	}


	public WebElement getShareCodesTab() {
		return shareCodesTab;
	}


	public WebElement getSettingTab() {
		return settingTab;
	}


	public WebElement getUnitTab() {
		return unitTab;
	}


	public WebElement getUnitTypeTab() {
		return unitTypeTab;
	}
	
	public WebElement getProjectTab() {
		return projectTab;
	}


	public void clkTab() throws AWTException, InterruptedException, IOException {
	
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		js.executeScript("arguments[0].click()", getProjectOpen());	
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	clickButton(getShareCodesTab());
	Thread.sleep(15000);
	
	clickButton(getSettingTab());
	
	Thread.sleep(5000);	
	clickButton(getProjectTab());
	Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	

	insertText(getsearchField(), valueFromProperty("projectname"));
	Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	js.executeScript("arguments[0].click()", getProjectOpen());	
	Thread.sleep(7000);
	clickButton(getUnitTab());
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	clickButton(getUnitTypeTab());
	Thread.sleep(10000);
	
			
	}
	
	

}
