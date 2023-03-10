package com.TestClasses;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.noteb.pomclass.FilterFunctionPOM;
import com.noteb.pomclass.HomePagePOM;

public class TC_001VerifyBudgetFilter extends Testbaseclass
{
	
	@Test
	public void VerifyLogineFunct() throws InterruptedException
	{
		//check if the BudjetFilter is displayed or not
		
		
		HomePagePOM X=new HomePagePOM(driver);
		
		WebElement FilterButton=X.budgetfilter;
				
		Assert.assertTrue(FilterButton.isDisplayed());
		
		X.clickonbudgetfilter();
	
		
		
		
		FilterFunctionPOM Y=new FilterFunctionPOM(driver);
	    Y.BudgetFilter("310","1520");
	    
	    Y.ClickOnSubmitButton();
	    
	    //Verify the BudjetFilter Returns all laptops with the set budjet
	    
	    List<WebElement> laptopList=driver.findElements(By.className("laptop"));
	    for(WebElement laptop : laptopList)
	    {
	    	WebElement price = laptop.findElement(By.className("price"));
	    	double laptopPrice = Double.parseDouble(price.getText().replace(",","").repeat(0));
	    	Assert.assertTrue(laptopPrice >=310 && laptopPrice <=1520);
	    }
	    
	    
		
	}
	
	

}
