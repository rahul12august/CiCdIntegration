package utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Utils {
	public static WebDriver driver=null;
	public static WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+File.separator+"chromedriver");
		driver= new ChromeDriver();
		driver.get("file:///Users/rahultiwari/Downloads/dropdown.html");
		driver.manage().window().maximize();
		implicitWait();
		return driver;
	}
	private static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static void selectFromDropDown(WebElement el,String value, String text) throws Exception {
		Select select=new Select(el);
		if(value.equals("selectByValue")) {
			select.selectByValue(text);
		}else if(value.equals("selectByIndex")) {
			int i=Integer.parseInt(text);
			select.selectByIndex(i);
		}else if(value.equals("selectByVisibleText")){
			select.selectByVisibleText(text);
		}else {
			throw new Exception("Selection from drop down parameter is incorrect!");
		}
	}
	public static void click(WebElement element) {
		element.click();
	}

}
