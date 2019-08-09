package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginXCart {
	WebDriver driver;
	 
	public LoginXCart(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"header-bar\"]/div[3]/button/span")
	@CacheLookup
		WebElement signup;
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
		WebElement name;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
		WebElement passW;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/table/tbody[1]/tr[3]/td/button")
	@CacheLookup
		WebElement go;
	
	public void loginXCart(String uid, String password) {
		try {
			Thread.sleep(3000);
			signup.click();
			Thread.sleep(3000);
			name.clear();
			Thread.sleep(3000);
			name.sendKeys(uid);
			Thread.sleep(3000);
			passW.sendKeys(password);
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
