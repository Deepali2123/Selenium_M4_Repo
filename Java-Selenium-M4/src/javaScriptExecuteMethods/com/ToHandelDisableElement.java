package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandelDisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		WebElement disTextBox = driver.findElement(By.id("tb2"));
		
		
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		
		//To pass input in disable  Text Box Element by using 'document'
		//jse.executeScript("document.getElementById('tb2').value='Deepali'");
		
		//To pass input in in Disable Text Box by using 'arguments[0]'
		jse.executeScript("arguments[0].value='Deeplai'",disTextBox);

	}

}
