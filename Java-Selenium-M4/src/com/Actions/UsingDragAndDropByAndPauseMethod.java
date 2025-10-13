package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDragAndDropByAndPauseMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		//To find the element that needs to be dragged and dropped
		WebElement dragMe = driver.findElement(By.xpath("//div[text()='Drag Me']"));
		Actions act = new Actions(driver);
		
		//To move the element 300 pixels (RHS) on X-Axis and then wait foe 2 seconds 
		act.dragAndDropBy(dragMe, 300, 0).pause(2000).perform();
		
		//To move the element 600 pixels (LHS) on X-Axis and then wait foe 2 seconds 
		//And then move it 250 pixels (downwards) on Y-Axis
		act.dragAndDropBy(dragMe, -600, 0).pause(Duration.ofSeconds(2)).dragAndDropBy(dragMe, 0, 250).perform();
		
		//To pause for 3 seconds  and move the element 500 pixels (RHS) on X-Axis and -300 pixels (Upward) on Y-Axis
		act.pause(3000).dragAndDropBy(dragMe, 500, -300).perform();

	}

}
