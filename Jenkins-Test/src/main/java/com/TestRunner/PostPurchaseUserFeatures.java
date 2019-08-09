package com.TestRunner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.UIRetrieve.*;

public class PostPurchaseUserFeatures extends TestHierarchy {
	public PostPurchaseUserFeatures() {
	}

	@Test
	public void registeredUserFeatTest() {
		try {
			System.out.println("Initializing Weird Unknown Website Test - Registered User Interface");
			driver.get("https://demostore.x-cart.com/");
			
			System.out.println("Testing Login as a valid user");
			LoginXCart lxcart = PageFactory.initElements(driver, LoginXCart.class);
			lxcart.loginXCart("differentlearningmethods69@gmail.com", "everyonehas");
			
			System.out.println("Heading to account details");
			AccountDetails ac = PageFactory.initElements(driver, AccountDetails.class);
			ac.accountDetails();
			
			System.out.println("Changing address");
			ChangeAddress ca = PageFactory.initElements(driver, ChangeAddress.class);
			ca.changeAddress("Jane", "Dean", "Chinatown");
			
			System.out.println("Changing password");
			ChangePassword cp = PageFactory.initElements(driver, ChangePassword.class);
			cp.changePassword("everyonehas");
			}
			catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
