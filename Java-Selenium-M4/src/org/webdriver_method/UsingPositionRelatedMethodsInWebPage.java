package org.webdriver_method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPositionRelatedMethodsInWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		Point position=driver.manage().window().getPosition();
		System.out.println("X axis:"+position.getX());
		System.out.println("Y axix:"+position.getY());
		Thread.sleep(4000);
		Point targetPosition=new Point(200,300);
		driver.manage().window().setPosition(targetPosition);
		
	}

}
