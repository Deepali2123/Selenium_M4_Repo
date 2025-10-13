package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//To find email text box
		WebElement emailTB = driver.findElement(By.id("email"));
		
		//To fetch the size of email text box
		Dimension emailTBSize = emailTB.getSize();
		
		//To fetch the width of email text box
		int emailTBWidth = emailTBSize.getWidth();
		
		//To fetch the height of email text box
		int emailTBHeight = emailTBSize.getHeight();
		
		//To print width and height of email text box
		System.out.println("Width is : "+emailTBWidth+ " Height is : "+emailTBHeight);



	}

}
