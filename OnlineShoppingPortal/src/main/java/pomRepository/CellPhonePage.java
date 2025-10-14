package pomRepository;

import org.apache.poi.ss.util.CellAddress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage {
	
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement smartPhoneAddToCartButton;
	
	@FindBy(xpath = "//p[@class='content']")private WebElement productAddingMsg;
	
	//Initialization
	
	public CellPhonePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	
	public WebElement getSmartPhoneAddToCartButton() {
		return smartPhoneAddToCartButton;
	}

	public WebElement getProductAddingMsg() {
		return productAddingMsg;
	}
}
