package com.applicationname.reusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.appname.constants.ConstantsforAppName;

public class ReusableSeleniumComponents {
	
	public static WebDriver  driver;
	

	FileInputStream fi;
	Properties prop;
	
	@BeforeTest(groups={"regression","smoke"})
	public void prelaunchsetup() throws IOException{
		fi=new FileInputStream(ConstantsforAppName.Property_filename);
		prop=new Properties();
		prop.load(fi);
		launchbrowser(prop.getProperty("browsername"));
		appurl(prop.getProperty("url"), "");
	}
	
	@AfterTest(groups={"regression","smoke"})
	public void tearDown(){
		
		driver.close();
	}
	
	
	
	public static void launchbrowser(String browsername){
		 //launch the browser
		if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
	  }else if(browsername.equalsIgnoreCase("firefox")){
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();  
	  }
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void appurl(String urlname,String stepname){
		
		driver.get(urlname);
		
		
	}
	
	public static void sendText(By locatorname,String value){
		
		driver.findElement(locatorname).sendKeys(value);
	}
	
	public static  String getTitle(){
		return driver.getTitle();
	}
	
	
	
	
	public static void sendText(By locatorname,String value,String stepname){
		
		driver.findElement(locatorname).sendKeys(value);
	}
	
	public static void alert(){
		driver.switchTo().alert().accept();
		
	}
	public static void click(By locatorname){
		driver.findElement(locatorname).click();
	}
	
	public static void select_value_dropdown(By locatorname,String text){
		
		Select select=new Select(driver.findElement(locatorname));
		select.selectByVisibleText(text);
	}
	
	
	
	public static void mousehover(By locatorname){
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(locatorname);
		action.moveToElement(ele).perform();
	}
	
	public static String readText(By locatorname){
		return driver.findElement(locatorname).getText();
	}
	
	public static boolean isDisplayed(By locatorname){
		
		return driver.findElement(locatorname).isDisplayed();
	}
	
	
	
	

}
