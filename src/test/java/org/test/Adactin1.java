package org.test;


import java.util.Date;
import org.base.BaseClass;
import org.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Adactin1 extends BaseClass{
	
	
		
		@BeforeClass
		private void previousClass() {
		System.out.println("BeforeClass");
		}
		
		@AfterClass
		private void afterClass() {
		System.out.println("AfterClass");	
		}
		
		@BeforeMethod
		private void beforeMethod() {
		
			System.out.println("Test starts...."+new Date());
		   System.out.println("BeforeMethod");	
		}
		
		@AfterMethod
		private void afterMethod() {
		
			System.out.println("Test End...."+new Date());
		System.out.println("BeforeClass");	
		}
		
		@Test
		private void test1() {
		
			browserLaunch("Chrome");
			launchUrl("https://adactinhotelapp.com/");
			SoftAssert s= new SoftAssert();
			s.assertTrue(driver.getCurrentUrl().contains("adactin"), "verify url");
			LoginPage l= new LoginPage(driver);
			fill(l.getTxtUserName(),"tukartsand");
			s.assertEquals("tukartsand", l.getTxtUserName().getAttribute("value"),"verify username");
			fill(l.getTxtPassword(),"1234568");
			s.assertEquals("1234568", l.getTxtPassword().getAttribute("value"),"verify password");
			btnClick(l.getBtnLogin());
		     System.out.println("Test1");	
		     s.assertAll();
		}
		
	

		@Test
		private void test2() {
			System.out.println("Test2");

		}
		@Test
		private void test3() {
			System.out.println("Test3");

		}
		
	}

	
		
	



