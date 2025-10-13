package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LocatingFileUploadUsingClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		// To find choose file button
		WebElement chooseFileButton = driver.findElement(By.id("uploadfile"));
		
		//Create the object of Action class
		Actions act = new Actions(driver);
		
		//To perform click action on choose file button
		act.click(chooseFileButton).perform();
		



	}

}
