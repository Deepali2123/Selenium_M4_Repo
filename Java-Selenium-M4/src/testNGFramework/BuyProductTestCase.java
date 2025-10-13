package testNGFramework;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(testNGFramework.MyListener.class)
public class BuyProductTestCase extends BaseTest {
	
    @Test
	public  void byProductTestCase() throws InterruptedException, IOException {		
		
		Flib flib = new Flib();
	
		WelcomePage wp = new WelcomePage(driver);	
		wp.getElectronicsLink().click();
		
		ElectronicsPage ep = new ElectronicsPage(driver);
		ep.getCellPhoneLink().click();
		
		CellPhonePage cp = new CellPhonePage(driver);
		cp.getSmartPhoneAddToCartButton().click();
		
		System.out.println(cp.getProductAddingMsg().getText());
		
		wp.getShoppingCarLink().click();
		
		CartPage scp = new CartPage(driver);
		
		if(scp.getSmartPhoneCartItem().isDisplayed()) {
			System.out.println("Product is added to cart");
		}
		else {
			System.out.println("Product is not added to cart");
		}
		
		scp.getSmartPhoneRemoveCheckBox().click();
		scp.getTermsOfServicesCheckBox().click();
		scp.getCheckoutButton().click();
		
		String city = flib.readExcelData(EXCEL_PATH, BUY_PRODUCT_DETAILS, 1, 0);
		String address1 = flib.readExcelData(EXCEL_PATH, BUY_PRODUCT_DETAILS, 1, 1);
		String pincode = flib.readNumericData(EXCEL_PATH, BUY_PRODUCT_DETAILS, 1, 2);
		String mob = flib.readNumericData(EXCEL_PATH, BUY_PRODUCT_DETAILS, 1, 3);
		
		SelectUtility su = new SelectUtility();
		String random = su.random();
		String contactNo = mob+random;
		
		CheckOutPage cop = new CheckOutPage(driver);
		cop.buyProductMethod(city, address1, pincode, contactNo);
		
	}
}


