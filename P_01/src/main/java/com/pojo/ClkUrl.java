package com.pojo;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkUrl  extends BaseClass{
	public ClkUrl() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "//p[normalize-space()='Portfolio']")
	private WebElement portfolioTab;
	
	@FindBy(xpath = "(//div[@class='Checkbox Checkbox_checkbox__2pNqg unchecked'])[1]")
	private WebElement publicViewCheckBox;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectButtonSidebar;

	@FindBy(xpath = "(//*[name()='svg'][@height='1em'][@width='1em'])[5]")
	private WebElement projectClick;
	
	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showcaseEditor;
	
	@FindBy(xpath = "//p[normalize-space()='Present project']v")
	private WebElement presentProject;
	
	@FindBy(xpath = "//div[@class='sc-jWsAeH gHhLRo']")
	private WebElement shareButton;
	
	@FindBy(xpath = "//div[@class='sc-oUnPI iVVzrr']")
	private WebElement closeShareButton;
	

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


	public WebElement getProjectClick() {
		return projectClick;
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


	public void clkUrl() throws InterruptedException, AWTException {


		clickButton(getSettingButton());
		clickButton(getPortfolioTab());
		clickButton(getPublicViewCheckBox());
		clickButton(getProjectButtonSidebar());
		clickButton(getProjectClick());
		clickButton(getShowcaseEditor());
		clickButton(getPresentProject());
		// to get parent window id
				String par = driver.getWindowHandle();
				//to get all window id
				Set<String> all = driver.getWindowHandles();
				for (String x : all) {
					if (!par.equals(x)) {
						driver.switchTo().window(x);
						Thread.sleep(5000);
						clickButton(getShareButton());
						Thread.sleep(5000);
						clickButton(getCloseShareButton());
						driver.close();
					}
				}Thread.sleep(5000);
		
	
	}
	
	
	
}