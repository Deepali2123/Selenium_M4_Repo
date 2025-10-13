package com.Actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyUpAndKeyDownMethods {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 WebElement loginLink = driver.findElement(By.linkText("Log in"));
		 
		String parentWindowId= driver.getWindowHandle();
		 Actions act = new Actions(driver);
		 act.keyDown(Keys.CONTROL).click(loginLink).perform();
		 act.keyUp(Keys.CONTROL).perform();
		 
		 Set<String> allWindowsIds = driver.getWindowHandles();
		 allWindowsIds.remove(parentWindowId);
		 for(String wi:allWindowsIds) {
			 driver.switchTo().window(wi);
		 }
		 WebElement emailTB = driver.findElement(By.id("Email"));
		 act.sendKeys(emailTB, "deepalibirajdar777@gmail.com").perform();

	}

}
