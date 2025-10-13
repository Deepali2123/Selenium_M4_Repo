package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletedPage {
	
	//Declaration
	
	@FindBy(xpath = "//div[@class='title']")private WebElement orderProcessedMsg;
	@FindBy(xpath = "//input[@value='Continue']")private WebElement completedContinueButton;
	
	//Initialization
	
	public CompletedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getOrderProcessedMsg() {
		return orderProcessedMsg;
	}

	public WebElement getCompletedContinueButton() {
		return completedContinueButton;
	}
}
