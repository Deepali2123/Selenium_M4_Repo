package org.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//To Find and click on Log in link
		driver.findElement(By.linkText("Log in")).click();
		
		//To find email Textbox
		WebElement emailTB = driver.findElement(By.id("Email"));
		String email = "birajdaedeepali599@gmail.com";
		emailTB.sendKeys(email); // to pass the email to emailTB
		
		//To fetch the attributes value
		String attValue = emailTB.getAttribute("value");
		System.out.println(attValue);// To print the attributes value
		
		// To verify whether correct email is getting entered
		if(email.equals( attValue)) {
			System.out.println("Email Is Entered Correctly");
		}
		else {
			System.out.println("Email Is Not Entered Correctly");
		}
		
	}

}
