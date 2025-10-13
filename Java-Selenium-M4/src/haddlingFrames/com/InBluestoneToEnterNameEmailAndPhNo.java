package haddlingFrames.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InBluestoneToEnterNameEmailAndPhNo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(3000);
		//To handle the pop up by clicking on deny button
		driver.findElement(By.id("denyBtn")).click();
		
		//To switch the control inside the frame
		driver.switchTo().frame("fc_widget");
		
		//To click on 'Chat-Icon' present in frame
		driver.findElement(By.id("chat-icon")).click();
		
		Thread.sleep(2000);
		//To switch the control back again on the main web page
		driver.switchTo().defaultContent();
		     		
        Thread.sleep(2000);
        //To enter the name in the 'Name Text Box'
		driver.findElement(By.id("chat-fc-name")).sendKeys("Deepali");
		
		Thread.sleep(2000);
		//To enter the name in the 'Email Text Box'
		driver.findElement(By.id("chat-fc-email")).sendKeys("birajdardeepali599@gmail.com");
		
		Thread.sleep(2000);
		//To enter the name in the 'Phone Number Text Box'
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7058215432");
		
		Thread.sleep(2000);
		//Click on 'Start Chat' button
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		
		
	}

}
