package com.onemg.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventListener;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.onemg.utils.Utils;

//import com.flipkart.utils.EventListener;
//import com.flipkart.utils.Utils;

//import com.flipkart.utils.EventListener;

public class Testbase {
	public static WebDriver driver;
	public static Properties pro;
	public static Logger log;
	public static EventListener listener;
	public Testbase() {
		FileInputStream fis; 
		
		try {
			fis= new FileInputStream("/1mg/src/main/java/com/config/properties/Config.properties");
			pro= new Properties();
			pro.load(fis);
			log.info("Propery file loaded");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Properties file not found");
		}
				
			}
	public static  void initialization() {
		
		 String browsername=pro.getProperty("browser");
		 if (browsername.equalsIgnoreCase("chrome")) {
			 
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     log.info("Chrome browser opened");
	     listener=new EventListener() {
		};
	     driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Utils.implicity_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(pro.getProperty("url"));
			
		
	}
	

	
	
	

}
}
