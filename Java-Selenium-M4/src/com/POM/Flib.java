package com.POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readPropertData(String propPath, String key) throws IOException {
		FileInputStream fis = new FileInputStream(propPath);//To specify the file path
		
		Properties prop = new Properties();
		prop.load(fis);   //To make the file ready to read		
		String data= prop.getProperty(key);//To fetch the required data
		return data;  //To return the fetched data
		
	}
	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
	
	   FileInputStream fis = new FileInputStream(excelPath);//To specify the location of the file
	   Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read	
	   Sheet sheet = wb.getSheet(sheetName);//To get into the sheet			
	   Row row = sheet.getRow(rowNo);//To get into the row			
	   Cell cell = row.getCell(cellNo);//To get into the cell			
	   String data = cell.toString();//To fetch the data present in the cell
	   return data;			
	}
	
	public String readNumericData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		
		   FileInputStream fis = new FileInputStream(excelPath);//To specify the location of the file
		   Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read	
		   Sheet sheet = wb.getSheet(sheetName);//To get into the sheet			
		   Row row = sheet.getRow(rowNo);//To get into the row			
		   Cell cell = row.getCell(cellNo);//To get into the cell			
		   double data = cell.getNumericCellValue();//To fetch the data present in the cell
		   
		   long data1=(long)data;
		   
		   String newData = String.valueOf(data1);
		   return newData;			
		}
	
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException  
	{
        FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//To get into the sheet	
		int rc = sheet.getLastRowNum();//To count the number of rows
		return rc;
		
	}
}
