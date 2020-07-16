package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUserHomePage extends BaseClass{
	private static WebElement element=null;
	public RegisterUserHomePage(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement lnkSelling() {
		try {
			element=driver.findElement(By.xpath("(//div[contains(text(),'Selling')])[1]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
	
}
