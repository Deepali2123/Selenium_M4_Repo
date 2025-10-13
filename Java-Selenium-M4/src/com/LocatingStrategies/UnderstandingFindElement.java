package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingFindElement {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement passwordTexBox=driver.findElement(By.id("pass"));
	passwordTexBox.sendKeys("Deepali");
	passwordTexBox.sendKeys("123");
	driver.findElement(By.id("email")).sendKeys("deepali@gmail.com");
	driver.findElement(By.name("login")).click();

	}

}
