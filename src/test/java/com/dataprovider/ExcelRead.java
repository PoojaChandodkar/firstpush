package com.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExcelRead {
	@Test(dataProvider="Number Data", dataProviderClass=Exceldataprovider.class)
public void tc_01(double i,double j){
	double result=(i+j);
	Assert.assertTrue(result%1==0,"Result is not even"+result);
}
}
