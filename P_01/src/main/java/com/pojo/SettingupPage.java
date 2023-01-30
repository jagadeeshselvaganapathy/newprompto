package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.google.common.util.concurrent.ClosingFuture.ClosingCallable;

public class SettingupPage extends BaseClass{
	
	public SettingupPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]")
	private WebElement ongoingStatus;
	
	@FindBy(id = "profileCard")
	private WebElement editProject;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//div[contains(text(),'Draft')]")
	private WebElement draftStatusText;
	
	@FindBy(xpath = "//span[normalize-space()='Update project']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[@id='sidebarButton_settings']")
	private WebElement settingTab;
	
	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveButtonProfile;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectTab;
	
	@FindBy(xpath = "//p[normalize-space()='Portfolio']")
	private WebElement portfolioTab;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]")
	private WebElement pencil;
	
	@FindBy(xpath = "//div[@class='react-colorful__pointer react-colorful__hue-pointer']")
	private WebElement color;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[3]/div[2]")
	private WebElement colorTick;
	
	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showCaseEditor;
	
	@FindBy(xpath = "//div[normalize-space()='Intro video']")
	private WebElement introVideo;
	
	@FindBy(xpath = "(//div[normalize-space()='Clear'])[2]")
	private WebElement clearVideo;
	
	@FindBy(xpath = "//div[normalize-space()='Settings']")
	private WebElement settingsTab;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[6]/div[2]/div[1]/div[3]/div[1]")
	private WebElement pencilTwo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[6]/div[2]/div[1]/div[2]/input[1]")
	private WebElement colorTwo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[6]/div[2]/div[1]/div[3]/div[2]")
	private WebElement colorTickTwo;

	@FindBy(xpath = "//input[@spellcheck='false']")
	private WebElement colorcode;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]")
	private WebElement sampleVideo;

	
	public WebElement getClearVideo() {
		return clearVideo;
	}
	
	public WebElement getIntroVideo() {
		return introVideo;
	}
	
	public WebElement getShowCaseEditor() {
		return showCaseEditor;
	}
	
	public WebElement getProjectTab() {
		return projectTab;
	}
	
	public WebElement getdraftStatusText() {
		return draftStatusText;
	}

	
	public WebElement getProjectStatus() {
		return projectStatus;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getProjectOpen() {
		return projectOpen;
	}

	public WebElement getOngoingStatus() {
		return ongoingStatus;
	}
	
	public WebElement getEditProject() {
		return editProject;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
	
	
	public WebElement getSettingTab() {
		return settingTab;
	}


	public void setSettingTab(WebElement settingTab) {
		this.settingTab = settingTab;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}


	public WebElement getSaveButtonProfile() {
		return saveButtonProfile;
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
	
	public WebElement getcolorcode() {
		return colorcode;
	}
	
	public WebElement getSampleVideo() {
		return sampleVideo;
	}






	public void method() throws IOException, InterruptedException, AWTException {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getSearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String text = getOngoingStatus().getText();
		if (text.equals("ONGOING")) {
			js.executeScript("arguments[0].click()", getProjectOpen());
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			clickButton(getEditProject());
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			clickButton(getProjectStatus());
			Thread.sleep(5000);
			js.executeScript("arguments[0].click()", getdraftStatusText());
			Thread.sleep(10000);
			clickButton(getSaveButton());
			Thread.sleep(10000);	
		} else {
			System.out.println("no");
		}
		
		Thread.sleep(10000);
		clickButton(getSettingTab());
		Thread.sleep(5000);
		
		clickButton(getFirstName());
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
		insertText(getFirstName(), "TestProjectT");
		Thread.sleep(5000);
		
		clickButton(getLastName());
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
		insertText(getLastName(), "004");
		Thread.sleep(10000);
		clickButton(getSaveButtonProfile());
		Thread.sleep(15000);
		
		clickButton(getPortfolioTab());
		Thread.sleep(10000);
		clickButton(getPencil());
		Thread.sleep(10000);
		
		
		clickButton(getcolorcode());
		
		StringSelection ss1 = new StringSelection("ab5c4d");
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
		
		
		Actions a = new Actions(driver);
//		a.dragAndDropBy(getColor(), -49, 0).build().perform();
//		Thread.sleep(5000);
		clickButton(getColorTick());
		Thread.sleep(10000);
		clickButton(getProjectTab());
		
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
		insertText(getSearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		js.executeScript("arguments[0].click()", getProjectOpen());
		Thread.sleep(10000);
		clickButton(getShowCaseEditor());
		
//		Actions a = new Actions(driver);
			
	Thread.sleep(10000);
		clickButton(getSettingsTab());
		Thread.sleep(10000);
		clickButton(getPencilTwo());
		Thread.sleep(8000);

		clickButton(getcolorcode());
	
		StringSelection ss = new StringSelection("7d00eb");
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
