package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetrieveAmazon {
	
	WebDriver driver;
	 
	public RetrieveAmazon(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="field-keywords")
	@CacheLookup
		WebElement searchBar;
	@FindBy(how=How.XPATH,using="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	@CacheLookup
		WebElement go;
	
	
	public void searchAmazon(String item) {
		try {
			searchBar.sendKeys(item);
			Thread.sleep(3000);
			go.click();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
