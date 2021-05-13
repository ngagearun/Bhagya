package com.appname.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.applicationname.reusable.ReusableSeleniumComponents;

public class ConstantsforAppName extends ReusableSeleniumComponents{
	
	public static String Property_filename="C:\\Users\\Lenovo\\Documents\\OnlineNareshClass\\configuration.properties";
	public static By dresses=By.xpath("//*[@id='block_top_menu']/ul/li[2]/a") ; 
	public static By evening_dresses=By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a");
	public static By casual_dresses=By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a");
    public static By printed_dresses=By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img");
    public static By Add_To_Cart=By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span");
    
}
