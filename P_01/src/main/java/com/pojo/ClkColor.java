package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
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

import com.base.BaseClass;

public class ClkColor extends BaseClass {
	public ClkColor() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@color='#209cea'])[1]")
	private WebElement statusColor;

	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;

	@FindBy(xpath = "//p[normalize-space()='Portfolio']")
	private WebElement portfolioTab;

	@FindBy(xpath = "(//*[@data-icon='eye-dropper'])[3]")
	private WebElement pencil;

	@FindBy(xpath = "//div[@class='react-colorful__pointer react-colorful__hue-pointer']")
	private WebElement color;

	@FindBy(xpath = "(//*[@aria-hidden='true'])[18]")
	private WebElement colorTick;

	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectSideBar;

	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOneTwo;

	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showCaseEditor;

	@FindBy(xpath = "//div[normalize-space()='Settings']")
	private WebElement settingsTab;

	@FindBy(xpath = "(//*[@data-icon='eye-dropper'])[1]")
	private WebElement pencilTwo;

	@FindBy(xpath = "//div[@class='react-colorful__pointer react-colorful__hue-pointer']")
	private WebElement colorTwo;

	@FindBy(xpath = "(//*[@aria-hidden='true'])[24]")
	private WebElement colorTickTwo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[7]/div[2]/div[1]/div[2]/input[1]")
	private WebElement colorcode;

	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;

	public WebElement getcolorcode() {
		return colorcode;
	}

	public WebElement getSettingButton() {
		return settingButton;
	}

	public WebElement getPortfolioTab() {
		return portfolioTab;
	}

	public WebElement getPencil() {
		return pencil;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getColorTick() {
		return colorTick;
	}

	public WebElement getProjectSideBar() {
		return projectSideBar;
	}

	public WebElement getProjectOneTwo() {
		return projectOneTwo;
	}

	public WebElement getShowCaseEditor() {
		return showCaseEditor;
	}

	public WebElement getSettingsTab() {
		return settingsTab;
	}

	public WebElement getPencilTwo() {
		return pencilTwo;
	}

	public WebElement getColorTwo() {
		return colorTwo;
	}

	public WebElement getColorTickTwo() {
		return colorTickTwo;
	}

	public WebElement getsearchField() {
		return searchField;
	}

	public void clkColor() throws InterruptedException, AWTException, IOException {

		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String value2 = statusColor.getCssValue("background-color");
		if (value2.equals("rgba(32, 156, 234, 1)")) {
			System.out.println("color verified");
		} else {
			System.out.println("color not verified");
		}
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		

		clickButton(getSettingButton());
		Thread.sleep(5000);
		clickButton(getPortfolioTab());
		Thread.sleep(5000);
		clickButton(getPencil());
		Thread.sleep(10000);
		Actions a = new Actions(driver);
		a.dragAndDropBy(getColor(), 50, 0).build().perform();
		Thread.sleep(5000);
		clickButton(getColorTick());
		

		Thread.sleep(5000);
		clickButton(getProjectSideBar());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		js.executeScript("arguments[0].click()", getProjectOneTwo());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Thread.sleep(5000);
		clickButton(getShowCaseEditor());
		Thread.sleep(5000);
		clickButton(getSettingsTab());
		Thread.sleep(5000);
		clickButton(getPencilTwo());
		Thread.sleep(8000);

		clickButton(getcolorcode());
		Robot rb = new Robot();
		StringSelection ss = new StringSelection(valueFromProperty("color"));
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		clickButton(getColorTickTwo());
		Thread.sleep(5000);

	}

}