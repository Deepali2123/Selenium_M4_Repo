package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLOginUsingPropertyData {

	public static void main(String[] args) throws IOException {
		
		//To specify the location of the file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//Create the object of 'Properties' class
		Properties prop = new Properties();
		prop.load(fis);//To make the file ready to read
		
		String url = prop.getProperty("url");//To Fetch the url from property file
		String email = prop.getProperty("email");//To Fetch the email from property file
		String password = prop.getProperty("password");//To Fetch the password from property file
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.get(url);//To launch the application by using the fetched url
		
		driver.findElement(By.linkText("Log in")).click();
		
		//To perform login by using the fetched email and password
		driver.findElement(By.id("Email")).sendKeys(email);		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}

}
