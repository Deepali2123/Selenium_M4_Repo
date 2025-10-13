package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[contains(@class,'logSprite')]")).click();
		driver.findElement(By.xpath("//p[text()='Round-trip']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(1000);
		driver.findElement
		(By.xpath("//span[text()='From']/../../../..//input[@type='text']")).sendKeys("Pune Airport");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Pune, India']/../..//p[text()='Pune Airport']"))
		.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath
		("//span[text()='To']/../../../..//input[@type='text']")).sendKeys("Kochi , India");
		Thread.sleep(1000);
		driver.findElement(By.xpath
		("//span[text()='Kochi, India']/../..//p[text()='Cochin International Airport Limited']")).click();

	}

}
