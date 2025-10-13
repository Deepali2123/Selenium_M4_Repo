package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchParentTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String parentWindowId=driver.getWindowHandle();
		System.out.println(parentWindowId);
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);
		driver.get("https://www.myntra.com/");
		//to switch the control to a parents tab
		driver.switchTo().window(parentWindowId);

	}

}
