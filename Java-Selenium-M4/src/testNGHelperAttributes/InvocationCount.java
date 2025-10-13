package testNGHelperAttributes;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(priority = 1,invocationCount = 5)
  public void login() {
	  Reporter.log("This Is Login Method", true);
  }
  @Test(invocationCount = 0)
  public void register() {
	  Reporter.log("This Is Register Method", true);
  }
  @Test(priority = 2,invocationCount = 3)
  public void addToCart() {
	  Reporter.log("This Is Add To Cart Method", true);
  }
}
