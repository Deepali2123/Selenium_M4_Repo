package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//To specify the location of the file
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		
		//To make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		//To get into the sheet
		Sheet sheet = wb.getSheet("ipl");
		
		Row row = sheet.getRow(1);//To get into the row
		
		Cell cell = row.getCell(0);//To get into the cell
		
		String data = cell.getStringCellValue();//To fetch the data present in the cell
		
		System.out.println(data);//To print the data
	}
}
