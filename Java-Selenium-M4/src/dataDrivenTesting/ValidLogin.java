package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		Flib flib = new Flib();
		
		String email = flib.readExcelData("./data/testData.xlsx","validcreds",1,0);
		String password = flib.readExcelData("./data/testData.xlsx","validcreds",1,1);
		
	   /*
	    FileInputStream fis1 = new FileInputStream("./data/testData.xlsx");  
	    Workbook wb = WorkbookFactory.create(fis1);
	    Sheet sheet = wb.getSheet("validcreds");
	    Row row = sheet.getRow(1);
	    Cell cell = row.getCell(0);
	    String email = cell.getStringCellValue();   
	    Cell cell1 = row.getCell(1);
	    String password = cell1.getStringCellValue();*/
	   
	  /*  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url); */
		
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		
		/* driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(500);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click(); */
	}
}
