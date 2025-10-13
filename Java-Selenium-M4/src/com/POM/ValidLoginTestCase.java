package com.POM;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.browserSetup();
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		Flib flib = new Flib();
		String email = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 0);
		String password = flib.readExcelData(EXCEL_PATH, VALIDCREDS, 1, 1);
		
		LoginPage lp=new LoginPage(driver);
		lp.validLogin(email, password);
		
		
		/*
		LoginPage lp = new LoginPage(driver);
		lp.getLoginEmailTextBox().sendKeys(email);
		Thread.sleep(500);
		
		lp.getLoginPasswordTextBox().sendKeys(password);
		Thread.sleep(500);
		
		lp.getLoginButton().click();
		Thread.sleep(500);
		
		wp.getLogOutLink().click();
		*/
	
	}
}
