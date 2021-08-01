package org.test;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups="smoke")
	private void testA1() {
		System.out.println("TestA1");
	}
	
	@Test(groups="sanity")
	private void testA2() {
		System.out.println("TestA2");
	}
	
	@Test(groups="smoke")
	private void testA3() {
		System.out.println("TestA3");
	}
	
	@Test(groups="regression")
	private void testA4() {
		System.out.println("TestA4");
	}
	
	@Test(groups="sanity")
	private void testA5() {
		System.out.println("TestA5");
	}
	@Test
	private void testA6() {
		System.out.println("TestA6");
	}
	@Test
	private void testA7() {
		System.out.println("TestA7");
	}
	@Test
	private void testA8() {
		System.out.println("TestA8");
	}
	@Test
	private void testA9() {
		System.out.println("TestA9");
	}
	
	
	
	
	
	
	
	
	
	}

