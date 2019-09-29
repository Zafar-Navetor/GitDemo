package Extend;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.github.javafaker.Faker;



public class Base {
	Properties front_end = new Properties();
	WebDriver driver;
	Logger logs = Logger.getLogger(Base.class.getName());
	Locale locale = new Locale("en-Pak");
    Faker fake	= new Faker(locale);
    public WebDriverWait wait = new WebDriverWait(driver, 10);
    
    
    @BeforeSuite
    public void Config() throws IOException{
    	driver = new ChromeDriver();
    	logs.info("initialize Browser");
    	driver.manage().window().maximize();
    	FileInputStream src = new  FileInputStream("F:\\Automation\\Maven Project\\Insurance\\April\\Locator.Properties");
    	front_end.load(src);
    	driver.get(front_end.getProperty("URL"));
    	logs.info("Open Chrome Browser");
    	   	
    }
	
 @AfterSuite
 public void TearDown() throws InterruptedException{
	 
	 
	 Thread.sleep(5000);
	 driver.manage().deleteAllCookies();
	 driver.close();
	 
 }
}
















