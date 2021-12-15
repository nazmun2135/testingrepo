package utilities;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class Generic_Methods {
public static WebDriver driver=null;
public static Logger applicationlog = Logger.getLogger("devpinoyLogger");
//method for imlicit wait call in configur
//method for explicit used in locator
public  void max_page() {
	
		try {
			driver.manage().window().maximize();
			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
}

		
	
public  void typebyxpath(String locator,String value) {
	try{driver.findElement(By.xpath(locator)).clear();
		driver.findElement(By.xpath(locator)).sendKeys(value);
	
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	applicationlog.debug(e.getMessage());
	}
}

public  void typebyname(String locator,String value) {
	try{driver.findElement(By.name(locator)).clear();
		driver.findElement(By.name(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebyclassname(String locator,String value) {
	try{driver.findElement(By.className(locator)).clear();
		driver.findElement(By.className(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebyid(String locator,String value) {
	try{driver.findElement(By.id(locator)).clear();
		driver.findElement(By.id(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebylinktext(String locator,String value) {
	try{driver.findElement(By.linkText(locator)).clear();
		driver.findElement(By.linkText(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebypartiallinktext(String locator,String value) {
	try{driver.findElement(By.partialLinkText(locator)).clear();
		driver.findElement(By.partialLinkText(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebycss(String locator,String value) {
	try{driver.findElement(By.cssSelector(locator)).clear();
		driver.findElement(By.cssSelector(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void typebytagname(String locator,String value) {
	try{driver.findElement(By.tagName(locator)).clear();
		driver.findElement(By.tagName(locator)).sendKeys(value);
	
	}catch(Exception e){
		System.err.println(e.getMessage());	
	}
}

public  void clickbyxpath(String locator) {	
driver.findElement(By.xpath(locator)).click();	
}
	
public  void clickbyid(String locators) {	
driver.findElement(By.id(locators)).click();	
}

public  void clickbycss(String locators) {	
driver.findElement(By.cssSelector(locators)).click();	
}

public  void clickbyname(String locators) {	
driver.findElement(By.name(locators)).click();	
}

public  void clickbytagname(String locators) {	
driver.findElement(By.tagName(locators)).click();	
}

public  void clickbylinktext(String locators) {	
driver.findElement(By.linkText(locators)).click();	
}

public  void click(String locators) {	
driver.findElement(By.partialLinkText(locators)).click();	
}

public  void clickbyclass(String locators) {	
driver.findElement(By.className(locators)).click();	
}

public void  gettext( WebElement element) {
	try {
		System.out.println(element.getText());
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public void  geturl(String url) {
	try {driver.get(url);
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public void  gettitle() {
	try {System.out.println(driver.getTitle());
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}



public void  getpagesource() {
	try {System.out.println(driver.getPageSource());
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}




public void  navigateto(String url) {
	try {driver.navigate().to(url);
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public void  navigateforward() {
	try {driver.navigate().forward();
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public void  navigateback() {
	try {driver.navigate().back();
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public void  navigaterefresh() {
	try {driver.navigate().refresh();
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}

public  void dragdrop(WebElement framecount,WebElement drag,WebElement drop) {
	
	try {
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		Actions obj = new Actions(driver);
		
		obj.dragAndDrop(drag, drop).build().perform();
		
	
		
	}catch(Exception e){
		System.err.println(e.getMessage());
}
}


//deselect
//dropdown by xpath select by index
public void dropdownById(String locators, String values){
	
	try{WebElement dd = driver.findElement(By.id(locators));
	Select ddSelect = new Select(dd);
	ddSelectByValue(ddSelect, values);	
}catch(Exception e){
	System.err.println(e.getMessage());
}
}
public void dropdownByxpath(String locators, String values){
	
	try{WebElement dd = driver.findElement(By.xpath(locators));
	Select ddSelect = new Select(dd);
	ddSelectByIndex(ddSelect, values);	
}catch(Exception e){
	System.err.println(e.getMessage());
}
}	
public  void ddSelectByIndex(Select sValue,String values){
	sValue.selectByIndex(0);

}

public void ddSelectByValue(Select sValue, String values){
	sValue.selectByValue(values);

}

public void ddSelectByVisibleText(Select sValue, String values){
	sValue.selectByValue(values);

}

public void radioButtonByXpath(String locator1, String locator2){
	try{
		boolean isSelected = driver.findElement(By.xpath(locator1)).isSelected();
	
	if(isSelected)
		driver.findElement(By.xpath(locator2)).click();
	
	else
		driver.findElement(By.xpath(locator1)).click();
	}catch(Exception e){
			System.err.println(e.getMessage());

}
}
public void Select_The_CheckBox_from_List(String locators) {
	try{List<WebElement> allOptions = driver.findElements(By.xpath(locators));
	for (int i=0;i<allOptions.size();i++) {
		allOptions.get(i).click();}  
	}catch(Exception e){
		System.err.println(e.getMessage()); 
}
}

public void Select_The_Checkbox(WebElement element) {
	try {
        if (element.isSelected()) 
           System.out.println("Checkbox: " + element + "is already selected");
         else 
        	element.click();
        }catch(Exception e){
    		System.err.println(e.getMessage());
    } 
    
}

//typebyxpath(locator,value),type byname(2 ),clickbyxpath,ddbyxapth(2),checkbox,webtable,calendar,gettext(no),title(no),attribute(no),geturl(no),pagetitleverification(value),navigationto(webpage),back,refresh,forward,linktext(value),partial(value),pagelinkcount(int value,string locator),framecount(locator),draganddrop(source,destination)

//explicit wait 3 methods 
//fluent wait method,webtable,calendar,frame method,window handling 

public void explicitwaitbycss(String locator) {
	try {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
        }catch(Exception e){
    		System.err.println(e.getMessage());
}
}

public void explicitwaitbyxpath(String locator) {
	try {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        }catch(Exception e){
    		System.err.println(e.getMessage());
}
}
	public void explicitwaitbyid(String locator) {
		try {
			
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
	        }catch(Exception e){
	    		System.err.println(e.getMessage());
	}
	}
public void windowhandle(String mainw,String childw,String preferdw) {
	try {Set<String>winh = driver.getWindowHandles();
	       
	       //creating an object of iterator to handle windows
	       Iterator<String>itH = winh.iterator();
	       
	     //sop  
	       //String object 
	        mainw = itH.next();
	       
	      
	       //loop to handle windows
	while(itH.hasNext()){
		   childw = itH.next();
		 
		if(!mainw.equalsIgnoreCase(childw)) { 
			driver.switchTo().window(childw);
			if(!childw.equalsIgnoreCase(preferdw))
				
		break;
		
		}}
	driver.switchTo().window(mainw);} 
	catch(Exception e){
	    		System.err.println(e.getMessage());
		}
	
}

public void title_verify(String acttitle,String exptitle) {
	if(acttitle.equalsIgnoreCase(exptitle)) {
		  System.out.println("succesful");
	   }else {
		   System.out.println("fail");
	   }
}


public void webtable(String locator) {

WebElement element = driver.findElement(By.xpath(locator));
java.util.List<WebElement> trcount = element.findElements(By.tagName("tr"));


for(int i =0; i <trcount.size();i++) {
	java.util.List<WebElement> tdcount = trcount.get(i).findElements(By.tagName("td"));
	for(int j=0;j < tdcount.size();j++) {
	tdcount.get(j).getText();
	}		
			
	//table at amazon assertion method		
}	
}
public void fluentwait() {


Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
		.withTimeout(30, TimeUnit.SECONDS) 			
		.pollingEvery(5, TimeUnit.SECONDS) 			
		.ignoring(NoSuchElementException.class);



}
public void assert_title(String originalTitle, String expectedTitle) {
	
	  
	  Assert.assertEquals(originalTitle, expectedTitle);
}



	}









