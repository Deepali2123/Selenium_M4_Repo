package org.webdriver_method;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToAParticularTab {

	public static void main(String[] args) {
		String expectedPageUrl="https://www.zomato.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to swiggy
		
		driver.get("");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("");
		 Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		for(String windowId : allWindowIds) {
			
			
			
		}
		
		
		

	}

}
