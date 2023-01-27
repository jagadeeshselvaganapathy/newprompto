package com.pojo;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkIcons extends BaseClass{
		public ClkIcons() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]")
		private WebElement tutorialButton;

		@FindBy(xpath = "//iframe[@title='Modal']")
		private WebElement iframeSwich;
		
		@FindBy(xpath = "//a[@class='appcues-button-success appcues-button']")
		private WebElement goButton;
		
		@FindBy(xpath = "//a[normalize-space()='No thanks']")
		private WebElement noThanks;
		
		@FindBy(xpath = "//button[@id='sidebarButton_portfolio']")
		private WebElement showCaseThumbnail;
		
		@FindBy(xpath = "//input[@id='searchField']")
		private WebElement searchField;
		
		@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
		private WebElement projectOpen;
		
		@FindBy(xpath = "(//*[name()='svg'])[8]")
		private WebElement pencilEditProject;
		
		@FindBy(xpath = "//button[@id='sidebarButton_projects']")
		private WebElement projectThumbnail;
	
		
		public WebElement getPencilEditProject() {
			return pencilEditProject;
		}
		
		
	public WebElement getTutorialButton() {
			return tutorialButton;
		}



		public WebElement getIframeSwich() {
			return iframeSwich;
		}



		public WebElement getGoButton() {
			return goButton;
		}



		public WebElement getNoThanks() {
			return noThanks;
		}



		public WebElement getShowCaseThumbnail() {
			return showCaseThumbnail;
		}



		public WebElement getsearchField() {
			return searchField;
		}
		
		public WebElement getProjectOpen() {
			return projectOpen;
		}
		
		public WebElement getProjectThumbnail() {
			return projectThumbnail;
		}



	public void clkIcons() throws InterruptedException, IOException {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getTutorialButton());
		Thread.sleep(5000);
		driver.switchTo().frame(getIframeSwich());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getGoButton());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getNoThanks());
		Thread.sleep(5000);
		
		
		clickButton(getShowCaseThumbnail());
		// to get parent window id
				String par = driver.getWindowHandle();
				//to get all window id
				Set<String> all = driver.getWindowHandles();
				for (String x : all) {
					if (!par.equals(x)) {
						driver.switchTo().window(x);
						Thread.sleep(7000);
						driver.close();
					}driver.switchTo().window(par);
				}
				Thread.sleep(5000);
				
		insertText(getsearchField(), valueFromProperty("projectname"));		
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		js.executeScript("arguments[0].click()", getProjectOpen());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getPencilEditProject());
		Thread.sleep(5000);
		clickButton(getProjectThumbnail());
		Thread.sleep(10000);
				
		
	}
		
		

}
