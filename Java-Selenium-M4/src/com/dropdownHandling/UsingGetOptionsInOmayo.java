package com.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UsingGetOptionsInOmayo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("drop1"));
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		
		for(WebElement option : options) {
			String value = option.getAttribute("value");
			select.selectByValue(value);
			Thread.sleep(500);
		}
		
		

	}

}
