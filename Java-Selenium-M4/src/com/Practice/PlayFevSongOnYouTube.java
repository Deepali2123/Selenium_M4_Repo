package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayFevSongOnYouTube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Apna bana le piya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath
		("//a[contains(@aria-label,' Amitabh Bhattacharya 3 minutes, 25')]")).click();
		
		//("//a[contains(text(),'Apna Bana Le - Bhediya | Varun Dhawan, Kriti Sanon| Sachin-Jigar, Arijit Singh, Amitabh Bhattacharya')]"))
		//.click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='Skip']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		//driver.findElement(By.xpath("//span[text()='No thanks']")).click();

	}

}
