package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	//Declaration
	
	@FindBy(xpath = "//th[contains(text(),'Product(s)')]/../../..//a[text()='Smartphone']")
	private WebElement smartPhoneCartItem;
	
	@FindBy(xpath = "//th[contains(text(),'Product(s)')]/../../..//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneRemoveCheckBox;
	
	@FindBy(name = "updatecart")private WebElement updateCartButton;
	@FindBy(name = "continueshopping")private WebElement continueShoppingButton;
	
	@FindBy(id = "termsofservice")private WebElement termsOfServicesCheckBox;
	@FindBy(id = "checkout")private WebElement checkoutButton;
	
	//Initialization
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getSmartPhoneRemoveCheckBox() {
		return smartPhoneRemoveCheckBox;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getContinueShoppingButton() {
		return continueShoppingButton;
	}

	public WebElement getTermsOfServicesCheckBox() {
		return termsOfServicesCheckBox;
	}

	public WebElement getCheckoutButton() {
		return checkoutButton;
	}	
}


