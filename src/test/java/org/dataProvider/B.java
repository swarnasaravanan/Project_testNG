package org.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class B {

	 @Test(dataProvider="login")
	 private void testA1(String user,String pass,String a, String b) {
		 System.out.println("TestA1");
		 System.out.println(user);
		 System.out.println(pass);
			 System.out.println(a);
			 System.out.println(b);
	}
	 @Test
	 private void testA2() {
	System.out.println("TestA2");

	}

	 @Test
	 private void testA3() {
		System.out.println("TestA3");
	}
	 
	 
	 @DataProvider(name="login",indices= {1,3},parallel=true)
	 private Object[][]data()   {
	Object[][]d=new Object[][] {
		{"swarna","78952","Latha","saravanan"},
		{"latha","123456","swarna","saravanan"},
		{"kousik","8745632","swarna", "saravanan"},
		{"madhav","456789","saravanan","Latha"}
	
		
	
	};	 
		return d;
	}	 
	 }


