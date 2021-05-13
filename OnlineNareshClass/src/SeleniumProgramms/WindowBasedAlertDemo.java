package SeleniumProgramms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedAlertDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open the app
		driver.get("http://only-testing-blog.blogspot.com/");
		
		//Read the title  of application
		String titlename =driver.getTitle();
		System.out.println("Title Name is"+titlename);		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[1]/input[10]")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");

	}

}
