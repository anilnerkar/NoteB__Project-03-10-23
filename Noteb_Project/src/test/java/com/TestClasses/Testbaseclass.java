package com.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testbaseclass 

{
	WebDriver driver;
	@BeforeMethod
	public void SetUp()
	
	{
		//opening ChromeBrowser
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.noteb.com");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		
	}

}
