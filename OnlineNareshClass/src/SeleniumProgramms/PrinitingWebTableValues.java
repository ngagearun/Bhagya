package SeleniumProgramms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class PrinitingWebTableValues extends ReusableSeleniumComponents {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
	    XSSFSheet sh = wb.getSheet("PrinitingValues");
		
		launchbrowser("chrome");
		appurl("https://money.rediff.com/gainers/bsc/dailygroupa?", "");
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
         int total_rows=rows.size();
         
         for(int i=0;i<3;i++){
         
                List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
               XSSFRow r= sh.createRow(i);
                for(int j=0;j<cols.size();j++){
                	
                	String text=cols.get(j).getText();
                	r.createCell(j).setCellValue(text);
                }
         }
        
         FileOutputStream fo=new FileOutputStream(f);
 	    wb.write(fo);
 	    
 	    wb.close();
 	    fo.close();
 	    fi.close();
         
         driver.close();
		
		
		
		
		

	}

}
