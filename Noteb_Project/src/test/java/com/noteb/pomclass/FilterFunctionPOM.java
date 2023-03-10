package com.noteb.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterFunctionPOM 
{
	
	
	WebDriver driver;

	@FindBy(xpath="//input[@id='bdgminadv']")
	WebElement MinimumValue;
	
	@FindBy(xpath="//input[@id='bdgmaxadv']")
	WebElement MaxValue;
	
	@FindBy(xpath="//select[@id='currencyadv']")
	WebElement CurrencyFiled;
	
	
	@FindBy(xpath="(//div[@class='noUi-touch-area'])[9]")
	WebElement Min_Slider;
	
	
	
	
	public void SetMin_Slider()
	{
		Actions act=new Actions(driver);
		
		System.out.println("Location Of Min_Slider"+Min_Slider.getLocation());
		System.out.println("Height & Width Of Min_Slide"+Min_Slider.getSize());
		
		
		act.dragAndDropBy(Min_Slider, 490,1000).perform();
		
	}
	
	
	
	
	@FindBy(xpath="//input[@id='submitformid']")
	WebElement Submit;
	
	public void BudgetFilter(String Min,String Max)
	{
		MinimumValue.clear();
		MinimumValue.sendKeys(Min);
		
		MaxValue.clear();
		MaxValue.sendKeys(Max);
		
	}
	
	public void ClickOnSubmitButton()
	{
		Submit.click();
	}
	 public FilterFunctionPOM(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	

}
