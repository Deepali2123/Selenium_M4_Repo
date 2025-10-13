package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowserAndNavigatingToYamahaMotors {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		System.out.println("Main ended");

	}

}
