package com.noteb.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM 
{
	 WebDriver driver;
	 
	 @FindBy(xpath="//img[@class='controlSvg']")
	 
	public WebElement budgetfilter;
	 
	 public void clickonbudgetfilter()
	 {
		 
		 
		 budgetfilter.click();
		 
		 
	 }
	 
	 

	 public HomePagePOM(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 

}
