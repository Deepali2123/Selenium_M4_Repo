package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingWindowIdOfATab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String windowId=driver.getWindowHandle();
		System.out.println("Window Id :"+windowId);

	}

}
