package org.webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenNewTabNewWindow {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.fastrack.in/shop/watches");
	     Thread.sleep(2000);
	     //to open a new tab
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     driver.get("https://www.amazon.in/");
	     Thread.sleep(2000);
	     //to open a new windows
	     driver.switchTo().newWindow(WindowType.WINDOW);
	     driver.get("https://www.rolex.com/");
	     

	}

}
