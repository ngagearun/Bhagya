package com.appname.businessscripts;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableSeleniumComponents;
import com.appname.constants.ConstantsforAppName;

public class AddItemToCart extends ReusableSeleniumComponents {
	
	
	@Test(priority=1,groups={"regression","smoke"})
	public void add_item_cart_for_evening_dresses() throws InterruptedException{
		mousehover(ConstantsforAppName.dresses);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ConstantsforAppName.evening_dresses)));
		click(ConstantsforAppName.evening_dresses);
		WebElement price_range=driver.findElement(By.id("layered_price_range"));
		JavascriptExecutor objname=(JavascriptExecutor) driver;
		 objname.executeScript("arguments[0].scrollIntoView(true);",price_range);
		 mousehover(ConstantsforAppName.printed_dresses);
		 click(ConstantsforAppName.Add_To_Cart);
		 Thread.sleep(5000);
		// click(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span"));
		 
	}
	
	
	@Test(priority=2,groups="smoke")
	public void add_item_cart_for_casual_dresses() throws InterruptedException{
		mousehover(ConstantsforAppName.dresses);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(ConstantsforAppName.casual_dresses)));
		click(ConstantsforAppName.casual_dresses);
		WebElement price_range=driver.findElement(By.id("layered_price_range"));
		JavascriptExecutor objname=(JavascriptExecutor) driver;
		 objname.executeScript("arguments[0].scrollIntoView(true);",price_range);
		 mousehover(ConstantsforAppName.printed_dresses);
		 click(ConstantsforAppName.Add_To_Cart);
		 Thread.sleep(5000);
		 click(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/span/span"));
		 
	}
	
	
	

}
