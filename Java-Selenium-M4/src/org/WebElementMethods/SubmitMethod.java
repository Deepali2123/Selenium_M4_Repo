package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("birajdardeepali599@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deep2123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.submit();

	}

}
