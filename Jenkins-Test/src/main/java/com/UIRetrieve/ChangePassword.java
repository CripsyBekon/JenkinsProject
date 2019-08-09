package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangePassword {
WebDriver driver;
	
	public ChangePassword(WebDriver driver) {
		this.driver= driver;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[2]/div/div[1]/ul/li[3]/a")
	@CacheLookup
		WebElement changePW;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/div[2]/div[2]/div[1]/button/span")
	@CacheLookup
		WebElement confirm;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
		WebElement passW;
	@FindBy(how=How.NAME,using="password_conf")
	@CacheLookup
		WebElement passWConf;
	
	public void changePassword(String pass) {
		try {
			Thread.sleep(3000);
			changePW.click();
			Thread.sleep(3000);
			passW.sendKeys(pass);
			Thread.sleep(3000);
			passWConf.sendKeys(pass);
			Thread.sleep(3000);
			confirm.click();
			Thread.sleep(3000);
			} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
