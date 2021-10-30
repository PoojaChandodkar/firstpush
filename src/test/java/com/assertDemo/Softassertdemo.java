package com.assertDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertdemo {
	@Test
public void m1() {
	SoftAssert softly= new SoftAssert();
	softly.assertEquals(10, 12);
	softly.assertTrue(10%2==0);
	softly.assertEquals("hi","hi");
	softly.assertEquals("Hi", "Hello");
	softly.assertAll();
	System.out.println("continue...");
}
}
