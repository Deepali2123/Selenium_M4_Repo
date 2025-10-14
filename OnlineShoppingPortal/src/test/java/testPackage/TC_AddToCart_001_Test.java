package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.CartPage;
import pomRepository.CellPhonePage;
import pomRepository.ElectronicsPage;
import pomRepository.WelcomePage;

@Listeners(genericLibrary.MyListener.class)

public class TC_AddToCart_001_Test  extends BaseTest{
	
    @Test
	public  void addToCartTestCase() throws IOException, InterruptedException {	
		
		WelcomePage wp = new WelcomePage(driver);	
		wp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPlhoneLink().click();
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCartButton().click();
		
		System.out.println(cp.getProductAddingMsg().getText());
		
		wp.getShoppingCarLink().click();
		
		CartPage scp = new CartPage(driver);
		
		if(scp.getSmartPhoneCartItem().isDisplayed()) 
		{
			System.out.println("Product is added to cart");
		}
		else
		{
			System.out.println("Product is not added to cart");
		}
	}
}




