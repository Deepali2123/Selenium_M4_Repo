package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterInDWS {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/register");
		 driver.findElement(By.id("gender-female")).click();
		 driver.findElement(By.id("FirstName")).sendKeys("Himamari");
		 driver.findElement(By.id("LastName")).sendKeys("Nohara");
		 driver.findElement(By.id("Email")).sendKeys("himamarishinchannohara21@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Scinchan2123");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("Scinchan2123");
		 driver.findElement(By.id("register-button")).click();

	}

}
