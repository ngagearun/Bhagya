package SeleniumProgramms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class WindowBasedAction {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		
		Screen sc=new Screen();
		
		sc.type("C:\\Users\\Lenovo\\Desktop\\filepath.PNG", "C:\\Users\\Lenovo\\Desktop\\arun.txt");
		sc.click("C:\\Users\\Lenovo\\Desktop\\openbutton.PNG");
		Thread.sleep(15000);
		driver.close();
		
		

	}

}
