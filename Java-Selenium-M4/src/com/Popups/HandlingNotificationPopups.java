package com.Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNotificationPopups {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
		Thread.sleep(8000);
		
		//Create the object of Robot Class to perform keyboard operations
		Robot robot = new Robot();
		
		//To press the TAB Button
		robot.keyPress(KeyEvent.VK_TAB);
		
		//To Release the TAB Button
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		//To Press the ENTER Button
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//To Release Enter Button
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
