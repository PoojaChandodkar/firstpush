package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fristdataprovider {
@Test(dataProvider="Login Data")
	public void testcase_01(int i,int j){
	System.out.println(i+"/t"+j);
}
@DataProvider(name="Login Data")
public Object[][]dataprovider(){
	Object obj[][]= {{10,15},{15,20},{20,35},{35,50}};
	return obj;
	
}
}
