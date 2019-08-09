package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoToCheckout {
		WebDriver driver;
		
		public GoToCheckout(WebDriver driver){
			this.driver=driver;	
		}
		@FindBy(how=How.XPATH,using="//*[@id=\"cart-right\"]/ul/li[6]/button")
		@CacheLookup
			WebElement checkout;
			
		
		public void checkout() throws InterruptedException {
			Thread.sleep(3000);
			checkout.click();
			Thread.sleep(3000);
		}
}
