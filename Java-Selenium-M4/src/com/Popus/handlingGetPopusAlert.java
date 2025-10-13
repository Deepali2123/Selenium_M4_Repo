package com.Popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingGetPopusAlert {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		
	    driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Deepali");
		
		Thread.sleep(2000);
		alt.accept();

	}

}
