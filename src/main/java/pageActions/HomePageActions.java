package pageActions;

import pageObjects.HomePage;
import utility.Report;
import utility.Utils;

public class HomePageActions extends Report{
	static Report report=new Report();
	public static void selectUsingVisibleText(String methodName,String visibleText) {
		try {
			Utils.selectFromDropDown(HomePage.ddlRandom(), methodName, visibleText);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void selectJapan() {
		try {
			Utils.click(HomePage.rdBtnJapan());
		}catch(Exception e) {
			throw e;
		}
	}
	
	public static void selectFemaleChkBox() {
		try {
			Utils.click(HomePage.chkbxFemale());
		}catch(Exception e) {
			throw e;
		}
	}
	
	public static void clickOnLogin() {
		try {
			Utils.click(HomePage.lnkLogin());
		}catch(Exception e) {
			throw e;
		}
	}
}
