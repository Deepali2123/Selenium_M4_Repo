package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingButtonUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		WebElement button=driver.findElement(By.xpath("(//button[text()='Talk to us'])[2]"));
		button.click();
		Thread.sleep(1000);
		button.click();
		

	}

}
