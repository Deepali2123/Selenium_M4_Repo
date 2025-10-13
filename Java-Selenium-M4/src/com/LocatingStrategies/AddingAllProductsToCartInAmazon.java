package com.LocatingStrategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingAllProductsToCartInAmazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise watches for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> addToCartButtons = 
				driver.findElements(By.xpath("//button[text()='Add to cart']"));
		System.out.println(addToCartButtons.size());
		for(WebElement addToCart : addToCartButtons) {
			addToCart.click();
			Thread.sleep(800);
		}

	}

}
