package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		//To find password text box
		WebElement passwordTB = driver.findElement(By.id("pass"));
		//To fetch size and location Password text box togetherly
		Rectangle rec = passwordTB.getRect();
		
		//To fetch the width of password text box
		int passWidth = rec.getWidth();
		
		//To fetch the Height of password text box
		int passHeight = rec.getHeight();
		
		//To fetch the X-Axis of password text box
		int passXAxis = rec.getX();
		
		//To fetch the Y- Axis of password text box
		int passYAxis = rec.getY();
		
		//To print the width and height of password text box
		System.out.println("Width is : "+passWidth+" Height is :"+passHeight);
		
		//To print the X- axis & Y- axis of password text box
		System.out.println("X-Axis is : "+passXAxis+ " Y- Axis is : "+passYAxis);
	
		

	}

}
