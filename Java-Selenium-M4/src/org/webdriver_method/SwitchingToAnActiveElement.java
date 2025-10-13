package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToAnActiveElement {

	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.switchTo().activeElement().sendKeys("KGF Chapter 2");

	}

}
