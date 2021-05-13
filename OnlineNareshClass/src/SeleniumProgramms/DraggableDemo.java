package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		
		//open the app
		driver.get("https://jqueryui.com/draggable/");
		
		//Read the title  of application
		String titlename =driver.getTitle();
		System.out.println("Title Name is"+titlename);		
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement draggable=driver.findElement(By.id("draggable"));
		action.dragAndDropBy(draggable, 140, 70).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
