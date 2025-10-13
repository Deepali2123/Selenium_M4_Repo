package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayArjitSinghAllSongs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://open.spotify.com/");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.id("username")).sendKeys("birajdardeepali599@gmail.com");
		
		//driver.findElement(By.xpath("//input[@placeholder='Email or username']"))
		//.sendKeys("birajdardeepali599@gmail.com",Keys.ENTER);
		
		//driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		//driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']"))
		//.sendKeys("Arijit singh songs");
		
		//driver.findElement(By.xpath("//input[@aria-label='What do you want to play?']"))
		//.sendKeys("Arijit singh songs");
		//driver.findElement(By.xpath("//div[text()='Arijit Singh All Songs ❤️']")).click();

	}

}
