package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayArjitSingSong {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://open.spotify.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//div[@aria-labelledby='card-title-spotify:artist:4YRxDV8wJFPHPTeXepOstw-2 card-subtitle-spotify:artist:4YRxDV8wJFPHPTeXepOstw-2']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@aria-label='Play Apna Bana Le by Sachin-Jigar, Arijit Singh, Amitabh Bhattacharya']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//button[@aria-label='Play Apna Bana Le by Sachin-Jigar, Arijit Singh, Amitabh Bhattacharya']")).click();

	}

}
