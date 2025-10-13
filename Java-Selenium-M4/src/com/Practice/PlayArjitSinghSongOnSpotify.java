
package com.Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayArjitSinghSongOnSpotify {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://open.spotify.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email or username']"))
		.sendKeys("birajdardeepali599@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		//Thread.sleep(20000);	
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Arjit Singh All Songs");
		//driver.findElement(By.xpath("//input[@placeholder='What do you want to play?']"))		
		//.sendKeys("Arjit Singh All Songs");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Arijit Singh All Songs ❤️']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label='Play Arijit Singh All Songs ❤️'])[2]")).click();
		
		//driver.findElement(By.xpath
		//("//div[text()='Arijit Singh All Songs ❤️']/../../..//button[@aria-label='Play']")).click();		
		//driver.findElement(By.xpath("//div[text()='Arijit Singh All Songs ❤️']")).click();
		//driver.findElement(By.xpath("//span[text()='Playlist']")).click();
		//("//div[text()='Arijit Singh All Songs ❤️']/../../..//button[@aria-label='Play']")).click();
   
	}

}
