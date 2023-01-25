package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkLink extends BaseClass{
	public ClkLink() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath = "//button[@id='sidebarButton_settings']")
	private WebElement settingsButton;
	
	@FindBy(xpath = "//p[normalize-space()='Team']")
	private WebElement teambutton;

	@FindBy(xpath = "//a[normalize-space()='our FAQ']")
	private WebElement faqLink;
	
	@FindBy(xpath = "//li[@class='kb-header__company-website-link']//a[normalize-space()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//span[normalize-space()='forgot password?']")
	private WebElement forgetPassword;
	
		
	public WebElement getSettingsButton() {
		return settingsButton;
	}


	public WebElement getTeambutton() {
		return teambutton;
	}


	public WebElement getFaqLink() {
		return faqLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getForgetPassword() {
		return forgetPassword;
	}


	public void clkLink() throws AWTException, InterruptedException {
		
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));	
	clickButton(getSettingsButton());
	Thread.sleep(5000);
	
	clickButton(getTeambutton());
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	clickButton(getFaqLink());
	Thread.sleep(5000);
	// to get parent window id
	String par = driver.getWindowHandle();
	//to get all window id
	Set<String> all = driver.getWindowHandles();
	for (String x : all) {
		if (!par.equals(x)) {
			driver.switchTo().window(x);
			Thread.sleep(5000);
			
			
			clickButton(getLoginButton());
			Thread.sleep(5000);
			// to get parent window id
			String par1 = driver.getWindowHandle();
			//to get all window id
			Set<String> all1 = driver.getWindowHandles();
			int count = 0;
			for (String y : all1) {
				if (count==2) {
					driver.switchTo().window(y);
					Thread.sleep(10000);
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
					clickButton(getForgetPassword());
					Thread.sleep(10000);
					driver.close();
				}count++;
				driver.switchTo().window(par1);
			}
			Thread.sleep(5000);
			driver.close();
		}driver.switchTo().window(par);
	}
	Thread.sleep(5000);
		
	}

}
	
	


	


