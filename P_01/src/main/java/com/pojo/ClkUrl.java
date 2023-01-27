package com.pojo;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkUrl extends BaseClass {
	public ClkUrl() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;

	@FindBy(xpath = "//p[normalize-space()='Portfolio']")
	private WebElement portfolioTab;

	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	private WebElement publicViewCheckBox;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]")
	private WebElement publicViewUncheckBox;

	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectButtonSidebar;

	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;

	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showcaseEditor;

	@FindBy(xpath = "//p[normalize-space()='Present project']")
	private WebElement presentProject;

	@FindBy(xpath = "//*[@data-icon='share-alt']")
	private WebElement shareButton;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/*[name()='svg'][1]")
	private WebElement closeShareButton;

	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;

	public WebElement getpublicViewUncheckBox() {
		return publicViewUncheckBox;
	}

	public WebElement getSettingButton() {
		return settingButton;
	}

	public WebElement getPortfolioTab() {
		return portfolioTab;
	}

	public WebElement getPublicViewCheckBox() {
		return publicViewCheckBox;
	}

	public WebElement getProjectButtonSidebar() {
		return projectButtonSidebar;
	}

	public WebElement getProjectOpen() {
		return projectOpen;
	}

	public WebElement getShowcaseEditor() {
		return showcaseEditor;
	}

	public WebElement getPresentProject() {
		return presentProject;
	}

	public WebElement getShareButton() {
		return shareButton;
	}

	public WebElement getCloseShareButton() {
		return closeShareButton;
	}

	public WebElement getsearchField() {
		return searchField;
	}

	public void clkUrl() throws InterruptedException, AWTException, IOException {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getSettingButton());
		Thread.sleep(8000);
		clickButton(getPortfolioTab());
		Thread.sleep(8000);
		clickButton(getPublicViewCheckBox());
		Thread.sleep(8000);
		clickButton(getpublicViewUncheckBox());
		Thread.sleep(8000);
		clickButton(getProjectButtonSidebar());

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		js.executeScript("arguments[0].click()", getProjectOpen());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getShowcaseEditor());
		Thread.sleep(20000);

		clickButton(getPresentProject());
		Thread.sleep(10000);
		// to get parent window id
		String par = driver.getWindowHandle();
		// to get all window id
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(8000);
				clickButton(getShareButton());
				Thread.sleep(8000);
				clickButton(getCloseShareButton());
				driver.close();
			}
			driver.switchTo().window(par);
		}
		Thread.sleep(5000);

	}

}