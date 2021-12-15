package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import locators.Amazon_Search;
import test_values.Amazon_Search_Data;
import utilities.Generic_Methods;

public class Configuration1 extends Generic_Methods {
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("started our test suite");
		applicationlog.info("start");
	}
	@AfterSuite
	public void aftersuit(){
		System.out.println("end the testsuit");
		applicationlog.info("end");
	}
	@Parameters({"browser","URL"})
	@BeforeMethod
	public void browsersetup(String browser,String URL) { 
	
	if(driver==null) {
		System.out.println("verification starts");
		applicationlog.info("verification");
	   if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\imprintID\\eclipse-workspace\\FrameWork\\DRIVER\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(URL);
			max_page();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\imprintID\\eclipse-workspace\\FrameWork\\DRIVER\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(URL);
			max_page();
	   
		}else {
			throw new IllegalArgumentException("undefined browser");
		}
		
	}
	
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//geturl();
	}

	@AfterMethod
	public void closedriver() {
		System.out.println("testcase executes");
		driver.close();
		System.out.println("end the browser");
	applicationlog.info("end");

	//@listener@factory note
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	