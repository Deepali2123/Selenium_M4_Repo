package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	
	//Declaration
	
	//@FindBy(linkText = "Camera, photo")private WebElement cameraPhotoLink;
	
	//@FindBy(partialLinkText = "Cell phones") private WebElement cellPlhoneLink;
	
	@FindBy(partialLinkText = "Cell phones")private WebElement cellPhoneLink;
	
	//@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	//private WebElement addToCartButton;
	
	
	//Initialization
	
	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}	
}

