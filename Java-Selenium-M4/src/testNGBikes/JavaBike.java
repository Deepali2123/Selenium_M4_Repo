package testNGBikes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaBike {
	
  @Test(groups = "IT")
  public void launchJavaYezdi() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.jawayezdimotorcycles.com/");
		Thread.sleep(3000);
		driver.close();
  }
}
