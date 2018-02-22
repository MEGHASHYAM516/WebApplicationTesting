package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadIOpetaions2 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\MEGHASHYAM\\Desktop\\TestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		     // 3
		int RowCount=sheet.getLastRowNum(); // identifying the Rows count in the Sheet with data -- this will the count of the rows -3
		      for(int a=0;a<=RowCount;a++) // Running the loop for the total no of Rows 
		      {
		    	  Row r=sheet.getRow(a); // Going to a particular Row in the Sheet
		    	      // 2
		    	  int CellCount=r.getLastCellNum(); // Identifuing the total cells the Row with the data -- Count of the Cells -2 
		    	  
		    	  for(int b=0;b<CellCount;b++) // Running the loop for the total no of Cell in the Row
		    	  {
		    		  Cell c=r.getCell(b); // Going to a particular Row of a Cell
		    		  String data=c.getStringCellValue(); // Getting the Row of a cell data
		    		  System.out.print(data+"  "); // Printing the Data
		    		 	    		  
		    	  }
		    	  
		    	  System.out.println();
		    	  		    	  
		      }
		    	  
		    	  
		
	}

}
