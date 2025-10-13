package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingXpathByContains {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[contains(text(),'Teal, 256 GB')]")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Teal, 256 GB')]")).click();

	}

}
