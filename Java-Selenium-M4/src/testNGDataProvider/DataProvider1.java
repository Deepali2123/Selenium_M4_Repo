package testNGDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@DataProvider(name= "invalidcreds")
	public String [] [] dataProviderMethod()
	{		
		String [] [] data={ 
				{"qsp123@gmail.com","Qsp#123"},
				{"123QSP@yahoo.com","y A h O o"},
				{"qspiders@","qspiders$9876"},
				{"q s p@gmail.com","Wakad&123"}
		       };
		
		return data;
	}
	
  @Test(dataProvider = "invalidcreds" , dataProviderClass = testNGDataProvider.DataProvider1.class)
  public void invalidLogin1(String email, String password) throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
	  driver.get("https://demowebshop.tricentis.com/");
	  
	  driver.findElement(By.linkText("Log in")).click();
	  
	  driver.findElement(By.id("Email")).sendKeys(email);
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("Password")).sendKeys(password);
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("Email")).clear();
	  driver.findElement(By.id("Password")).clear();
	  driver.close();
  }
}

