package com.Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowOrBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		
		String parentWinId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String> allWinIds = driver.getWindowHandles();
		allWinIds.remove(parentWinId);
		
		for(String wi:allWinIds) {
			driver.switchTo().window(wi);
		}
		driver.close();

	}

}
