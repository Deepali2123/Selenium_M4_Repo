package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//driver.findElement(By.partialLinkText("WOMENS")).click();	
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).
		sendKeys("Bangels for womens");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		List<WebElement> prices = driver.findElements(By.xpath
		("//h3[text()='ZULKA']/..//span[contains(text(),Rs.)]"));	
		for(WebElement price:prices) {
	    	System.out.println(price.getText());
	    	Thread.sleep(500);
		}

	}

}
