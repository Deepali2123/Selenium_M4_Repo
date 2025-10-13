package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayFevSongOnSoptify {

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
		Thread.sleep(50000);
		driver.findElement(By.xpath("//input[@aria-label='What do you want to play?']")).sendKeys("Arjit Singh All Songs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Arijit Singh All Songs ❤️']")).click();
		Thread.sleep(9000);
		
		//driver.findElement(By.xpath("//div[@aria-label='Now playing: Heeriye (feat. Arijit Singh) by Jasleen Royal, Arijit Singh, Dulquer Salmaan']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Play Heeriye (feat. Arijit Singh) by Jasleen Royal, Arijit Singh, Dulquer Salmaan']")).click();
		//driver.findElement(By.xpath("//*[name()='svg']/../../../../../../../../../../../../../../../../../../../../../../../../../..//div[@aria-label='Now playing: Heeriye (feat. Arijit Singh) by Jasleen Royal, Arijit Singh, Dulquer Salmaan']")).click();
		 
		 
		 //WebElement passwordTextBox = driver.findElement(By.id("Password"));
		// passwordTextBox.sendKeys("Radhya2123");

	}

}
