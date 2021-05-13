package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class MouseHover extends ReusableSeleniumComponents  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		launchbrowser("chrome");
		appurl("https://www.flipkart.com/","opening the flipkart url");
		
		
		String titlename =getTitle();
		System.out.println("Title Name is"+titlename);
		
		Thread.sleep(8000);
		mousehover(By.xpath("//*[@id='container']/div/div[2]/div/div/div[5]/a/div[1]/div/img"));
		Thread.sleep(3000);
		click(By.linkText("Gaming"));
		String text=readText(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/h1"));
		System.out.println(text);
		driver.close();

	}

}
