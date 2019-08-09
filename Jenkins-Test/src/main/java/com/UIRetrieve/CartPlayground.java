package com.UIRetrieve;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPlayground {
	WebDriver driver;
	
	public CartPlayground(WebDriver driver) {
		this.driver= driver;
	}
	@FindBy(how=How.NAME,using="amount")
	@CacheLookup
		WebElement amt;
	@FindBy(how=How.XPATH,using="//*[starts-with(@id, 'form-')]/a")
	@CacheLookup
		WebElement delete;
	@FindBy(how=How.CLASS_NAME,using="clear-bag")
	@CacheLookup
		WebElement clearCart;

	public void cartPlayground(String amount) {
		try {
			Thread.sleep(3000);
			amt.clear();
			Thread.sleep(10000);
			amt.sendKeys(amount);
			Thread.sleep(10000);
			delete.click();
			Thread.sleep(10000);
			clearCart.click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
			//close and restart drivers
			System.out.println("Restarting chrome");
			driver.close();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demostore.x-cart.com/");
			Thread.sleep(10000);
			driver.close();
			} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
