package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.*;

public class TestGuestCheckout extends TestHierarchy {
	public TestGuestCheckout() {
	}
	
	@Test
	public void guestCheckout() {
		try {
			System.out.println("Initializing Weird Unknown Website Test- Checkout As Guest");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing adding two products");
			AddTwoProducts atp = PageFactory.initElements(driver, AddTwoProducts.class);
			atp.addTwo();
			
			System.out.println("Initiate Checkout");
			GoToCheckout gtc = PageFactory.initElements(driver, GoToCheckout.class);
			gtc.checkout();
			
			System.out.println("Entering Guest Email");
			GuestCheckout gsC = PageFactory.initElements(driver, GuestCheckout.class);
			gsC.guestCheckout("guest@gmail.com");
			
			System.out.println("Entering Address");
			ShippingAddress sa = PageFactory.initElements(driver, ShippingAddress.class);
			sa.shippingAddress("a","a","a");
			
			System.out.println("Checking Out");
			Pay pay = PageFactory.initElements(driver, Pay.class);
			pay.pay();
			
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
	}
}
}
