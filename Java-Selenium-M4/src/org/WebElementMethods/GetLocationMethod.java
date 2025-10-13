package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//To find email text box
		WebElement emailTB = driver.findElement(By.id("email"));
		
		//To fetch the location of email text box
		Point emailTBLocation = emailTB.getLocation();
		
		//To fetch the X-axis of email text box
		int xaxis = emailTBLocation.getX();
		
		//To Fetch the Y-axis of email text box
		int yaxis = emailTBLocation.getY();
		
		//To print the X & Y Axis of email
		System.out.println("X-axis is : "+xaxis+" Y-axis is :" +yaxis);

	}

}
