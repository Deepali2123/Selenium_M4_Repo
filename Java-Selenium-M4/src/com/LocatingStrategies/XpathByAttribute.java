package com.LocatingStrategies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("deep2123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Deep@2123");

	}

}
