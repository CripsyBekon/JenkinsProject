package com.TestRunner;

import java.io.*;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.DriverTest.BrowserTest;
 
public class TestHierarchy {
	public static WebDriver driver;
	BrowserTest test1;

	public TestHierarchy(){
	}

	@BeforeSuite
	public void beforeSuite(){

	}

	@BeforeClass
	public void beforeClass(){
	}

	@BeforeMethod
	public void beforeMethodClass(){
		TestHierarchy.driver = BrowserTest.getDriver("chrome");
	}

	@AfterMethod
	public void close()
	{
		//this.driver.close();
	}

	@AfterClass
	public void afterClass(){
	}

	@AfterSuite
	public void afterSuite() throws IOException, EmailException{
		driver.quit();
	}		
}