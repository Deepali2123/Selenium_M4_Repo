package com.LocatingStrategies;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingLoginPageUsingXpathContains {

	public static void main(String[] args) {
		 String expectedText = "Welcome, Please Sign In!";
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.linkText("Log in")).click();
		 WebElement loginPageText = driver.findElement(By.xpath("//h1[contains(text(), 'Sign In')]"));
		 String actualText = loginPageText.getText();
		 if(actualText.equals(expectedText)) {
			 System.out.println("Login Page Displayed Sucessfully");
		 }
		 else {
			 System.out.println("Login Page Is Not Displayed!!.Stop The Execution");
		 }
	}

}
