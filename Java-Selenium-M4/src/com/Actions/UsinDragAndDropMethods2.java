package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsinDragAndDropMethods2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		
		//To find the drag element (drag target) 
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//To find the destination element(drop target)
	    WebElement dest1 = driver.findElement(By.id("droptarget"));
	    
	    //To fetch the color of the destination element before perform drop operation
	    String beforeDropColor =dest1.getCssValue("color");
	    System.out.println(beforeDropColor);
	    
	    //Create the object of Actions class
	    Actions act = new Actions(driver);
	    Thread.sleep(2000);
	    
	    //To perform drag and drop operation
		act.dragAndDrop(drag, dest1).perform();
		Thread.sleep(2000);
		//To find the destination element(drop target) once again
		WebElement dest2 = driver.findElement(By.id("droptarget"));
		String afterDropColor =dest2.getCssValue("color");
		System.out.println(afterDropColor);
		
		//To verify the if the element is getting dropped at the correct location
		if(beforeDropColor!=afterDropColor) {
			System.out.println("Element is dropped at right location");
		}
		else {
			System.out.println("Element is not dropped at right location");
		}


	    

	}

}
