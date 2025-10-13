package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingScrollToElementMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 //To find the target element till where we need to scroll
		 WebElement targetScrollElement = driver.findElement(By.xpath("//h3[text()='Customer service']"));
		 
		 //Create the object of an Actions Class
		 Actions act = new Actions(driver);
		 
		 //To pause for 1 second and then scroll till target Web element
		 act.pause(1000).scrollToElement(targetScrollElement).perform();

	}

}
