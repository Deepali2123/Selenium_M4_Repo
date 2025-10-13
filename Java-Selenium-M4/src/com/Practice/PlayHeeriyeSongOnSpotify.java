package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayHeeriyeSongOnSpotify {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(3000);
		WebElement emailTextBox = driver.findElement(By.xpath("//input[@placeholder='Email or username']"));
		emailTextBox.sendKeys("deepalibirajdar777@gmail.com");
		driver.findElement(By.xpath("//button[@id='login-button']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//input[@aria-label='What do you want to play?']")).sendKeys("Heeriye(feat.Arjit Singh)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Heeriye (feat. Arijit Singh)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='e-91000-baseline e-91000-overflow-wrap-anywhere e-91000-button-primary__inner encore-bright-accent-set e-91000-button-icon-only--large']")).click();
		
		//driver.findElement(By.xpath("//div[@data-testid='herocard-click-handler']")).click();
		//driver.findElement(By.xpath("//span[@class='e-91000-baseline e-91000-overflow-wrap-anywhere e-91000-button-primary__inner encore-bright-accent-set e-91000-button-icon-only--large']")).click();

	}

}
