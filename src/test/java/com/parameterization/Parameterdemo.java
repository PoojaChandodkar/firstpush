package com.parameterization;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.config.BaseClass;

public class Parameterdemo extends BaseClass{
//	@Parameters({"num1","num2","num3"})
//	@Test
//public void m1(String x,String y,String z) {
//	// TODO Auto-generated method stub
//System.out.println(x+y+z);
//}
	@Test
	public void verifyTestingShastraHomePageTitle() {
		Assert.assertEquals(driver.getTitle(),"Testing Shastra");
	}
}
