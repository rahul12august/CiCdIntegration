package testCases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageActions.HomePageActions;
import pageObjects.BaseClass;
import utility.Utils;

public class TestCustomizeWebPage {
	public static WebDriver driver=null;
	public static ExtentReports report=null;
	public static ExtentTest logger;	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+File.separator+"ExtentReportResults.html");
	logger = report.startTest("Regression Test");
	}
	@Test
	  public void verifyUserIsAbleToSelectJapan() {
		try {
			logger.log(LogStatus.INFO, "Trying to Open Browser");
			driver=Utils.openBrowser();
			logger.log(LogStatus.PASS,"Successfully Open Browser");
			new BaseClass(driver);
			//HomePageActions.selectUsingVisibleText("selectByVisibleText", "selenium");
			//HomePageActions.selectFemaleChkBox();
			HomePageActions.selectJapan();
			logger.log(LogStatus.PASS,"Successfully Selected Japan");
		}catch(Exception e) {
			logger.log(LogStatus.FAIL,"Unable to Select Japan Radio Button");
		}
				
	}	
	
	@Test
	  public void verifyUserIsAbleToFemaleCheckBox() {
		try {
			logger.log(LogStatus.INFO, "Trying to Open Browser");
			driver=Utils.openBrowser();
			logger.log(LogStatus.PASS,"Successfully Open Browser");
			new BaseClass(driver);
			HomePageActions.selectFemaleChkBox();
			logger.log(LogStatus.PASS,"Successfully Selected Female Checkbox");
		}catch(Exception e) {
			logger.log(LogStatus.FAIL,"Unable to Select Female Checkbox");
		}
				
	}
	
	@Test
	  public void verifyUserIsAbleToSelectSeleniumFromDropDown() {
		try {
			logger.log(LogStatus.INFO, "Trying to Open Browser");
			driver=Utils.openBrowser();
			logger.log(LogStatus.PASS,"Successfully Open Browser");
			new BaseClass(driver);
			HomePageActions.selectUsingVisibleText("selectByVisibleText", "selenium");
			logger.log(LogStatus.PASS,"Successfully Selected Selenium From Drop Down");
		}catch(Exception e) {
			logger.log(LogStatus.FAIL,"Unable to Select Selenium From Drop Down");
		}
				
	}
	public void takeScreenshot() {
		/**
		 * lines of code
		 */
	}
	@AfterMethod
	public void quitSession() {
		driver.quit();
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(logger);
	report.flush();
	}
	
	
}
