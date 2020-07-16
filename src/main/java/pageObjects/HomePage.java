package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Utils;
	
public class HomePage extends BaseClass{
	static WebElement element= null;
	public HomePage(WebDriver driver) {
		super(driver);
	}
public static WebElement ddlRandom() {
	try {
		element=driver.findElement(By.id("try"));
	}catch(Exception e) {
		throw e;
	}
	return element;
	
}
public static WebElement chkbxFemale() {
	try {
		element=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	}catch(Exception e) {
		throw e;
	}
	return element;
}

public static WebElement rdBtnJapan() {
	try {
		element=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	}catch(Exception e) {
		throw e;
	}
	return element;
}

public static WebElement lnkLogin() {
	try {
		element=driver.findElement(By.xpath("//a[text()='Login']"));
	}catch(Exception e) {
		throw e;
	}
	return element;
}


}
