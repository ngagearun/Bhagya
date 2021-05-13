package SeleniumProgramms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class ScreenShotPage extends ReusableSeleniumComponents {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		launchbrowser("chrome");
		appurl("https://www.mortgagecalculator.org/", "");
		Thread.sleep(4000);		
	   File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   FileUtils.copyFile(f, new File("D:\\Mortagecalcuator.PNG"));
	   driver.close();
	   
	 
	   
	   
		

	}

}
