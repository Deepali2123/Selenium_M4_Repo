package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayLordShivaSongOnYouTube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']"))
		.sendKeys("namami shamishan nirvan roopam full song");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@title,'Namami Shamishan #')]")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//div[text()='Skip']")).click();
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();

	}

}
