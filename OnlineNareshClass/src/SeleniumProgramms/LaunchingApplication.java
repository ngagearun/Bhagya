package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {

	public static void main(String[] args) {
		
		
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		
		//open the app
		driver.get("https://www.mortgagecalculator.org/");
		
		//Read the title  of application
		String titlename =driver.getTitle();
		System.out.println("Title Name is"+titlename);
		
		driver.findElement(By.id("homeval")).sendKeys("456789");
		driver.findElement(By.name("cal")).click();
		//closing the browser
		driver.close();
		

	}

}
