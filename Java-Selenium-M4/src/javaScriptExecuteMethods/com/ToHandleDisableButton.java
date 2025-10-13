package javaScriptExecuteMethods.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisableButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		
		WebElement disButton = driver.findElement(By.id("but1"));
		
		
		
		
		
		//To type cast Web driver ref. to JavaScriptExecutor
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click()",disButton);
		
		
		
		
		//To Scroll till the element gets display at the bottom of the screen
		//jse.executeScript("arguments[0].scrollIntoView(false)",targetElement);

	}

}
