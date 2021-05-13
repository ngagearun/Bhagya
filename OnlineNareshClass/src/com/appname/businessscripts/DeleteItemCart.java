package com.appname.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableSeleniumComponents;
import com.appname.constants.ConstantsforAppName;

public class DeleteItemCart  extends ReusableSeleniumComponents{
	
	
	@BeforeClass
	public void navigatecartsummarypage(){
		driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a/b")).click();
	}
	
	
	@Test(priority=5,groups="smoke")
	public void delete_item_from_cart(){
	
		
		List<WebElement> products_list=driver.findElements(By.xpath("//*[@id='cart_summary']/tbody/tr/td[2]/small[1]"));
		int total_count=products_list.size();
        
        for(int i=0;i<total_count;i++){
        
               String text=products_list.get(i).getText();
               System.out.println("product Items is"+text);
               if(text.contains("demo_4")){
            	   driver.findElement(By.xpath("//*[@id='cart_summary']/tbody/tr['"+(i+1)+"']/td[7]")).click();
            	   break;
               }
               
        }
		
	}

}
