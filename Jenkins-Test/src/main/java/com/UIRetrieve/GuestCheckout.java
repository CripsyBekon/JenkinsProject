package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GuestCheckout {
		WebDriver driver;
		
		public GuestCheckout(WebDriver driver){
		this.driver = driver;
		}
		@FindBy(how=How.NAME,using="email")
		@CacheLookup
			WebElement email;
		@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/table/tbody/tr[2]/td/button")
		@CacheLookup
			WebElement go;
		
		public void guestCheckout(String uid) {
			try {
				Thread.sleep(3000);
				email.sendKeys(uid);
				Thread.sleep(3000);
				go.click();
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
