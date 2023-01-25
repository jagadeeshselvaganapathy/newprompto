package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkDragAndDrop extends BaseClass{
	public ClkDragAndDrop() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addProjectButton;
	
	@FindBy(id = "button_null")
	private WebElement dropArea;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//span[@class='UploadPrompt_browse__Ib2y9']")
	private WebElement uploadBrowse;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitButton;
	
	@FindBy(xpath = "//span[normalize-space()='Add new unit']")
	private WebElement addUnitButton;
	
	@FindBy(xpath = "//div[@class='sc-kkxqMQ ddIexW']")
	private WebElement uploadBrowsetwo;

		
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


	public void clkDragAndDrop() throws AWTException, InterruptedException {
		
	clickButton(getAddProjectButton());
	clickButton(getDropArea());
	Robot rb = new Robot();
	rb.delay(2000);
	
	StringSelection ss = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	clickButton(getCancelButton());
	
	
	
	
	clickButton(getProjectOpen());
	clickButton(getUploadBrowse());
    rb.delay(2000);
	
	StringSelection ss1 = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	clickButton(getUnitButton());
	clickButton(getAddUnitButton());
	clickButton(getUploadBrowsetwo());
    rb.delay(2000);
	
	StringSelection ss2 = new StringSelection("E:\\sample folder\\sample.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	
		
	}
	
	


	

}
