package SeleniumProgramms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class PrintingDropDownValues extends ReusableSeleniumComponents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
	    XSSFSheet sh = wb.createSheet("PrinitingValues");
		
		launchbrowser("chrome");
		appurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334", "");
		List<WebElement> sponsorname=driver.findElements(By.xpath("//*[@id='c0']/option"));
         int total_count=sponsorname.size();
         
         for(int i=1;i<total_count;i++){
         
                String text=sponsorname.get(i).getText();
                sh.createRow(i).createCell(2).setCellValue(text);
         }
        
         FileOutputStream fo=new FileOutputStream(f);
 	    wb.write(fo);
 	    
 	    wb.close();
 	    fo.close();
 	    fi.close();
         
         driver.close();
		
		
	}

}
