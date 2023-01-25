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

public class ClkSort extends BaseClass {
	public ClkSort() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='ProjectCard_actionButton__2yTLi'])[1]")
	private WebElement showcaseButton;

	@FindBy(xpath = "//div[@id='unitsButton']")
	private WebElement unitTab;

	@FindBy(xpath = "//div[@class='sc-ptdGt ePHOSB']")
	private WebElement sortBy;

	@FindBy(xpath = "//li[normalize-space()='Unit name']")
	private WebElement unitName;

	@FindBy(xpath = "//li[normalize-space()='Ascending']")
	private WebElement ascendingOrder;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;

	public WebElement getAscendingOrder() {
		return ascendingOrder;
	}

	public WebElement getShowcaseButton() {
		return showcaseButton;
	}

	public WebElement getUnitTab() {
		return unitTab;
	}

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getUnitName() {
		return unitName;
	}
	public WebElement getsearchField() {
		return searchField;
	}

	public void clkSort() throws AWTException, InterruptedException {
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		insertText(getsearchField(), "20/01");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getShowcaseButton());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String par = driver.getWindowHandle();
		// to get all window id
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(10000);
				clickButton(getUnitTab());
				Thread.sleep(10000);
				clickButton(getSortBy());
				Thread.sleep(5000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()", getUnitName());
				Thread.sleep(5000);
				js.executeScript("arguments[0].click()", getAscendingOrder());
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(par);
		Thread.sleep(5000);

	}

}
