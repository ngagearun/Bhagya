package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class ScrollBarActions extends ReusableSeleniumComponents {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("chrome");
		appurl("http://only-testing-blog.blogspot.com/", "");
		WebElement f_name=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[1]"));
		JavascriptExecutor objname=(JavascriptExecutor) driver;
		 objname.executeScript("arguments[0].scrollIntoView(true);",f_name);
		
		 WebElement l_name=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div[11]/div/div/div/div[2]/div[1]/form/input[2]"));
		 objname.executeScript("arguments[0].disabled = false", l_name);
		 l_name.sendKeys("LastName");
		 Thread.sleep(3000);
		 

	}

}
