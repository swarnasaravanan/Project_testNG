package org.test;

import org.testng.annotations.*;

public class Sample {
	
	@BeforeClass
	private void beforeClass() {
	System.out.println("BeforeClass");	
	}
	
	@AfterClass
	private void afterClass() {
	System.out.println("AfterClass");	
	}
	
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("BeforeMethod");	
	}
	
	@AfterMethod
	private void afterMethod() {
	System.out.println("BeforeClass");	
	}
	
	@Test
	private void test1() {
	System.out.println("Test1");	
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
