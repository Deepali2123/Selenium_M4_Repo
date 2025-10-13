package testNGAssertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert {
	
  @Test
  public void login() throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  String expectedWelcomePageTitle= "Demo Web Shop";
	  
	  String expectedLoginPageTitle = "Demo Web Shop. Login";
	  
	  Assert.assertEquals(driver.getTitle(), expectedWelcomePageTitle, "Welcome Page Is Not Displayed!!");  
	  
	  driver.findElement(By.linkText("Log in")).click();
	  
	  Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle, "Login Page Is Not Displayed!!");
	  
	  Assert.assertEquals(driver.findElement(By.id("Email")).isDisplayed(), true, "Email TextBox Is Not Displayed!!");
	  
	  driver.findElement(By.id("Email")).sendKeys("himamarishinchannohara21@gmail.com");
	  Thread.sleep(500);
	  
	  Assert.assertEquals(driver.findElement(By.id("Password")).isDisplayed(), true, "Password TextBox Is Not Displayed!!");
	  
	  driver.findElement(By.id("Password")).sendKeys("Scinchan2123");
	  Thread.sleep(500);
	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed(), true, "Login TextBox Is Not Displayed!!");
	  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  Thread.sleep(500);
	  
	  driver.close();
  }
}



