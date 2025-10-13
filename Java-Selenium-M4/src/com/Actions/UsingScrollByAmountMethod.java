package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingScrollByAmountMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     //driver.get("https://www.flipkart.com/");
		 driver.get("https://www.myntra.com/");
		 
		Actions act = new Actions(driver);
		
		//To perform Scroll operation on Y-Axis(Downwards)
		act.pause(2000).scrollByAmount(0, 6000).perform();
		//To perform scroll operation on Y-Axis(Upwards)
		act.pause(2000).scrollByAmount(0, -2000).perform();

	}

}
