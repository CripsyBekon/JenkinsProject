package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetrieveFacebook {
	
	WebDriver driver;
	 
	public RetrieveFacebook(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.NAME,using="email")
	@CacheLookup
		WebElement name;
	@FindBy(how=How.NAME,using="pass")
	@CacheLookup
		WebElement passW;
	@FindBy(how=How.XPATH,using="//*[@id=\"u_0_a\"]")
	@CacheLookup
		WebElement go;
	
	
	public void loginFB(String uid ,String pass) {
		try {
			name.sendKeys(uid);
			Thread.sleep(3000);
			passW.sendKeys(pass);
			Thread.sleep(3000);
			go.click();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
