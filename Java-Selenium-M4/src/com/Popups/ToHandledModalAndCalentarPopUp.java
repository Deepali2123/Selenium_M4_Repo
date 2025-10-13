package com.Popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandledModalAndCalentarPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		LocalDateTime ldt = LocalDateTime.now();
		String month = ldt.getMonth().toString();
		String newMonth = month.charAt(0)+month.substring(1).toLowerCase();
		System.out.println(newMonth);
		
		int day = ldt.getDayOfMonth();
		System.out.println(day);
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),"+newMonth+")]//../..//p[text()="+day+"]")).click();

	}

}
