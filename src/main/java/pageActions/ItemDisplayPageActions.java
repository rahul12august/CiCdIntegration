package pageActions;

import pageObjects.ItemDisplayPage;
import utility.Utils;

public class ItemDisplayPageActions {
	public static void verifyErrorMessagesInItemCreation() {
		boolean b=false;
		Utils.click(ItemDisplayPage.lnkNew());
		Utils.click(ItemDisplayPage.btnSave());
		b=Utils.verifyElementDisplayed(ItemDisplayPage.errMsgMissingRequiredFields());
		System.out.println(b);
		b=Utils.verifyElementDisplayed(ItemDisplayPage.lstItemCode());
		System.out.println(b);
		b=Utils.verifyElementDisplayed(ItemDisplayPage.lstItemgroup());
		System.out.println(b);
		
	}
}
