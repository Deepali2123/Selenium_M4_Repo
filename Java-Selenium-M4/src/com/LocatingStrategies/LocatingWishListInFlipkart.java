package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishListInFlipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("GOBOULT");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(By.xpath
		("//a[contains(text(),'Y1 with Zen ENC Mic')]/..//div[contains(text(),'Green')]/..//*[name()='svg' and @width='16']"))
		.click();

	}

}
