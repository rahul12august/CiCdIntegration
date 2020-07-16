package pageActions;

import pageObjects.Selling;
import utility.Utils;

public class SellingPageActions {
	public static void clickOnItemToNavigateToItemDisplayPage() {
		//Selling.lnkItem().click();
		Utils.click(Selling.lnkItem());
		
	}
}
