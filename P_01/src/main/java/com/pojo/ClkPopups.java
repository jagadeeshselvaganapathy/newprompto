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

public class ClkPopups  extends BaseClass{
	public ClkPopups() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Open live chat']")
	private WebElement helpButton;
	
	@FindBy(xpath = "//button[@aria-label='Close live chat']")
	private WebElement helpButtonClose;
	
	@FindBy(xpath = "(//button[normalize-space()='Add new project'])[1]")
	private WebElement addNewProject;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;

	@FindBy(xpath = "(//button[@class='ProjectCard_actionButton__2yTLi'])[1]")
	private WebElement marketPage;
	
	@FindBy(xpath = "//*[@data-icon='share-alt']")
	private WebElement shareIcon;
	
	@FindBy(xpath = "(//*[@data-icon='times'])[1]")
	private WebElement closeShareIcon;
	
	@FindBy(xpath = "//span[normalize-space()='Portfolio']")
	private WebElement portfolioTab;
	
	@FindBy(xpath = "//*[@data-icon='magic']")
	private WebElement wizardButton;
	
	@FindBy(xpath = "//*[@data-icon='times']")
	private WebElement closeWizard;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	private WebElement sortButton;
	
	@FindBy(xpath = "(//button[normalize-space()='Cancel'])[1]")
	private WebElement cancelSort;
	
	@FindBy(xpath = "//iframe[@id='hubspot-conversations-iframe']")
	private WebElement iframeSwich;
	
	@FindBy(xpath = "//input[@id='searchField']")
	private WebElement searchField;


	public WebElement getHelpButton() {
		return helpButton;
	}
	
	public WebElement getHelpButtonClose() {
		return helpButtonClose;
	}

	public WebElement getAddNewProject() {
		return addNewProject;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getMarketPage() {
		return marketPage;
	}

	public WebElement getShareIcon() {
		return shareIcon;
	}

	public WebElement getCloseShareIcon() {
		return closeShareIcon;
	}

	public WebElement getPortfolioTab() {
		return portfolioTab;
	}

	public WebElement getWizardButton() {
		return wizardButton;
	}

	public WebElement getCloseWizard() {
		return closeWizard;
	}

	public WebElement getSortButton() {
		return sortButton;
	}

	public WebElement getCancelSort() {
		return cancelSort;
	}
	
	public WebElement getIframeSwich() {
		return iframeSwich;
	}
	
	public WebElement getsearchField() {
		return searchField;
	}

	public void clkPopups() throws InterruptedException, AWTException, IOException {

		Thread.sleep(30000);
		
		driver.switchTo().frame(getIframeSwich());
		clickButton(getHelpButton());
		Thread.sleep(5000);
		clickButton(getHelpButtonClose());
		Thread.sleep(5000);
		String par2 = driver.getWindowHandle();
		driver.switchTo().window(par2);
		Thread.sleep(5000);
		clickButton(getAddNewProject());
		Thread.sleep(5000);
		clickButton(getCancelButton());
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		insertText(getsearchField(), valueFromProperty("projectname"));
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		clickButton(getMarketPage());
		// to get parent window id
		String par = driver.getWindowHandle();
		//to get all window id
		Set<String> all = driver.getWindowHandles();
		for (String x : all) {
			if (!par.equals(x)) {
				driver.switchTo().window(x);
				Thread.sleep(7000);
				clickButton(getShareIcon());
				Thread.sleep(7000);
				clickButton(getCloseShareIcon());
				driver.close();
			}driver.switchTo().window(par);
		}Thread.sleep(5000);

		clickButton(getPortfolioTab());
		// to get parent window id
				String par1 = driver.getWindowHandle();
				//to get all window id
				Set<String> all1 = driver.getWindowHandles();
				for (String x1 : all1) {
					if (!par1.equals(x1)) {
						driver.switchTo().window(x1);
						Thread.sleep(5000);
						clickButton(getWizardButton());
						Thread.sleep(5000);
						clickButton(getCloseWizard());
						Thread.sleep(10000);
				//		JavascriptExecutor js = (JavascriptExecutor) driver;
				//		js.executeScript("arguments[0].click()", getSortButton());
						clickButton(getSortButton());
						Thread.sleep(5000);
						clickButton(getCancelSort());
						driver.close();
					}driver.switchTo().window(par);
				}
		Thread.sleep(5000);

			
	}
	
	
	
}