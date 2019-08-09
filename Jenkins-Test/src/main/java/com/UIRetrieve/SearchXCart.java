package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchXCart {
	
	WebDriver driver;
	 
	public SearchXCart(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="substring")
	@CacheLookup
		WebElement searchBar;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/div[2]/button")
	@CacheLookup
		WebElement go;
	
	
	public void searchXCart(String item) {
		try {
			searchBar.sendKeys(item);
			Thread.sleep(3000);
			go.click();
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
