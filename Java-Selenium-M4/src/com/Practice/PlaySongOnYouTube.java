package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySongOnYouTube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']"))
		.sendKeys("Lag ja gale");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath
		        ("//a[@aria-label='Lag Ja Gale Se Phir 4 minutes, 18 seconds']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(@class,'skip-ad')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		

	}

}
