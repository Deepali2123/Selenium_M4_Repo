package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInDWSUsingSendKeys2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.switchTo().activeElement();
		emailTextBox.sendKeys("admin03mail.com", Keys.CONTROL+"a");
		emailTextBox.sendKeys(Keys.CONTROL+"c");
		emailTextBox.sendKeys(Keys.TAB,Keys.CONTROL+"v");
	}

}
