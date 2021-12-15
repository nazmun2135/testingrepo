package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Configuration1;

import locators.Amazon_Signin_Locators;
import test_values.Amazon_signin_Testdata;




public class Amazon_Signin_TC extends Configuration1{

	
	Amazon_Signin_Locators  obj = new Amazon_Signin_Locators();
	
	Amazon_signin_Testdata obj2 = new Amazon_signin_Testdata();
	
	@Test(priority=1)
	public void signin(){
		explicitwaitbyxpath(obj.signin_locator);
		clickbyxpath(obj.signin_locator);
		explicitwaitbycss(obj.email_locator);
		typebycss(obj.email_locator,obj2.amazonsigninemailvalue);
		explicitwaitbycss(obj.continue_locator);
		clickbycss(obj.continue_locator);
		explicitwaitbycss(obj.password_locator);
		typebycss(obj.password_locator,obj2.amazonsigninpassword);
		explicitwaitbycss(obj.signin_conform);
		clickbycss(obj.signin_conform);
	}
	
}
