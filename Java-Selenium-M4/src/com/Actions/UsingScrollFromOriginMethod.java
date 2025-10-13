package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class UsingScrollFromOriginMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     //driver.get("https://www.flipkart.com/");
		 driver.get("https://www.yamaha-motor-india.com/");
		 WebElement originElement = driver.findElement(By.xpath
				 ("//h2[text()='Select Your']"));
		 ScrollOrigin scrollOrigin = ScrollOrigin.fromElement(originElement);
		 
		 Actions act = new Actions(driver);
		 
		 act.scrollFromOrigin(scrollOrigin, 0, 2000).perform();

	}

}
