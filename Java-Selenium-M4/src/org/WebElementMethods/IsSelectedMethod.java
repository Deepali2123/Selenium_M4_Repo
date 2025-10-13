package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("birajdardeepali599@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deep2123");
		WebElement rememberMeCB = driver.findElement(By.id("RememberMe"));
		if(rememberMeCB.isSelected()) {
			System.out.println("Rememberme check box is selected");
		}
		else {
			System.out.println("Rememberme check box is not selected");
			rememberMeCB.click();
		}
		boolean result = rememberMeCB.isSelected();
		System.out.println(result);
		

	}

}
