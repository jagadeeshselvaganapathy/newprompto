package com.brows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://devapp.prompto.com/en/projects/mP6KrpvAs5/projectShowcase");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.findElement(By.id("username")).sendKeys("nishma+01@qaoncloud.com");
			driver.findElement(By.id("password")).sendKeys("test@123");
			driver.findElement(By.id("button_signInButton")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			Thread.sleep(10000);
			driver.findElement(By.xpath("//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")).click();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
			Thread.sleep(7000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
	
			//((JavascriptExecutor) driver).executeScript("document.getElementById('locatorid').style.backgroundColor = 'lightblue';");
	
			
			
			
			System.out.println("click");
			
			

			
			
			
			
		
			
	}}
