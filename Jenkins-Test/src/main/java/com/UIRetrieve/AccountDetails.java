package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountDetails {
WebDriver driver;
	
	public AccountDetails(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.XPATH,using="//div[@id='header-bar']/div[3]/a")
	@CacheLookup
		WebElement accountClick;
	@FindBy(how=How.CSS,using=".orders > span")
	@CacheLookup
		WebElement showAcc;
	
	
	public void accountDetails() {
		try {
			Thread.sleep(3000);
			accountClick.click();
			Thread.sleep(3000);
			showAcc.click();
			Thread.sleep(3000);
			} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
