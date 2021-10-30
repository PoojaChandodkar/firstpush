package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public Object[][] readExcelAndLoadIntoArray(String fileName) throws IOException {
		Object[][] obj;
		FileInputStream fis = new FileInputStream(fileName);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("NUMBERSHEET");
		int lastRow = sheet.getLastRowNum();

		obj = new Object[lastRow][sheet.getRow(0).getLastCellNum() - 1];

		for (int i = 1; i <= lastRow; i++) {

			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			for (int j = 1; j < lastCell; j++) {

				Cell cell = row.getCell(j);
				
				switch (cell.getCellType()) {
				case NUMERIC:
					obj[i - 1][j - 1] = cell.getNumericCellValue();
					break;
				case STRING:
					obj[i - 1][j - 1] = cell.getStringCellValue();
					break;
				default:
					System.err.println("Invalid cell value");
				}

				// System.out.print(cell.getNumericCellValue() + "\t");
			}
			System.out.println();
		}
		return obj;

		// cell.getStringCellValue();

	}

	public static void main(String[] args) throws IOException {
		new ExcelUtility().readExcelAndLoadIntoArray("D:\\Numbers.xlsx");
	}
}
