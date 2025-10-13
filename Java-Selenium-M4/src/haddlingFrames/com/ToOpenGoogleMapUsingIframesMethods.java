package haddlingFrames.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenGoogleMapUsingIframesMethods {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(1000);
		
		
		//To Find Google Apps and click on it
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		Thread.sleep(1000);
		
		
		//To switch the control to the frame using index
		//driver.switchTo().frame(0);
		
		//To switch the control to the frame using value of name or id attribute
		//driver.switchTo().frame("app");
		
		//To locate and find the frame where 'Maps' is present
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		
		//To Switch the control to the located frame
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		

	}

}
