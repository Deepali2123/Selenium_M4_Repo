package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		//To Scroll 550 pixels downward on Y-Axis
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(1000);
		
		//To Scroll 550 pixels downward on Y-Axis from current location (Offset)
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		
		//To Scroll -300 pixels Upward on Y-Axis from current location(Offset)
		jse.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		
		driver.quit();
	
		

	}

}
