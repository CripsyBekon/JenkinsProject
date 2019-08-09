package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClickCart {
	WebDriver driver;
	
	public ClickCart(WebDriver driver){
	this.driver = driver;
	}
	
	@FindBy(how=How.CSS,using=".lc-minicart")
	@CacheLookup
		WebElement clickCart;
	@FindBy(how=How.XPATH,using="//span[contains(.,'Checkout')]")
	@CacheLookup
		WebElement clickCheckout;

	
	
	public void clickCart() {
		try {
			Thread.sleep(3000);
			clickCart.click();
			Thread.sleep(3000);
			clickCheckout.click();
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
