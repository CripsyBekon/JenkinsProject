package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.*;

public class TestCartFunctions extends TestHierarchy {
	public TestCartFunctions() {
	}

	@Test
	public void xCartTest() {
		try {
			System.out.println("Initializing Weird Unknown Website Test - Cart Function Test");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing adding two products");
			AddTwoProducts atp = PageFactory.initElements(driver, AddTwoProducts.class);
			atp.addTwo();
			
			System.out.println("Playing around with the cart");
			CartPlayground cp = PageFactory.initElements(driver, CartPlayground.class);
			cp.cartPlayground("3");
			
			}
			catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}