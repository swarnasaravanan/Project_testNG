package org.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	 @Test(dataProvider="login")
	 private void testA1(String user,String pass) {
		 System.out.println("TestA1");
		 System.out.println(user);
		 System.out.println(pass);
			 
	}
	 @Test
	 private void testA2() {
	System.out.println("TestA2");

	}

	 @Test
	 private void testA3() {
		System.out.println("TestA3");
	}
	 
	 
	 @DataProvider(name="login")
	 private Object[][]data()   {
	Object[][]d=new Object[][] {
		{"swarna","78952"},
		{"latha","123456"},
		{"kousik","8745632"},
		{"madhav","456789"}
	
		
	
	};	 
		return d;
	}	 
	 }

