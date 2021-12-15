package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.Configuration1;
import locators.Amazon_Signin_Locators;
import locators.Amazon_check;
import test_values.Amazon_signin_Testdata;

public class Amazon_Checkout extends Configuration1 {
Amazon_check  obj = new Amazon_check();
@Test	
 public void checkout() {
	 Actions actobj = new Actions(driver);
		
		actobj.contextClick(driver.findElement(By.id(obj.cart_locator))).build().perform();
	 explicitwaitbyid(obj.cart_locator);
	 clickbyid(obj.cart_locator);
	 explicitwaitbycss(obj.checkout_locator);
	 clickbycss(obj.checkout_locator);
 }
	

}
