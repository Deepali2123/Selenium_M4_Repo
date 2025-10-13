package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandledDisableLink {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase7-archive-downloads.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(" //a[text()=' jdk-7u80-windows-i586.exe']")).click();
		
		WebElement disableLink = driver.findElement
				(By.xpath("//a[text()='Download jdk-7u80-windows-i586.exe']"));
		Thread.sleep(2000);
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()",disableLink);

	}

}
