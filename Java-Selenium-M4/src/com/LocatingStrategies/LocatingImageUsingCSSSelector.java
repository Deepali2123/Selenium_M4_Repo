package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingImageUsingCSSSelector {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Mobiles")).click();
		 driver.findElement(By.cssSelector("img[alt='OnePlus Nord CE5']")).click();

	}

}
