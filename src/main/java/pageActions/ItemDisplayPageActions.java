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
	
	public static void verifyNewlyCreatedItemNameDisplayedFirst() throws InterruptedException {
		String itemName="Test6";
		Thread.sleep(2000);
		Utils.click(ItemDisplayPage.lnkNew());
		ItemDisplayPage.txtBxItemCode().sendKeys("TC002");
		ItemDisplayPage.txtBxItemName().sendKeys(itemName);
		ItemDisplayPage.txtBxItemgroup().click();
		ItemDisplayPage.txtBxItemgroup().click();
		ItemDisplayPage.txtBxItemgroup().click();
		ItemDisplayPage.txtBxItemgroup().click();
		//ItemDisplayPage.txtBxItemgroup().sendKeys("A");

		Thread.sleep(1000);
		
		ItemDisplayPage.ddlItemGroupList().click();
		Utils.click(ItemDisplayPage.btnSave());
		Thread.sleep(2000);
		Utils.refresh();
		Thread.sleep(3000);
		String actual=ItemDisplayPage.lnkFisrtItemNameDisplayed().getText().toString();
		if(actual.contains(itemName)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
