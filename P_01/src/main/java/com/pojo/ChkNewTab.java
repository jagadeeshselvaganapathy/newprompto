package com.pojo;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ChkNewTab  extends BaseClass{
	public ChkNewTab() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;
	
	@FindBy(xpath = "(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//p[normalize-space()='Field Builder']")
	private WebElement fieldBuilder;
	
	@FindBy(xpath = "//button[@class='sc-bPilFr dWYEYF']")
	private WebElement customField;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addCustomField;

	@FindBy(xpath = "//input[@id='localizedFieldName']")
	private WebElement fieldName;
	
	@FindBy(xpath = "//input[@id='localizedFieldInstructions']")
	private WebElement fieldInstruction;
	
	@FindBy(xpath = "//button[normalize-space()='Create Field']")
	private WebElement createField;
	
	@FindBy(xpath = "//p[normalize-space()='USPs']")
	private WebElement uspTab;
	
	@FindBy(id = "button_toolbarCreateButton")
	private WebElement addNewUsp;
	
	@FindBy(xpath = "//input[@id='headline']")
	private WebElement uspHeadline;
	
	@FindBy(xpath = "//div[@data-slate-object='block']")
	private WebElement UspTextBox;
	
	@FindBy(xpath = "//button[normalize-space()='Create USP']")
	private WebElement uspCreateButton;
	
	@FindBy(xpath = "//p[normalize-space()='Units']")
	private WebElement unitTab;
	
	@FindBy(xpath = "//button[normalize-space()='Unit Types']")
	private WebElement unitTypes;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewUnitType;
	
	@FindBy(xpath = "//input[@id='name']")
	private WebElement unitTypeName;
	
	@FindBy(xpath = "//button[normalize-space()='Create Unit Type']")
	private WebElement createUnitType;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchFieldBuilder;
	
	public WebElement getsearchFieldBuilder() {
		return searchFieldBuilder;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}
	
	public WebElement getProjectOpen() {
		return projectOpen;
	}

	public WebElement getFieldBuilder() {
		return fieldBuilder;
	}

	public WebElement getCustomField() {
		return customField;
	}

	public WebElement getAddCustomField() {
		return addCustomField;
	}

	public WebElement getFieldName() {
		return fieldName;
	}

	public WebElement getFieldInstruction() {
		return fieldInstruction;
	}

	public WebElement getCreateField() {
		return createField;
	}

	public WebElement getUspTab() {
		return uspTab;
	}

	public WebElement getAddNewUsp() {
		return addNewUsp;
	}

	public WebElement getUspHeadline() {
		return uspHeadline;
	}

	public WebElement getUspTextBox() {
		return UspTextBox;
	}

	public WebElement getUspCreateButton() {
		return uspCreateButton;
	}

	public WebElement getUnitTab() {
		return unitTab;
	}

	public WebElement getUnitTypes() {
		return unitTypes;
	}

	public WebElement getAddNewUnitType() {
		return addNewUnitType;
	}

	public WebElement getUnitTypeName() {
		return unitTypeName;
	}

	public WebElement getCreateUnitType() {
		return createUnitType;
	}

	public void chkNewTab() throws InterruptedException, AWTException {

		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','20/01')", getsearchField());
		insertText(getsearchField(), "20/01");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		js.executeScript("arguments[0].click()", getProjectOpen());
		
		clickButton(getFieldBuilder());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getCustomField());
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getAddCustomField());
		Thread.sleep(5000);
		
//		js.executeScript("arguments[0].setAttribute('value','besttst')", getFieldName());
		insertText(getFieldName(), "besttst");
		Thread.sleep(5000);
//		
		insertText(getFieldInstruction(), "yyyy");
		Thread.sleep(7000);
		clickButton(getCreateField());
		Thread.sleep(10000);

		insertText(getsearchFieldBuilder(), "besttst");
		Thread.sleep(7000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		clickButton(getUspTab());
		Thread.sleep(15000);
		
		
		clickButton(getAddNewUsp());
		Thread.sleep(5000);
		insertText(getUspHeadline(), "Resttst");
		insertText(getUspTextBox(), "yyyy");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getUspCreateButton());
		Thread.sleep(7000);
	
		
		clickButton(getUnitTab());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getUnitTypes());
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		clickButton(getAddNewUnitType());
		Thread.sleep(5000);
		insertText(getUnitTypeName(), "besttst");
		Thread.sleep(5000);
		clickButton(getCreateUnitType());
		Thread.sleep(7000);

		
		
		
			}
	
	
	
}