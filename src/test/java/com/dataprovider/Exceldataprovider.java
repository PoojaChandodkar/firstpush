package com.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.config.ExcelUtility;



public class Exceldataprovider {
@DataProvider(name="Number Data")
	public Object[][] numberData() throws IOException{
		ExcelUtility excel= new ExcelUtility();
		Object obj[][]= excel.readExcelAndLoadIntoArray("D:\\\\Numbers.xlsx");
		return obj;
		
	}
}
