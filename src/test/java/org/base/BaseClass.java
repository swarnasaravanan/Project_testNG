package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browserName) {
		switch(browserName) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Swarnalatha\\eclipse-workspace\\TestNG_JulyProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		break;
		
		case "FireFox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Swarnalatha\\eclipse-workspace\\TestNG_JulyProject\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "Ie":
			System.setProperty("webdriver.ie.driver","C:\\Users\\Swarnalatha\\eclipse-workspace\\TestNG_JulyProject\\driver\\IEDriverServer.exe");
			driver = new  InternetExplorerDriver();
			break;
			
		case "Edge":
			System.setProperty("webdriver.edge.driver","C:\\Users\\Swarnalatha\\eclipse-workspace\\TestNG_JulyProject\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}

		return driver;	
	}
     public static void launchUrl(String url) {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
    	 
     }
     
     public static void implicitwait(long sec) {
    	 driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
     }
     public static void browserQuit() {
    	 driver.quit();
     }
     
     
     public static void fill(WebElement element, String value) {
    	 element.sendKeys(value);
    	 
    	 
     }
     public static void btnClick(WebElement e) {
    	 e.click();
     }
     
     public static void browseQuit() {
    	driver.quit();
     }
    	
      public static String getCurrentUrl() {
		return driver.getCurrentUrl();
      }
     	
     public static String getAttribute (WebElement e) {
     	String sat= e.getAttribute("value");
		return sat;
     	
      }
     	
     public static void moveToElement(WebElement e) {
    	 Actions a= new Actions(driver);
    	 a.moveToElement(e).perform();
     	
      }
     	
     public static void dragAndDrop(WebElement src, WebElement des) {
    	 Actions a= new Actions(driver);
     	a.dragAndDrop(src, des).perform();
      }
     	
     public static void SelectByIndex(WebElement element, int index) {
     Select s= new Select(element);
     s.selectByIndex(index);
      }
     	
     public static void selectByValue(WebElement element, String value) {
         Select s= new Select(element);
         s.selectByValue(value);
          }
         	     	
     public static void SelectByVisibletext(WebElement element, String value) {
         Select s= new Select(element);
         s.selectByVisibleText(value);
          }
     
         	
     public static void deSelectByIndex(WebElement element, int index) {
         Select s= new Select(element);
         s.deselectByIndex(index);
          }
     
     public static void deselectByValue(WebElement element, String value) {
         Select s= new Select(element);
         s.deselectByValue(value);
          }
         	
     public static void deSelectByVisibletext(WebElement element, String value) {
         Select s= new Select(element);
         s.deselectByVisibleText(value);
          }	
    	
    public static WebElement findElement(String locatorType, String value)	{
    	WebElement element= null;
    	if (locatorType.equals("id")) {
    		element=driver.findElement(By.id(value));
 
    	}
    	if (locatorType.equals("name")) {
    		element=driver.findElement(By.name(value));
 
    	}
    	if (locatorType.equals("xpath")) {
    		element=driver.findElement(By.xpath(value));
 
    	}
		return element;
    	
    }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
   
     }
