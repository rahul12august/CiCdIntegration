package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass{
	public static WebElement element=null;
	public Login(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement txtBxEmail() {
		try {
			element=driver.findElement(By.id("login_email"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement txtBxPassword() {
		try {
			element=driver.findElement(By.id("login_password"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	public static WebElement btnLogin() {
		try {
			element=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
	
}
