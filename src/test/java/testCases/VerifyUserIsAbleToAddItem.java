package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageActions.HomePageActions;
import pageActions.ItemDisplayPageActions;
import pageActions.LoginPageActions;
import pageActions.RegisterUserHomeActions;
import pageActions.SellingPageActions;
import pageObjects.BaseClass;
import utility.Utils;

public class VerifyUserIsAbleToAddItem {
	WebDriver driver=null;
  @Test(enabled=false)
  public void verifyMandatoryErrorsForItemCreation() {
	  try {
		  driver=Utils.openBrowser();
		  new BaseClass(driver);
		  HomePageActions.clickOnLogin();
		  LoginPageActions.loginSuccessfullyToTechLift();
		  RegisterUserHomeActions.clickOnSellingLink();
		  SellingPageActions.clickOnItemToNavigateToItemDisplayPage();
		  ItemDisplayPageActions.verifyErrorMessagesInItemCreation();
		  Utils.closeSessions();
	  }catch(Exception e) {
		  e.printStackTrace();
		  throw e;
	  }
  }
  
  //verifyNewlyCreatedItemNameDisplayedFirst
  @Test
  public void verifySuccessfulCreationOfItem() throws Exception {
	  try {
		  driver=Utils.openBrowser();
		  new BaseClass(driver);
		  HomePageActions.clickOnLogin();
		  LoginPageActions.loginSuccessfullyToTechLift();
		  RegisterUserHomeActions.clickOnSellingLink();
		  SellingPageActions.clickOnItemToNavigateToItemDisplayPage();
		  ItemDisplayPageActions.verifyNewlyCreatedItemNameDisplayedFirst();
		  Utils.closeSessions();
	  }catch(Exception e) {
		  e.printStackTrace();
		  throw e;
	  }
  }
}
