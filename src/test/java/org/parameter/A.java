package org.parameter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	
		@Parameters({"username","password"})
		@Test
		private void testA1(String name,String pass) {
			System.out.println("TestA1");
			System.out.println(name);
			System.out.println(pass);
		}

		@Parameters({"password"})
		@Test
		private void testA2() {
			System.out.println("TestA2");
			System.out.println("pass");

		}
}
