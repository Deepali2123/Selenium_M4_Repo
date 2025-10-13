package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToUnderstandFlowOfAnnotations {
  @Test
  public void test1() {
	  Reporter.log("This is test case 1", true);
  }
  
  @AfterSuite
  public void afterSuiteMethod() {
	  Reporter.log("This is after suite method", true);
  }
  
  @BeforeSuite
  public void beforeSuiteMethod() {
	  Reporter.log("This is before suite method", true);
  }
  
  @AfterTest
  public void afterTestMethod() {
	  Reporter.log("This is after test method", true);
  }
  
  @BeforeTest
  public void beforeTestMethod() {
	  Reporter.log("This is before test method", true);
  }
  
  @AfterClass
  public void afterClassMethod () {
	  Reporter.log("This is after class method", true);
  }
  
  @BeforeClass
  public void beforeClassMethod() {
	  Reporter.log("This is before class method", true);
  }
  
  @AfterMethod
  public void afterMethos() {
	  Reporter.log("This is after method", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is  before method", true);
  }
  
  @Test
  public void test3() {
	  Reporter.log("This is test case 3", true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("This is test case 2", true);
  }
}


