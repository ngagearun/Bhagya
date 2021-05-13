package com.appname.businessscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class ContactPage extends ReusableSeleniumComponents {
	
	@BeforeClass
	public void clickoncontactuslink(){
		driver.findElement(By.xpath("//*[@id='contact-link']/a")).click();	
	}
	
	@Test(priority=3,groups="regression")
	public void validate_email_error_message() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id='submitMessage']/span")).click();
		Thread.sleep(4000);
		boolean status=isDisplayed(By.xpath("//*[@id='center_column']/div/ol/li"));
		System.out.println(status);
	}
	
	@Test(priority=4,groups="smoke")
	public void send_query_for_product_item() throws InterruptedException{
		Thread.sleep(4000);
		WebElement subj_heading=driver.findElement(By.xpath("//*[@id='id_contact']"));
		JavascriptExecutor objname=(JavascriptExecutor) driver;
		 objname.executeScript("arguments[0].scrollIntoView(true);",subj_heading);
		select_value_dropdown(By.xpath("//*[@id='id_contact']"), "Webmaster");
		sendText(By.xpath("//*[@id='email']"), "tcs@gmail.com");
		sendText(By.xpath("//*[@id='id_order']"), "ORD321344");
		sendText(By.xpath("//*[@id='message']"), "Querying about product for ORD321344");
		driver.findElement(By.xpath("//*[@id='submitMessage']/span")).click();
	}

}
