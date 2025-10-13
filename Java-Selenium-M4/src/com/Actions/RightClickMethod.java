package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		 WebElement yesOption = driver.findElement(By.xpath("//div[text()='Yes']"));
		 yesOption.click();
		String fetchText = driver.findElement(By.xpath
				("//span[text()='You selected \"Yes\"']")).getText();
		System.out.println(fetchText);
		
		
		
		

	}

}
