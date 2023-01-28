 package com.pojo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class ClkthumbNail extends BaseClass {
	
	public ClkthumbNail() {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement openProjectTab;
	
	@FindBy(id = "profileCard")
	private WebElement editProject;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Ongoing')]")
	private WebElement ongoingStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Completed')]")
	private WebElement completeedStatus;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectThumbnail;
	
	@FindBy(xpath = "(//button[@class='ProjectCard_actionButton__2yTLi'])[1]")
	private WebElement showCaseThumbnail;
	
	@FindBy(xpath = "//div[@class='sc-pQSRh eYDEVP']")
	private WebElement showCaseSearch;
	
	@FindBy(xpath = "//div[@class='sc-pcxhi hdToTx']")
	private WebElement showCaseProject;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]")
	private WebElement unitThumbNail;
	
	@FindBy(xpath = "//button[@class='sc-qQlgh dnZKXh']")
	private WebElement closeButton;
	
	@FindBy(id = "search-field-input-wrapper")
	private WebElement showcaseSearchText;
	
	public WebElement getshowcaseSearchText() {
		return showcaseSearchText;
	}
	
	public WebElement getCloseButton() {
		return closeButton;
	}
	
	
	public WebElement getshowCaseSearch() {
		return showCaseSearch;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}
	
	public WebElement getshowCaseProject() {
		return showCaseProject;
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
	
	public WebElement getCompleteedStatus() {
		return completeedStatus;
	}
	
	public WebElement getProjectThumbnail() {
		return projectThumbnail;
	}
	
	public WebElement getShowCaseThumbnail() {
		return showCaseThumbnail;
	}
	
	public WebElement getUnitThumbNail() {
		return unitThumbNail;
	}
	
	public void thumbNail() throws AWTException, InterruptedException, IOException {

		Thread.sleep(10000);
		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getOpenProjectTab());

		
	
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getEditProject());
		
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getProjectStatus());
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", getOngoingStatus());
		Thread.sleep(5000);
		clickButton(getProjectStatus());
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", getCompleteedStatus());
		Thread.sleep(5000);
		clickButton(getProjectThumbnail());
		Thread.sleep(5000);
		
		insertText(getsearchField(), valueFromProperty("searchproject"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		js.executeScript("arguments[0].click()", getOpenProjectTab());
		Thread.sleep(10000);
		
		clickButton(getProjectThumbnail());
		Thread.sleep(5000);
		
		
		insertText(getsearchField(), valueFromProperty("searchproject"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		clickButton(getShowCaseThumbnail());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		// to get parent window id
		String par = driver.getWindowHandle();
		//to get all window id
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(10000);
				driver.close();
			}
			driver.switchTo().window(par);
		}
		
		Thread.sleep(5000);
		
		clickButton(getProjectThumbnail());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Actions a  = new Actions(driver);
		a.moveToElement(getUnitThumbNail()).build().perform();			
		Thread.sleep(5000);
		
		
		
	
	
			
	}	
	}
