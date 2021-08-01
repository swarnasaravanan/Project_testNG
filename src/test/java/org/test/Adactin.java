package org.test;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactin {
	static WebDriver driver;
	
	@BeforeClass
	private void previousClass() {
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	System.out.println("BeforeClass");	
	}
	
	@AfterClass
	private void afterClass() {
	System.out.println("AfterClass");	
	}
	
	@BeforeMethod
	private void beforeMethod() {
		Date d = new Date(0);
		System.out.println("Test starts...."+d);
	   System.out.println("BeforeMethod");	
	}
	
	@AfterMethod
	private void afterMethod() {
		Date d = new Date(0);
		System.out.println("Test End...."+d);
	System.out.println("BeforeClass");	
	}
	
	@Test
	private void test1() {
		WebElement txtUserName= driver.findElement(By.id("username"));
		txtUserName.sendKeys("tukartsand");
		WebElement txtPassword= driver.findElement(By.id("password"));
		txtPassword.sendKeys("1234568");
		WebElement btnLogin= driver.findElement(By.name("login"));
		btnLogin.click();	
	     System.out.println("Test1");	
	}
	
	
}


