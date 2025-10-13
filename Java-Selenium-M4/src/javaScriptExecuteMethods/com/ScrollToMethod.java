package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		
		//To scroll 500 pixels downward on Y-Axis(using coordinates(0,0))
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
		
		//To scroll 200 pixels downward on Y-Axis(using coordinates(0,0))
		jse.executeScript("window.scrollTo(0,200)");
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
