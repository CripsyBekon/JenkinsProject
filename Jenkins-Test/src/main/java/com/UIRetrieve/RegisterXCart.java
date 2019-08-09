package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterXCart {
	
	WebDriver driver;
	 
	public RegisterXCart(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"header-bar\"]/div[3]/button/span")
	@CacheLookup
		WebElement signup;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/table/tbody[1]/tr[4]/td/a[1]")
	@CacheLookup
		WebElement register;
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
		WebElement name;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
		WebElement passW;
	@FindBy(how=How.NAME,using="password_conf")
	@CacheLookup
		WebElement passWConf;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/div[2]/div[2]/div/button")
	@CacheLookup
		WebElement go;
	
	
	public void regXCart(String uid ,String pass, String passConf) {
		try {
			signup.click();
			register.click();
			name.sendKeys(uid);
			Thread.sleep(3000);
			passW.sendKeys(pass);
			Thread.sleep(3000);
			passWConf.sendKeys(passConf);
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
