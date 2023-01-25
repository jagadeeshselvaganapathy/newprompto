package com.stepdefinition;

import java.io.IOException;
import java.time.Duration;

import com.base.BaseClass;

import io.cucumber.java.After;
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

	//	TakesScreenshot screenshot = (TakesScreenshot) driver;
	//	byte[] sh = screenshot.getScreenshotAs(OutputType.BYTES);
	//	s.embed(sh, "image/png");

		driver.manage().deleteAllCookies();
		driver.quit();
		
	}

}
