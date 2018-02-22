package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperations {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\MEGHASHYAM\\Desktop\\TestDatafile.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int k=0;k<=RowCount;k++)
		{
			Row r=sheet.getRow(k);
			int  cellCount =r.getLastCellNum();
			for(int p=0;p<cellCount;p++)
			{
				Cell c=r.getCell(p);
				String data=c.getStringCellValue();
				System.out.println(data);
			}
		}

	}

}
