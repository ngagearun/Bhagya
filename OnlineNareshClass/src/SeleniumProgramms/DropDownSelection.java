package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
				ChromeDriver  driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				//open the app
				driver.get("https://www.mortgagecalculator.org/");
				driver.findElement(By.linkText(" ఆంధ్రప్రదేశ్ ")).click();
				//Read the title  of application
				String titlename =driver.getTitle();
				System.out.println("Title Name is"+titlename);
				
				Thread.sleep(3000);
				
				Select date=new Select(driver.findElement(By.name("param[start_month]")));
				
				date.selectByIndex(1);
				Thread.sleep(3000);
				date.selectByValue("6");
				Thread.sleep(3000);
				date.selectByVisibleText("Dec");
				Thread.sleep(3000);
				
				driver.close();
				
				

	}

}
