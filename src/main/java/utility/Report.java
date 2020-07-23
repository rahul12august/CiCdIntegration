package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	public WebDriver driver=null;
	public static ExtentReports report=null;
	public static   ExtentTest logger;
	
	@BeforeTest(alwaysRun = true)
	public void beforeTest() 
	{
		try {
			// Set HTML reporting file location
			Date objNewDateFolder = new Date();
			SimpleDateFormat dateFormat_Folder = new SimpleDateFormat("yyyy_MM_dd");
			File file = new File(System.getProperty("user.dir") + "/results/" + dateFormat_Folder.format(objNewDateFolder));
			boolean status = file.mkdir();			
			if(status) {
				
				System.out.println("New directory is been created :)  ");
			}
			
			String strDatenow = dateFormat_Folder.format(objNewDateFolder);

			// created result file with time stamp in date folder at results folder
			Date objNewTimeFile = new Date();
			SimpleDateFormat dateFormat_File = new SimpleDateFormat("yyyy_MM_dd @ HH_mm_SS");
			
			report=new ExtentReports(System.getProperty("user.dir") + "/results/" + strDatenow + "/" + dateFormat_File.format(objNewTimeFile) + ".html");
			report.loadConfig(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"extentreport.xml"));

		}catch(Exception e) {
			throw e;
		}
	}
	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult  result)
	{  
		if(result.getStatus()==ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "Testcase : Passed ");

		} else{
			logger.log(LogStatus.FAIL, "Testcase : Failed ");
		} 
		driver.quit();
	}

	//LogReport
	public void reportStep(String desc, String status)  {

		if(status.trim().equalsIgnoreCase("PASS")) {
			logger.log(LogStatus.PASS, desc);		
		}else if (status.trim().equalsIgnoreCase("FAIL")) {
			logger.log(LogStatus.FAIL, desc);
			throw new RuntimeException();	
		}else {
			System.out.println("Test Step got skipped");
		}
	}
}
