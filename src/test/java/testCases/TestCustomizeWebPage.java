package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageActions.HomePageActions;
import pageObjects.BaseClass;
import utility.Utils;

public class TestCustomizeWebPage {
  WebDriver driver=null;
	@Test
  public void verifyUserIsAbleToSelctRadioCheckBoxAndDropDownValue() {
		driver=Utils.openBrowser();
		new BaseClass(driver);
		HomePageActions.selectUsingVisibleText("selectByVisibleText", "selenium");
		HomePageActions.selectFemaleChkBox();
		HomePageActions.selectJapan();
		
	
  }
}
