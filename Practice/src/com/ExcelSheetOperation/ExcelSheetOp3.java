package com.ExcelSheetOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetOp3 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\MEGHASHYAM\\Desktop\\TestData2.xlsx");
		XSSFWorkbook workBook1 = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook1.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for (int a=0;a<RowCount;a++)
		{
			Row r=sheet.getRow(a);
			int CellCount=r.getLastCellNum();
			for(int b=0;b<CellCount;b++)
			{
				Cell c=r.getCell(b);
				String data=c.getStringCellValue();
				System.out.print(data+"  ");
				
			}
			System.out.println();
		}
		
	}

}
