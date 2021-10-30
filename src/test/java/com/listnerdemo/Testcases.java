package com.listnerdemo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.config.BaseClass;

@Listeners(Mylistener.class)
public class Testcases extends BaseClass2 {
	@Test
	public void m1() {
		System.out.println("testcase 1");
	} 
	@Test
	public void m2() {
		
		throw new AssertionError();
	}
	@Test
	public void m3() {
		System.out.println("testcase 3");
	}
	@Test
	public void m4() {
		System.out.println("testcase 4");
	}
}
