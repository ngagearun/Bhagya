package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
  //launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		
		//open the app
		driver.get("https://jqueryui.com/selectable/");
		
		//Read the title  of application
		String titlename =driver.getTitle();
		System.out.println("Title Name is"+titlename);		
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement item1=driver.findElement(By.xpath("//*[@id='selectable']/li[1]"));
		WebElement item3=driver.findElement(By.xpath("//*[@id='selectable']/li[3]"));
		WebElement item5=driver.findElement(By.xpath("//*[@id='selectable']/li[5]"));
		
		action.sendKeys(Keys.CONTROL).click(item1).click(item3).click(item5).perform();
		Thread.sleep(3000);
		driver.close();
		

	}

}
