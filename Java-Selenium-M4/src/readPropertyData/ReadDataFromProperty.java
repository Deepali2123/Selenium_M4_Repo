package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//To specify the location of the file
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//To Make the file ready to  read i.e to load all the keys
		Properties prop = new Properties();
		prop.load(fis);
		
		//To fetch the url
		String url = prop.getProperty("url");	
		System.out.println(url);//To print the  fetched url
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		
		//To launch the application by using the fetched url
		driver.get(url);

	}

}
