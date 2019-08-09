package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExistingUserCheckout {
	WebDriver driver;
	 
	public ExistingUserCheckout(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.CSS,using=".add2cart")
	@CacheLookup
		WebElement addCart;
	@FindBy(how=How.CSS,using=".item-buttons > .regular-main-button")
	@CacheLookup
		WebElement checkOut;
	@FindBy(how=How.CSS,using=".checkout_fastlane_section-next")
	@CacheLookup
		WebElement payPortal;
	public void excheckOut() throws InterruptedException {
		Thread.sleep(3000);
		addCart.click();
		Thread.sleep(3000);
		checkOut.click();
		Thread.sleep(3000);
		payPortal.click();
		Thread.sleep(3000);
		
	}

}
