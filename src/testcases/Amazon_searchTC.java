package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Configuration1;
import locators.Amazon_Search;
import test_values.Amazon_Search_Data;


public class Amazon_searchTC extends Configuration1{
	Amazon_Search obj  = new Amazon_Search();
	
	Amazon_Search_Data obj2 = new Amazon_Search_Data();
	
	@Test
	public void textbox() {
		//textbox search
		typebyxpath(obj.amazon_Search_Locators,obj2.search_data);
		clickbyxpath(obj.search_click_locators);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//item search
		explicitwaitbyxpath(obj.item_locator);
		clickbyxpath(obj.item_locator);
		//add to cart button
		explicitwaitbyxpath(obj.buy_locator);
		clickbyxpath(obj.buy_locator);
		//adding plan 
		explicitwaitbycss(obj.plan_locator);
		clickbycss(obj.plan_locator);
		
	 }
	}
	

