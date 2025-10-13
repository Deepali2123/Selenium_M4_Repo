package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchThePriceOfAProductInAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16 256 GB");
		driver.findElement(By.xpath("//div[@class='nav-right']")).click();
		Thread.sleep(2000);
		String price =driver.findElement(By.xpath
		("//span[contains(text(),'Pink')]/../../../..//span[@class='a-price']")).getText();
		System.out.println(price);
		driver.findElement(By.xpath
	    ("//span[contains(text(),'Pink')]/../../../..//button[text()='Add to cart']")).click();

	}

}
