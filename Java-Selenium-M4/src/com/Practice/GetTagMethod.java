package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagMethod {

	public static void main(String[] args) {
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   WebElement registerLink = driver.findElement(By.linkText("Register"));
	   // To Fetch The Tag Name Of Register Link
	   String registerTagName = registerLink.getTagName();
	   System.out.println(registerTagName);
	   WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
	   String searchTagName = search.getTagName();
	   System.out.println(searchTagName);

	}

}
