package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	//Declaration
	
	@FindBy(id= "gender-male") private WebElement maleRadioButton;
	@FindBy(id= "gender-female") private WebElement femaleRadioButton;
	@FindBy(id= "FirstName") private WebElement registerFirstNameTextBox;
	@FindBy(id= "LasttName") private WebElement registerLastNameTextBox;
	@FindBy(id= "Email") private WebElement registerEmailTextBox;
	@FindBy(id= "Password") private WebElement registerPasswordTextBox;
	@FindBy(id= "ConfirmPassword") private WebElement registerConfirmPasswordTextBox;
	@FindBy(id= "register-button") private WebElement registerButton;
	
	//Initialization
	
	 public RegisterPage(WebDriver driver) 
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Utilization

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getRegisterFirstNameTextBox() {
		return registerFirstNameTextBox;
	}

	public WebElement getRegisterLastNameTextBox() {
		return registerLastNameTextBox;
	}

	public WebElement getRegisterEmailTextBox() {
		return registerEmailTextBox;
	}

	public WebElement getRegisterPasswordTextBox() {
		return registerPasswordTextBox;
	}

	public WebElement getRegisterConfirmPasswordTextBox() {
		return registerConfirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	 
	 
	 
	
}
