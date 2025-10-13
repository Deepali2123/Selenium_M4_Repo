
package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInDWS {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/login");
		 WebElement emailTextBox = driver.findElement(By.id("Email"));
		 emailTextBox.sendKeys("admin02@gmail.com");
		 
		 WebElement passwordTextBox = driver.findElement(By.id("Password"));
		 passwordTextBox.sendKeys("Admin02");
		 
		 WebElement rememberMeCheckBox = driver.findElement(By.id("RememberMe"));
		 rememberMeCheckBox.click();
		 Thread.sleep(2000);
		 rememberMeCheckBox.click();	

	}

}
