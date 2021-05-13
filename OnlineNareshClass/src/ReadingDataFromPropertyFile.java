import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Documents\\OnlineNareshClass\\configuration.properties");
		
		Properties prop=new Properties();
		prop.load(fi);
		
		System.out.println(prop.getProperty("browsername"));
	
		fi.close();
		
		
	}

}
