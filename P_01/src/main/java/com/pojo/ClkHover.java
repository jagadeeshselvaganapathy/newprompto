package com.pojo;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkHover extends BaseClass{
	public ClkHover() {
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
	private WebElement editThumbnail;
	
	
	@FindBy(xpath = "(//div[@class='sc-gVkuDy lmuuAO'])[1]")
	private WebElement unitThumbNail;
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "//div[@class='react-contextmenu-wrapper']//div//div[1]//div[1]//div[1]//li[1]")
	private WebElement mediaHover;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	
	public WebElement getEditThumbnail() {
		return editThumbnail;
	}


	public WebElement getUnitThumbNail() {
		return unitThumbNail;
	}


	public WebElement getSettingButton() {
		return settingButton;
	}


	public WebElement getMediaHover() {
		return mediaHover;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}
	
	public WebElement getProjectOpen() {
		return projectOpen;
	}


	public void clkHover() throws AWTException, InterruptedException {
		
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Actions a  = new Actions(driver);
		a.moveToElement(getEditThumbnail()).build().perform();
		Thread.sleep(5000);
		a.moveToElement(getUnitThumbNail()).build().perform();			
		Thread.sleep(5000);
		a.moveToElement(getSettingButton()).build().perform();
		Thread.sleep(5000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getsearchField(), "20/01");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		js.executeScript("arguments[0].click()", getProjectOpen());
		
		Thread.sleep(10000);
		a.moveToElement(getMediaHover()).build().perform();
		Thread.sleep(5000);
		
		
			
	}
	
	

}
