package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.RetrieveAmazon;

public class AmazonTest extends TestHierarchy {

	public AmazonTest() {
	}
	
	@Test
	public void amazon() {
		try {
			System.out.println("Initializing Test");
			driver.get("https://www.amazon.com.au/");
			RetrieveAmazon amazon = PageFactory.initElements(driver, RetrieveAmazon.class);
			amazon.searchAmazon("RTX 2070");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
