package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selling extends BaseClass{
	private static WebElement element=null;
	public Selling(WebDriver driver) {
		super(driver);
	}
	
	//below element will navigate to Item Creation and Display Page
	public static WebElement lnkItem() {
		try {
			element=driver.findElement(By.xpath("(//a[contains(text(),'Item')])[3]"));
		}catch(Exception e) {
			throw e;
		}
		return element;
	}
}
