package SeleniumProgramms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.applicationname.reusable.ReusableSeleniumComponents;
import com.sun.java.swing.plaf.windows.WindowsTreeUI.ExpandedIcon;

public class AlertDemo extends  ReusableSeleniumComponents{

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
      FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Documents\\OnlineNareshClass\\configuration.properties");
	  Properties prop=new Properties();
		prop.load(fi);
		
		try{
		        launchbrowser(prop.getProperty("browsername"));
		        appurl(prop.getProperty("url"),"Opening the appurl");
		       String titlename=getTitle();
			 System.out.println("Title Name is"+titlename);
			 WebDriverWait wait=new WebDriverWait(driver, 40);
				wait.until(ExpectedConditions.alertIsPresent());
				alert();
			 sendText(By.name("fname"),"Arun","Entering the Firstname value");
			 sendText(By.name("lname"),"kumar","Entering the lastname value");
			 click(By.id("submitButton"));			
				WebDriverWait wait1=new WebDriverWait(driver, 40);
				wait1.until(ExpectedConditions.alertIsPresent());
				
				alert();
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			driver.close();
		}
			
				
				
				
				

	}

}
