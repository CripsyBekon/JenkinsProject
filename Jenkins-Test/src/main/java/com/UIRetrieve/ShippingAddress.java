package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShippingAddress {
WebDriver driver;
	
	public ShippingAddress(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.NAME,using="shippingAddress[firstname]")
	@CacheLookup
		WebElement fname;
	@FindBy(how=How.NAME,using="shippingAddress[lastname]")
	@CacheLookup
		WebElement lname;
	@FindBy(how=How.NAME,using="shippingAddress[street]")
	@CacheLookup
		WebElement streetname;
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div/sections/div[1]/div[2]/div[1]/div[2]/section-change-button/div/div[2]/next-button/button")
	@CacheLookup
		WebElement go;
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div/sections/div[1]/div[2]/div[1]/div[2]/section-change-button/div/div[2]/next-button/button")
	@CacheLookup
		WebElement checkout;
	
	
	public void shippingAddress(String f, String l, String st) {
		try {
			Thread.sleep(3000);
			fname.sendKeys(f);
			Thread.sleep(3000);
			lname.sendKeys(l);
			Thread.sleep(3000);
			streetname.sendKeys(st);
			Thread.sleep(3000);
			go.click();
			Thread.sleep(10000);
			checkout.click();
			Thread.sleep(10000);
			
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
