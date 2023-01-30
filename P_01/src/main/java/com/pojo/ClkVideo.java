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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkVideo extends BaseClass{
	public ClkVideo() {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//span[normalize-space()='Add Media']")
	private WebElement addMedia;
	
	@FindBy(xpath = "//span[normalize-space()='Upload files']")
	private WebElement uploadFile;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitButton;
		
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement firstUnitTab;
	
	@FindBy(xpath = "(//*[@data-icon='photo-video'])[2]")
	private WebElement mediaIcon;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]")
	private WebElement browseVideo;
	
	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showcaseEditor;
	
	@FindBy(xpath = "//div[normalize-space()='Intro video']")
	private WebElement introVideo;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]")
	private WebElement sampleVideo;
	
	@FindBy(xpath = "( //div[normalize-space()='Set as intro video'])[2]")
	private WebElement setIntoVideo;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	@FindBy(xpath = "( //div[normalize-space()='Clear'])[2]")
	private WebElement clearIntroVideo;
	
	
	
	
	public WebElement getClearIntroVideo() {
		return clearIntroVideo;
	}



	public WebElement getSearchField() {
		return searchField;
	}



	public WebElement getProjectOpen() {
		return projectOpen;
	}



	public WebElement getAddMedia() {
		return addMedia;
	}



	public WebElement getUploadFile() {
		return uploadFile;
	}



	public WebElement getUnitButton() {
		return unitButton;
	}



	public WebElement getFirstUnitTab() {
		return firstUnitTab;
	}



	public WebElement getMediaIcon() {
		return mediaIcon;
	}



	public WebElement getBrowseVideo() {
		return browseVideo;
	}



	public WebElement getShowcaseEditor() {
		return showcaseEditor;
	}



	public WebElement getIntroVideo() {
		return introVideo;
	}



	public WebElement getSampleVideo() {
		return sampleVideo;
	}



	public WebElement getSetIntoVideo() {
		return setIntoVideo;
	}



	public void clkVideo() throws AWTException, InterruptedException, IOException {
		
		Thread.sleep(30000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		insertText(getSearchField(), valueFromProperty("projectname"));
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		js.executeScript("arguments[0].click()", getProjectOpen());
		Thread.sleep(15000);
		
		
		clickButton(getAddMedia());
		js.executeScript("arguments[0].click()", getUploadFile());
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(25000);
		
		
		clickButton(getUnitButton());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getFirstUnitTab());
		Thread.sleep(10000);
		clickButton(getMediaIcon());
		Thread.sleep(15000);
		clickButton(getBrowseVideo());
        rb.delay(2000);
		
		StringSelection ss1 = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.mp4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(25000);
		
		
		clickButton(getShowcaseEditor());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getIntroVideo());
		Thread.sleep(20000);
		Actions a = new Actions(driver);
		a.moveToElement(getSampleVideo()).build().perform();
		Thread.sleep(5000);
		getSampleVideo().findElement(By.xpath("( //div[normalize-space()='Set as intro video'])[2]")).click();
		Thread.sleep(10000);
		clickButton(getClearIntroVideo());
		Thread.sleep(10000);
		
		
		
	
			
	}
	
	

}
