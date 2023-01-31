package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class FailedOne extends BaseClass {

	public FailedOne() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='Add new project']")
	private WebElement addProjectButton;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;
	
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "//p[normalize-space()='Team']")
	private WebElement teamButton;
	
	@FindBy(xpath = "//span[normalize-space()='Add member']")
	private WebElement addMemberButton;
	
	@FindBy(xpath = "//span[normalize-space()='invite']")
	private WebElement inviteButton;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelMemberButton;
		
	
	
	public WebElement getAddProjectButton() {
		return addProjectButton;
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getSettingButton() {
		return settingButton;
	}

	public WebElement getteamButton() {
		return teamButton;
	}
	
	public WebElement getAddMemberButton() {
		return addMemberButton;
	}

	public WebElement getInviteButton() {
		return inviteButton;
	}
	
	public WebElement getcancelMemberButton() {
		return cancelMemberButton;
	}
	
	
	
	public void chkButton() throws AWTException, InterruptedException {
		

		
		Thread.sleep(30000);
		clickButton(getAddProjectButton());
		boolean contains = driver.getCurrentUrl().contains("xyz");
		Assert.assertTrue("verified", contains);
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getCancelButton());
		Thread.sleep(10000);
		clickButton(getSettingButton());
		Thread.sleep(10000);
		clickButton(getteamButton());
		Thread.sleep(10000);
		clickButton(getAddMemberButton());
		Thread.sleep(10000);
		boolean enabled = getInviteButton().isEnabled();
		System.out.println(enabled);
		Thread.sleep(10000);
		clickButton(getcancelMemberButton());
		Thread.sleep(10000);
		
	}

}
