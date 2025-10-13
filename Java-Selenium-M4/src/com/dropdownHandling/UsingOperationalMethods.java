package com.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingOperationalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement dropdown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		select.selectByVisibleText("Audi");
		
		List<WebElement> selectedoptions = select.getAllSelectedOptions();
		System.out.println("====== Selected Options are : =======");
		for(WebElement option : selectedoptions) {
			System.out.println(option.getText());
		}
		List<WebElement> options = select.getOptions();
		
		options.removeAll(selectedoptions);
		System.out.println("======= Unselected Options are : ========");
		for(WebElement option:options) {
			System.out.println(option.getText());
			
		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First Selected Option : "+firstSelectedOption.getText());
		

	}

}
