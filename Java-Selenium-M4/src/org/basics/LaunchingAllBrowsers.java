package org.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingAllBrowsers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of browser :");
		String browserName=sc.next();
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase ("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.get("https://www.zomato.com/india");
	}

}
