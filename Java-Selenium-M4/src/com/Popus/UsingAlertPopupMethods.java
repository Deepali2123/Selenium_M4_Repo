package com.Popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAlertPopupMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		
		//To find the "GetAlertButton" and click on it to get an Alert popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		//To switch the control to Alert popup
		Alert alt = driver.switchTo().alert();
		
		//To get the test present inside the "Alert" popup
		System.out.println(alt.getText());
		
		//To handle the popup by clicking on "OK" button
		alt.accept();

	}

}
