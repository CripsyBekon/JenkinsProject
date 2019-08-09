package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.*;

public class TestRegisterDuringCheckout extends TestHierarchy {
	public TestRegisterDuringCheckout() {
	}
	
	@Test
	public void registerGuestCheckout() {
		try {
			System.out.println("Initializing Weird Unknown Website Test - Checkout, Register, Login, Complete Checkout");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing adding two products");
			AddTwoProducts atp = PageFactory.initElements(driver, AddTwoProducts.class);
			atp.addTwo();
			
			System.out.println("Initiate Checkout");
			GoToCheckout gtc = PageFactory.initElements(driver, GoToCheckout.class);
			gtc.checkout();
			
			System.out.println("Entering Guest Email");
			GuestCheckout gsC = PageFactory.initElements(driver, GuestCheckout.class);
			gsC.guestCheckout("guest123456@gmail.com");
			
			System.out.println("Registering guest as user before checkout");
			RegisterDuringCheckout rdc = PageFactory.initElements(driver, RegisterDuringCheckout.class);
			rdc.regDurCheckout("abcd1234");
			
			System.out.println("Testing Login as a valid user");
			FreshUserCheckout fuc = PageFactory.initElements(driver, FreshUserCheckout.class);
			fuc.newUserLogin("guest123456@gmail.com", "abcd1234");
			
			System.out.println("Returning to checkout");
			ClickCart cc = PageFactory.initElements(driver, ClickCart.class);
			cc.clickCart();
			
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
