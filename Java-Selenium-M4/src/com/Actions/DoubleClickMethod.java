package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		//driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
		
		//To find 'Double Click Button'
		WebElement doubleClickButton = driver.findElement
				(By.xpath("//button[contains(text(),'Double click Here')]"));
		
		//Create object of Action Class
		Actions act = new Actions(driver);
		
		//To perform Double Click Operation
		//act.doubleClick(doubleClickButton).perform();
		
		//act.moveToElement(doubleClickButton).doubleClick().perform();
		
		act.moveToElement(doubleClickButton).doubleClick().build().perform();
		
	}

}
