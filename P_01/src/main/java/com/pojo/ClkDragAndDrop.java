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

public class ClkDragAndDrop extends BaseClass{
	public ClkDragAndDrop() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//span[normalize-space()='Add new project']")
	private WebElement addProjectButton;
	
	@FindBy(id = "button_null")
	private WebElement dropArea;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "(//div[normalize-space()='Browse Files'])[1]")
	private WebElement uploadBrowse;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitButton;
	
	@FindBy(xpath = "//span[normalize-space()='Add new unit']")
	private WebElement addUnitButton;
	
	@FindBy(xpath = "//div[normalize-space()='Browse Files']")
	private WebElement uploadBrowsetwo;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;

		
	public WebElement getAddProjectButton() {
		return addProjectButton;
	}


	public WebElement getDropArea() {
		return dropArea;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}


	public WebElement getProjectOpen() {
		return projectOpen;
	}


	public WebElement getUploadBrowse() {
		return uploadBrowse;
	}


	public WebElement getUnitButton() {
		return unitButton;
	}


	public WebElement getAddUnitButton() {
		return addUnitButton;
	}


	public WebElement getUploadBrowsetwo() {
		return uploadBrowsetwo;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}


	public void clkDragAndDrop() throws AWTException, InterruptedException, IOException {
	
		Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	clickButton(getAddProjectButton());
	clickButton(getDropArea());
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection ss = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\profile.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(10000);
	clickButton(getCancelButton());
	
	
	Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	insertText(getsearchField(), valueFromProperty("projectname"));
	Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	js.executeScript("arguments[0].click()", getProjectOpen());
	Thread.sleep(15000);
	clickButton(getUploadBrowse());
    rb.delay(2000);
	
	StringSelection ss1 = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\profile.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	Thread.sleep(20000);
	
	clickButton(getUnitButton());
	Thread.sleep(10000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	clickButton(getAddUnitButton());
	Thread.sleep(10000);
	clickButton(getUploadBrowsetwo());
    rb.delay(2000);
	
	StringSelection ss2 = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\sample.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(20000);
	}
	
	


	

}
