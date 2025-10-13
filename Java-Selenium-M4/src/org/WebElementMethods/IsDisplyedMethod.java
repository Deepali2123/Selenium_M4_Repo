package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplyedMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement image = driver.findElement(By.xpath("//img[@class='_bGlmZ_lifestyleImage_3B0SG']"));
		boolean result = image.isDisplayed();
		if(result==true) {
			System.out.println("Noise watch image is displayed");
		}
		else {
			System.out.println("Noise watch image is not displayed");
		}
		//System.out.println(result);

	}

}
