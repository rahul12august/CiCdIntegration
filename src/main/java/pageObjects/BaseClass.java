package pageObjects;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	static WebDriver driver=null;
	public BaseClass(WebDriver driver) {
		BaseClass.driver=driver;
	}

}
