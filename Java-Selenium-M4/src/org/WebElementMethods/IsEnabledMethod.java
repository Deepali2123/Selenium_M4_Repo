package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(2000);  //To stop the script for 2 seconds
		
		//To find and click on Disable action
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		//To find and store 'Name' text box
		WebElement nameTB = driver.findElement(By.id("name"));
		
		//To check whether 'Name' text box is Enabled or not
		boolean result = nameTB.isEnabled();
		
		if(result == true) {
			System.out.println("Name Text Box Is Enabled");
		}
		else {
			System.out.println("Name Text Box Is Not Enabled");
		}
		
		//To print the Result
		//System.out.println(result);
	}
}
