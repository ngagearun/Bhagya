import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWritingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File f=new File("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
	    XSSFSheet sh = wb.getSheet("WritingData");
	    
	    sh.createRow(5).createCell(4).setCellValue("Excel writing programm");
	    
	    FileOutputStream fo=new FileOutputStream(f);
	    wb.write(fo);
	    
	    wb.close();
	    fo.close();
	    fi.close();

	}

}
