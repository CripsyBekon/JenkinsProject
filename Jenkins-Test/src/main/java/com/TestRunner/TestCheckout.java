package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.*;

public class TestCheckout extends TestHierarchy{

	public TestCheckout() {
	}
	
	@Test
	public void xCartTest() {
		try {
			System.out.println("Initializing Weird Unknown Website Test-Registered User Checkout Test");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing Login as a valid user");
			LoginXCart lxcart = PageFactory.initElements(driver, LoginXCart.class);
			lxcart.loginXCart("differentlearningmethods69@gmail.com", "everyonehas");
			
			System.out.println("Testing Search Function");
			SearchXCart search = PageFactory.initElements(driver, SearchXCart.class);
			search.searchXCart("RTX 2070");
			
			System.out.println("Testing clicking on search result");
			SearchResult sr = PageFactory.initElements(driver, SearchResult.class);
			sr.searchResult();
			
			System.out.println("Testing checkout as existing user");
			ExistingUserCheckout cko = PageFactory.initElements(driver, ExistingUserCheckout.class);
			cko.excheckOut();
			
			Pay pay = PageFactory.initElements(driver, Pay.class);
			pay.pay();
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
