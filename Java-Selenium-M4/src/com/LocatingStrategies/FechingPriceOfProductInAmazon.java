package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FechingPriceOfProductInAmazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for women");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price = driver.findElement(By.xpath
		("//span[contains(text(),'Noise Twist 2 Smart Watch ')]/../../../..//span[@class=\"a-price-whole\"]"))
		.getText();
		System.out.println(price);

	}

}
