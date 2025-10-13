package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPriceOfProductInFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Samsung");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		String price = driver.findElement(By.xpath
		("//div[text()='Samsung Galaxy Z Flip7 5G (Jetblack, 512 GB)']/../..//div[contains(text(),'₹')]"))
		.getText();
		System.out.println(price);

	}

}
