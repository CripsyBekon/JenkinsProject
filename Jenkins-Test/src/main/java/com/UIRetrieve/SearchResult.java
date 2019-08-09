package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResult {
	WebDriver driver;
	 
	public SearchResult(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[2]/div/div[2]/div/div/div[3]/ul/li[1]/div/h5/a")
	@CacheLookup
		WebElement product;	
	public void searchResult() throws InterruptedException {
		product.click();
		Thread.sleep(3000);
	}
}
