package com.pojo;

import java.awt.AWTException;
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

import com.base.BaseClass;

public class ClkChldObjs extends BaseClass{
		public ClkChldObjs() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "//span[normalize-space()='Settings']")
		private WebElement settingButton;
		
		@FindBy(xpath = "//div[@class='ImageUploadTrigger_trigger__icon__7sbv2 ImageUploadTrigger_trigger__icon--medium__2Xh0w']")
		private WebElement profileThumbNail;

		@FindBy(xpath = "//p[@class='DropZoneComponent_dropperText__2DAQq DropZoneComponent_addThumbnail__2RI6Z']")
		private WebElement dropArea;
		
		@FindBy(xpath = "//input[@id='firstName']")
		private WebElement firstName;
		
		@FindBy(xpath = "//input[@id='lastName']")
		private WebElement lastName;
		
		@FindBy(xpath = "(//button[@type='submit'])[1]")
		private WebElement saveButton;
		
		@FindBy(xpath = "(//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo'])[3]")
		private WebElement continueButton;
		
		public WebElement getContinueButton() {
			return continueButton;
		}
		
	public WebElement getSettingButton() {
			return settingButton;
		}

		public WebElement getProfileThumbNail() {
			return profileThumbNail;
		}

		public WebElement getDropArea() {
			return dropArea;
		}

		public WebElement getFirstName() {
			return firstName;
		}
		
		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}

	public void clkChldObjs() throws InterruptedException, AWTException, IOException {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		clickButton(getSettingButton());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		clickButton(getProfileThumbNail());
		Thread.sleep(5000);
		
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
		Thread.sleep(5000);
		clickButton(getContinueButton());
		Thread.sleep(15000);
		
		clickButton(getFirstName());
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].setAttribute('value','Tst')", getFirstName());
		insertText(getFirstName(), valueFromProperty("firstname"));
		Thread.sleep(5000);
		
		clickButton(getLastName());
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
//		js.executeScript("arguments[0].setAttribute('value','321')", getLastName());
		insertText(getLastName(), valueFromProperty("lastname"));
		Thread.sleep(10000);
		clickButton(getSaveButton());
		Thread.sleep(15000);
		
				
	}
		
		

}
