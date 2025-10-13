package testNGHelperAttributes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut = 15000)
	  public void instagram() {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  //driver.navigate().to("https://www.instagram.com/");
		  driver.get("https://www.instagram.com/");
	  }
}


