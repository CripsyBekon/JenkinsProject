package com.UIRetrieve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeAddress {
WebDriver driver;
	
	public ChangeAddress(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[2]/div/div[1]/ul/li[2]/a")
	@CacheLookup
		WebElement addressBook;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[2]/div/div[3]/ul/li[1]/div/div[1]/div[3]/button")
	@CacheLookup
		WebElement editor;
	
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/div[2]/div[2]/div/button")
	@CacheLookup
		WebElement confirm;
	
	@FindBy(how=How.NAME,using="231_firstname")
	@CacheLookup
		WebElement fname;
	
	@FindBy(how=How.NAME,using="231_lastname")
	@CacheLookup
		WebElement lname;
	
	@FindBy(how=How.NAME,using="231_street")
	@CacheLookup
		WebElement street;
	
	public void changeAddress(String fnm, String lnm, String st) {
		try {
			Thread.sleep(3000);
			addressBook.click();
			Thread.sleep(3000);
			editor.click();
			Thread.sleep(20000);
			fname.clear();
			Thread.sleep(3000);
			fname.sendKeys(fnm);
			Thread.sleep(3000);
			lname.clear();
			Thread.sleep(3000);
			lname.sendKeys(lnm);
			Thread.sleep(3000);
			street.clear();
			Thread.sleep(3000);
			street.sendKeys(st);
			Thread.sleep(3000);
			confirm.click();
			Thread.sleep(20000);
			} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
