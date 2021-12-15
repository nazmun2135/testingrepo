package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Configuration1;
import locators.Target_Cart;


public class Target_cart extends Configuration1 {
	
	Target_Cart obj  = new Target_Cart();
	
	
	@Test(enabled=false)
	public void cart() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(obj.target_Cart_Locators)));
		//Thread.sleep(2000);
		clickbyxpath(obj.target_Cart_Locators);
		System.out.println("clicks the cart");
	}
}
