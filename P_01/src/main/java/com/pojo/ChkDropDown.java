package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ChkDropDown extends BaseClass{
	public ChkDropDown() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//p[normalize-space()='Created date']")
	private WebElement sortTabProjectList;
	
	@FindBy(xpath = "//p[normalize-space()='Project name']")
	private WebElement projectName;
	
	@FindBy(xpath = "//p[normalize-space()='Created date']")
	private WebElement createdByDate;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement openProjectTab;
	
	@FindBy(id = "profileCard")
	private WebElement editProject;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Ongoing')]")
	private WebElement ongoingStatus;
	
	@FindBy(xpath = "//span[normalize-space()='Update project']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTabButton;
	
	@FindBy(xpath = "//p[normalize-space()='Unit']")
	private WebElement unitTabSort;
	
	@FindBy(xpath = "//p[normalize-space()='Status']")
	private WebElement status;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	public WebElement getstatus() {
		return status;
	}
	
	public WebElement getcreatedByDate() {
		return createdByDate;
	}
	
	
	public WebElement getprojectName() {
		return projectName;
	}
	
	
	public WebElement getSortTabProjectList() {
		return sortTabProjectList;
	}



	public WebElement getOpenProjectTab() {
		return openProjectTab;
	}



	public WebElement getEditProject() {
		return editProject;
	}



	public WebElement getProjectStatus() {
		return projectStatus;
	}



	public WebElement getOngoingStatus() {
		return ongoingStatus;
	}



	public WebElement getSaveButton() {
		return saveButton;
	}



	public WebElement getUnitTabButton() {
		return unitTabButton;
	}



	public WebElement getUnitTabSort() {
		return unitTabSort;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}



	public void dropdown() throws AWTException, InterruptedException, IOException {
		Thread.sleep(20000);
		clickButton(getSortTabProjectList());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", getprojectName());
		Thread.sleep(5000);
		clickButton(getprojectName());
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", getcreatedByDate());
		
		
		
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		js.executeScript("arguments[0].click()", getOpenProjectTab());
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			clickButton(getEditProject());
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			clickButton(getProjectStatus());
			js.executeScript("arguments[0].click()", getOngoingStatus());
			Thread.sleep(5000);
			clickButton(getSaveButton());
			Thread.sleep(10000);
		
		clickButton(getUnitTabButton());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getUnitTabSort());
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", getstatus());
		Thread.sleep(5000);
		clickButton(getstatus());
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", getUnitTabSort());
		Thread.sleep(5000);
		
	}
	
}
