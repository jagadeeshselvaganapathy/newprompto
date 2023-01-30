package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {

	@Before
	public void beforeExecution() throws IOException {
/*
		try {
			if (driver == null) {
				lanchBrowser();
				loadUrl(valueFromProperty("url"));
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

*/
	}

	@After
	public void afterExecution(Scenario s) {

	
          if (s.isFailed()) {
			
			TakesScreenshot screenshot = (TakesScreenshot)driver;
			byte[] sh = screenshot.getScreenshotAs(OutputType.BYTES);
			s.attach(sh, "image/png", "ScreenShot");
	
		}
	

		driver.manage().deleteAllCookies();
		driver.quit();
    	
	}
    



}
