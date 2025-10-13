package com.Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleTheFileUploadPopUp {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://practice.expandtesting.com/upload");
		
	  WebElement fileUploadButton = driver.findElement(By.id("fileInput"));
	  Actions act = new Actions(driver);
	  act.click(fileUploadButton).perform();
	 
	  //Runtime.getRuntime().exec("");

	}

}
