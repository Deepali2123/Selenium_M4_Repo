package com.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement emailTB = driver.findElement(By.id("Email"));
		Thread.sleep(500);
		WebElement passwordTB = driver.findElement(By.id("Password"));
		Thread.sleep(500);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
		driver.navigate().refresh();
		
		//Solution For StaleElementException
		/*
		 driver.findElement(By.id("Email")).sendKeys("himamarishinchannohara21@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Scinchan2123");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
		 
		 */
		
		//When we go with this step we will got the StaleElementException
		
		emailTB.sendKeys("himamarishinchannohara21@gmail.com");
		passwordTB.sendKeys("Scinchan2123");
		loginButton.click();
		
	}
}

