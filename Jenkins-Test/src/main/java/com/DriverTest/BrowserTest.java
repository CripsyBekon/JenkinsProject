package com.DriverTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver(){
		if(driver==null){
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--disable-notifications");
			//options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			//<a name="Login Page"</a>
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		return driver;
	}
	 
	public static WebDriver getDriver(String browserName){
		if(driver==null){
			if(browserName.equalsIgnoreCase("chrome")){
				System.out.println("in chrome");
				System.setProperty("webdriver.chrome.driver", "chromedriver");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(1000000, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(1000000, TimeUnit.SECONDS);
			}
				else
				if(browserName.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\798015\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10000000, TimeUnit.SECONDS);
			}
		}
		return driver;
	}
}
