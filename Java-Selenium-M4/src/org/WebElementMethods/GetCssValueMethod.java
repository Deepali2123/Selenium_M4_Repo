package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		//To find email text box
		WebElement emailTB = driver.findElement(By.id("Email"));
		
		//To send name in email text box
		emailTB.sendKeys("Deepali",Keys.ENTER);
		
		//To find  the error message
		WebElement errorMSG = driver.findElement(By.xpath("//span[@for='Email']"));
		
		//To fetch the color of error Message
		String errorMsgColor = errorMSG.getCssValue("color");
		
		// To print the color of error message
		System.out.println(errorMsgColor);
	}

}
