package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.RegisterXCart; 

public class TestRegister extends TestHierarchy
 {
	public TestRegister() {
	}

	@Test
	public void testLogin() {
		try {
			System.out.println("Initializing Weird Unknown Website Test - Registering New User");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing Registering a user");
			RegisterXCart xcart = PageFactory.initElements(driver, RegisterXCart.class);
			xcart.regXCart("differentlearningmethods69+1@gmail.com", "everyonehas", "everyonehas");
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
