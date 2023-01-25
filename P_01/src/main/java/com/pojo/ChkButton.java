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



public class ChkButton extends BaseClass {

	public ChkButton() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addProjectButton;
	
	@FindBy(xpath = "(//button[@id='button_null'])[2]")
	private WebElement cancelButton;
	
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "//p[normalize-space()='Team']")
	private WebElement teamButton;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addMemberButton;
	
	@FindBy(xpath = "(//span[@class=\"Button_button__label__1h86U Button_spanStyle__2u_Xo\"])[3]")
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
		

		Thread.sleep(20000);
		clickButton(getAddProjectButton());
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
