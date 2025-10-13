package com.Popus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopusMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		
		//To switch the control to Alert popup
		Alert alt = driver.switchTo().alert();
				
		//To get the test present inside the "Alert" popup
		System.out.println(alt.getText());
				
		//To clicking on "OK" button
		alt.accept();
		
		alt.dismiss();
		

	}

}
