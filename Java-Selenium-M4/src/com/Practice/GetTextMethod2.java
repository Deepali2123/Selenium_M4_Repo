package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys("Deepali");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    WebElement errorMessage = driver.findElement(By.xpath("//span[@for='Email']"));
	    String errorTextMessage= errorMessage.getText();    
		System.out.println(errorTextMessage);

	}
}
