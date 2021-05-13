package SeleniumProgramms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Downloads")).click();
		
		driver.findElement(By.linkText("Projects")).click();
		
		driver.findElement(By.linkText("Documentation")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String curl=driver.getCurrentUrl();
		driver.get(curl);
		
		driver.navigate().to(curl);
		
		driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
		
		driver.close();

	}

}
