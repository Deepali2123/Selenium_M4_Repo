package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		Thread.sleep(1000);		
		WebElement hiddenElement = driver.findElement(By.id("custom_gender"));
					
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
			
		jse.executeScript("arguments[0].value='Its Working ?'",hiddenElement);
		
		driver.findElement(By.xpath("//label[text()='Custom']")).click();

	}

}
