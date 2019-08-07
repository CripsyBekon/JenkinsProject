package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.RetrieveFacebook;

public class FacebookTest extends TestHierarchy{

	public FacebookTest() {
	}
	
	@Test
	public void facebook() {
		try {
			System.out.println("Initializing Test");
			driver.get("https://www.facebook.com/");
			RetrieveFacebook fb = PageFactory.initElements(driver, RetrieveFacebook.class);
			fb.loginFB("lsd@gmail.com", "asd1234567");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
