package com.UIRetrieve;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddTwoProducts {
	WebDriver driver;
	
	 
	public AddTwoProducts(WebDriver driver){
		this.driver=driver;	
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[3]/div/div/div/ul/li[3]/div/h5/a")
	@CacheLookup
		WebElement product;	
	@FindBy(how=How.XPATH,using="//*[@id=\"content\"]/div/div/div[3]/div/div/div/ul/li[2]/div/h5/a")
	@CacheLookup
		WebElement product2;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, '')]/div/div/div/div[1]/div[6]/a[1]/span")
	@CacheLookup
		WebElement toCart;
	@FindBy(how=How.CSS,using=".ui-dialog-titlebar-close")
	@CacheLookup
		WebElement quit;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/div[2]/div/div[3]/button/span")
	@CacheLookup
		WebElement addToCart;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/div[2]/div/div[3]/button/span")
	@CacheLookup
		WebElement addToCart2;
	@FindBy(how=How.XPATH,using="//*[@id=\"logo\"]/a/img")
	@CacheLookup
		WebElement goHome;
		
	
	public void addTwo() throws InterruptedException {
		Thread.sleep(3000);
		product.click();
		Thread.sleep(3000);
		addToCart.click();
		Thread.sleep(3000);
		quit.click();
		Thread.sleep(3000);
		goHome.click();
		Thread.sleep(3000);
		product2.click();
		Thread.sleep(3000);
		addToCart2.click();
		Thread.sleep(3000);
		toCart.click();
		Thread.sleep(3000);
	}
}
