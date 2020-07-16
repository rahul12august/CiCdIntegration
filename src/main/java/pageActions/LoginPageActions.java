package pageActions;

import pageObjects.Login;
import utility.Utils;

public class LoginPageActions {
	public static void enterEmail() {
		//Login.txtBxEmail().sendKeys("testology.qa.learning@gmail.com");
		Utils.enterText(Login.txtBxEmail(), "testology.qa.learning@gmail.com");
	}
	public static void enterPassword() {
		//Login.txtBxPassword().sendKeys("Testology@123");
		Utils.enterText(Login.txtBxPassword(), "Testology@123");
	}
	
	public static void clickOnLogin() {
		//Login.btnLogin().click();
		Utils.click(Login.btnLogin());
	}
	
	public static void loginSuccessfullyToTechLift() {
		Utils.enterText(Login.txtBxEmail(), "testology.qa.learning@gmail.com");
		Utils.enterText(Login.txtBxPassword(), "Testology@123");
		Utils.click(Login.btnLogin());
		
	}
}
