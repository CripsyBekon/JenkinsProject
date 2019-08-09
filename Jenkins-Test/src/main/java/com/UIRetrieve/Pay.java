package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pay {
	WebDriver driver;
	 
	public Pay(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/place-order/button")
	@CacheLookup
		WebElement checkout1;
	@FindBy(how=How.XPATH,using="//*[@id=\"pmethod28\"]")
	@CacheLookup
		WebElement selectCardRadio;
	
	public void pay() throws InterruptedException {
		Thread.sleep(3000);
		selectCardRadio.click();
		Thread.sleep(30000);
		checkout1.click();
		Thread.sleep(30000);
	}
}
