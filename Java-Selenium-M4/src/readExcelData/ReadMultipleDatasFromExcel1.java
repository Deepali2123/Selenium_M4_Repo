package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatasFromExcel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
        FileInputStream fis1 = new FileInputStream("./data/testData.xlsx");
		
		Workbook wb1 = WorkbookFactory.create(fis1);//To make the file ready to read
		
		Sheet sheet1 = wb1.getSheet("ipl");//To get into the sheet
		
		int rc = sheet1.getLastRowNum();
		System.out.println(rc);
		
		
		for(int i=1;i<rc;i++) {
		
		//To specify the location of the file	
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);//To make the file ready to read
		
		Sheet sheet = wb.getSheet("ipl");//To get into the sheet
		
		Row row = sheet.getRow(i);//To get into the row using index value
		
		Cell cell = row.getCell(0);//To get into the cell
		
		String data = cell.getStringCellValue();//To fetch the data from the cell
		
		System.out.println(data);//To print the data
		Thread.sleep(500);
		}
	}

}
