package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewProject;

	@FindBy(xpath = "(//div[@class='sc-gHjyzD DkGjD'])[1]/parent::div")
	private WebElement ongoingColorCheck;

	@FindBy(xpath = "//div[@class='sc-jlRLRk cbTvaY css-2b097c-container']")
	private WebElement projectStatus;

	@FindBy(xpath = "//div[@class='sc-jlRLRk cbTvaY css-2b097c-container']")
	private WebElement ongoingStatus;

	@FindBy(xpath = "//input[@id='projectTitle']")
	private WebElement projectName;

	@FindBy(xpath = "//input[@placeholder='Enter an address']")
	private WebElement projectAddress;

	@FindBy(xpath = "//span[normalize-space()='Add project']")
	private WebElement addProject;

	@FindBy(xpath = "(//div[@class='sc-gHjyzD DkGjD'])[1]")
	private WebElement statusColor;
	
	


	@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
	private WebElement projectOne;

	@FindBy(xpath = "(//*[name()='svg'])[8]")
	private WebElement editProject;

	@FindBy(xpath = "//span[normalize-space()='Archive']")
	private WebElement archiveButton;

	@FindBy(xpath = "//span[normalize-space()='Archive project']")
	private WebElement archiveProjectButton;

	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;

	@FindBy(xpath = "//p[normalize-space()='Portfolio']")
	private WebElement portfolioTab;

	@FindBy(xpath = "(//*[@class='svg-inline--fa fa-eye-dropper fa-1x sc-jathZL sc-lhqAt hFDkux'])[3]")
	private WebElement pencil;

	@FindBy(xpath = "//div[@class='react-colorful__pointer react-colorful__hue-pointer']")
	private WebElement color;

	@FindBy(xpath = "//*[@class='svg-inline--fa fa-check fa-1x sc-jathZL sc-lhqAt hFDkux']")
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

	@FindBy(xpath = "//*[@class='svg-inline--fa fa-check fa-1x sc-jathZL sc-lhqAt hFDkux']")
	private WebElement colorTickTwo;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[7]/div[2]/div[1]/div[2]/input[1]")
	private WebElement colorcode;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;


	

	public WebElement getcolorcode() {
		return colorcode;
	}
	
	public WebElement getAddNewProject() {
		return addNewProject;
	}

	public WebElement getProjectStatus() {
		return projectStatus;
	}

	public WebElement getOngoingStatus() {
		return ongoingStatus;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getProjectAddress() {
		return projectAddress;
	}

	public WebElement getAddProject() {
		return addProject;
	}

	public WebElement getProjectOne() {
		return projectOne;
	}

	public WebElement getEditProject() {
		return editProject;
	}

	public WebElement getArchiveButton() {
		return archiveButton;
	}

	public WebElement getArchiveProjectButton() {
		return archiveProjectButton;
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

	public void clkColor() throws InterruptedException, AWTException {

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
		// clickButton(getColor());
		System.out.println("yes");
		Thread.sleep(5000);
		clickButton(getColorTick());

		Thread.sleep(5000);
		clickButton(getProjectSideBar());
		Thread.sleep(10000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getsearchField(), "20/01");
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
		StringSelection ss = new StringSelection("25d991");
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
		
		
//		js.executeScript("arguments[0].setAttribute('value','ab4666')", getColor());
//		insertText(getColor(), "ab4666");
	//	a.dragAndDropBy(getColorTwo(), 50, 0).build().perform();
		System.out.println("yes");
		Thread.sleep(5000);
		clickButton(getColorTickTwo());
		Thread.sleep(5000);

	}

}