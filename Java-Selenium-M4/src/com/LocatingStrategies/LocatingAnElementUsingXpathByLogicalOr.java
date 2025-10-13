package com.LocatingStrategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingXpathByLogicalOr {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/New%20folder/LogicalOperators.html");
		 WebElement firstNameTextBox = driver.findElement(By.xpath("//input[@id='fn' or name='first']"));
		 firstNameTextBox.clear();
		 firstNameTextBox.sendKeys("Radhya");

	}

}
