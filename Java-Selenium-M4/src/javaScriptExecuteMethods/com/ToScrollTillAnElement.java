package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillAnElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(1000);
		
		WebElement targetElement = driver.findElement(By.xpath("//h3[text()='Customer service']"));
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		
		//To Scroll till the element gets display at the bottom of the screen
		jse.executeScript("arguments[0].scrollIntoView(false)",targetElement);
		
		
		
		
	}

}
