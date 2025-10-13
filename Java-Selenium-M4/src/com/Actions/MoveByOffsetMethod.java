package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		//To create the object of an Actions Class 
		Actions act = new Actions(driver);
		
		//To mouse-hover on an element (ELECTRONIC) Based on offset values
		act.moveByOffset(550, 200).perform();
		
		//To mouse-hover on an element (COMPUTER) based on the offset value
		//Destination element is present on LHS so provide -ve values for X-Axis
		act.pause(3000).moveByOffset(460-550,0).perform();

	}

}
