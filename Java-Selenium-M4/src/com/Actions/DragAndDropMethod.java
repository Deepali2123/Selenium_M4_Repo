package com.Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	
		WebElement dragDest = driver.findElement(By.xpath("//div[@id='draggable']/..//p[text()='Dropped!']"));
		
		String destText = dragDest.getText();
		System.out.println(destText);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, dragDest).perform();

	}

}
