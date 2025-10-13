package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	
	@FindBy(id= "Email") private WebElement loginEmailTextBox;
	@FindBy(id= "Password") private WebElement loginPasswordTextBox;
	@FindBy(id= "RememberMe") private WebElement rememberMeCheckBox;
	@FindBy(linkText = "Forgot password?") private WebElement forgotPasswordLink;
	@FindBy(xpath = "//input[@value='Log in']") private WebElement loginButton;
	
	//Initialization
	
	 public LoginPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Utilization

	public WebElement getLoginEmailTextBox() {
		return loginEmailTextBox;
	}

	public WebElement getLoginPasswordTextBox() {
		return loginPasswordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Operational Method / Business Logic
	
	public void validLogin(String email,String password) throws InterruptedException 
	{
		loginEmailTextBox.sendKeys(email);
		Thread.sleep(500);
		
		loginPasswordTextBox.sendKeys(password);
		Thread.sleep(500);
		loginButton.click();	
	}
	
	public void invalidLogin(String email,String password) throws InterruptedException
	{
		loginEmailTextBox.sendKeys(email);
		Thread.sleep(500);
		
		loginPasswordTextBox.sendKeys(password);
		Thread.sleep(500);
		
		loginButton.click();
		Thread.sleep(500);
		
		loginEmailTextBox.clear();
		loginPasswordTextBox.clear();
		Thread.sleep(1000);
	}
}
