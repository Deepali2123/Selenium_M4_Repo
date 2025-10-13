package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//To find and click on Mouse Action Option
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		//To find and click on 'Click and Hold' Option
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		//To find the target element i.e 'Circle'
		WebElement targetElement = driver.findElement(By.id("circle"));
		
		//Create the object of Action class
		Actions act = new Actions(driver);
		
		//To click and hold on the target element
		act.clickAndHold(targetElement).perform();
		
		Thread.sleep(5000);
		
		//To perform release operation
		act.release(targetElement).perform();
	}

}
