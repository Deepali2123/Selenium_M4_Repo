package org.webdriver_method;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigatitionMethodsWebPage {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Thread.sleep(3000);
		driver.get("https://www.jawamotorcycles.com/");
		Thread.sleep(3000); 
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.navigate().to(new URL("https://www.irctc.co.in/"));
		
		
				

	}

}
