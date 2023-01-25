package com.pojo;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseClass;

public class ClkShowcase extends BaseClass{
	public ClkShowcase() {
		PageFactory.initElements(driver, this);
	}
	

	
	
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//p[normalize-space()='Present project']")
	private WebElement presentProject;
	
	@FindBy(xpath = "//div[contains(text(),'Resources')]")
	private WebElement resourceTab;
	
	@FindBy(xpath = "//button[@id='fullscreenButton']")
	private WebElement fullScreen;
	
	@FindBy(xpath = "//div[@id='unitsButton']")
	private WebElement unitTab;
	
	@FindBy(xpath = "//label[normalize-space()='Filter Units']")
	private WebElement filterTab;
	
	@FindBy(xpath = "(//div[@class='sc-qPNpY eDmzVa'])[1]")
	private WebElement price;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	
	public WebElement getProjectOpen() {
		return projectOpen;
	}
	
	public WebElement getPresentProject() {
		return presentProject;
	}

	public WebElement getResourceTab() {
		return resourceTab;
	}

	public WebElement getFullScreen() {
		return fullScreen;
	}

	public WebElement getUnitTab() {
		return unitTab;
	}

	public WebElement getFilterTab() {
		return filterTab;
	}

	public WebElement getPrice() {
		return price;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}

	public void clkShowcase() throws AWTException, InterruptedException {
	
	
//	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(100));
//	w.until(ExpectedConditions.elementToBeClickable(getProjectOpen()));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getsearchField(), "20/01");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		js.executeScript("arguments[0].click()", getProjectOpen());

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	Thread.sleep(15000);
	clickButton(getPresentProject());
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	String par = driver.getWindowHandle();
	//to get all window id
	Set<String> all = driver.getWindowHandles();
	for (String x : all) {
		if (!par.equals(x)) {
			driver.switchTo().window(x);
			Thread.sleep(10000);
			clickButton(getResourceTab());
			Thread.sleep(10000);
			clickButton(getFullScreen());
			Thread.sleep(10000);
			clickButton(getUnitTab());
			Thread.sleep(10000);
			clickButton(getFilterTab());
			Thread.sleep(10000);
			js.executeScript("arguments[0].click()", getPrice());
			Thread.sleep(5000);
			driver.close();
		}
	}
	driver.switchTo().window(par);
	Thread.sleep(5000);
			
	
	
	
	
	
	
	
	
			
	}
	
	

}
