package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterDuringCheckout {
	WebDriver driver;
	 
	public RegisterDuringCheckout(WebDriver driver){
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//*[starts-with(@id,'form-')]/ul/li[11]/p[2]/a")
	@CacheLookup
		WebElement reg;	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
		WebElement passW;
	@FindBy(how=How.NAME,using="password_conf")
	@CacheLookup
		WebElement passWConf;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/div[2]/div[2]/div/button")
	@CacheLookup
		WebElement register;
	@FindBy(how=How.XPATH,using="//*[@id=\"logo\"]/a/img")
	@CacheLookup
		WebElement goHome;

	public void regDurCheckout(String pass) throws InterruptedException {
		Thread.sleep(3000);
		reg.click();
		Thread.sleep(3000);
		passW.sendKeys(pass);
		Thread.sleep(3000);
		passWConf.sendKeys(pass);
		Thread.sleep(3000);
		register.click();
		Thread.sleep(30000);
		goHome.click();
		Thread.sleep(5000);
	}
}
