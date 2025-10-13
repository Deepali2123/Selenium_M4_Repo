package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	//Declaration
	
	@FindBy(id = "BillingNewAddress_CountryId")private WebElement billingAddressCountryDD;
	@FindBy(id = "BillingNewAddress_City")private WebElement cityTB;
	@FindBy(id = "BillingNewAddress_Address1")private WebElement address1TB;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")private WebElement pincodeTB;
	@FindBy(id = "BillingNewAddress_PhoneNumber")private WebElement phoneNoTB;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingAddressCountinueButton;
	
	//@FindBy(xpath = "//input[@onclick='Billing.save()']")
	//private WebElement billingAddressCountinueButton;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingAddressCountinueButton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodCountinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodCountinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoCountinueButton;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrderConfirmButton;
	
	@FindBy(id = "billing-address-select")private WebElement oldAddressDD;
	
	//Initialization
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getBillingAddressCountinueButton() {
		return billingAddressCountinueButton;
	}

	public WebElement getBillingAddressCountryDD() {
		return billingAddressCountryDD;
	}

	public WebElement getCityTB() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getPinCodeTB() {
		return pincodeTB;
	}

	public WebElement getPhoneNoTB() {
		return phoneNoTB;
	}

	public WebElement getShippingAddressCountinueButton() {
		return shippingAddressCountinueButton;
	}

	public WebElement getShippingMethodCountinueButton() {
		return shippingMethodCountinueButton;
	}

	public WebElement getPaymentMethodCountinueButton() {
		return paymentMethodCountinueButton;
	}

	public WebElement getPaymentInfoCountinueButton() {
		return paymentInfoCountinueButton;
	}

	public WebElement getConfirmOrderConfirmButton() {
		return confirmOrderConfirmButton;
	}

	public WebElement getOldAddressDD() {
		return oldAddressDD;
	}
	
	//Operational Method
	
	public void buyProductMethod(String city,String address1,String pincode,String phoneNo) throws InterruptedException
	{
		
		SelectUtility su = new SelectUtility();
		
		if(oldAddressDD.isDisplayed()) 
		{
			su.selectByVisibleText(oldAddressDD, "New Address");
		}
		else 
		{
		    su.selectByVisibleText(billingAddressCountryDD,"India");
		}
		
		su.selectByVisibleText(billingAddressCountryDD,"India");
		
		cityTB.sendKeys(city);
		address1TB.sendKeys(address1);
		pincodeTB.sendKeys(pincode);
		phoneNoTB.sendKeys(phoneNo);
		
		Thread.sleep(3000);
		
		//billingAddressCountinueButton.click();
		billingAddressCountinueButton.click();
		shippingAddressCountinueButton.click();
		shippingMethodCountinueButton.click();
		paymentMethodCountinueButton.click();
		paymentInfoCountinueButton.click();
		confirmOrderConfirmButton.click();
			
	}
}

