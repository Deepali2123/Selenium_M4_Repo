package testNGCrossBrowser;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationAndCrossBrowser {
	@Parameters({"bname","url"})
	@Test
	public void browserSetup(@Optional String browserValue,String url) throws IOException {
		
	    WebDriver driver=null;
		if(browserValue.equalsIgnoreCase("chrome"))
		{
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		}
		else
		{
			driver=new FirefoxDriver();
			//driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
}

