package pageActions;

import pageObjects.RegisterUserHomePage;
import utility.Utils;

public class RegisterUserHomeActions {
	
	public static void clickOnSellingLink() {
		//RegisterUserHomePage.lnkSelling().click();
		Utils.click(RegisterUserHomePage.lnkSelling());
	}
}
