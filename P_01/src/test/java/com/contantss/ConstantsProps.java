package com.contantss;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class ConstantsProps extends BaseClass{
	
	@AfterStep
	public void attachScreenshot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			byte[] sh = screenshot.getScreenshotAs(OutputType.BYTES);
			s.attach(sh, "image/png", "ScreenShot");
	
		}
	
	}
	

}
