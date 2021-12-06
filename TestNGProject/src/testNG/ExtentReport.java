package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
	
	WebDriver driver=null;
	ExtentReports eReport;
	ExtentHtmlReporter htmlReporter;
	ExtentTest testCase;
	
	@BeforeSuite
	public void reporting() {
		
		eReport=new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		eReport.attachReporter(htmlReporter);
	}

	@Test
	public void openGoogle() {
		long startTime=System.currentTimeMillis();
		testCase=eReport.createTest("This Will open Google Page");
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Google Execution is: " +totalTime);
	}
	
	@Test
	public void openBIng() {
		long startTime=System.currentTimeMillis();
		testCase=eReport.createTest("This Will open Bing Page");
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Bing Execution is: " +totalTime); 
	}
	
	@Test
	public void openYahoo() {
		long startTime=System.currentTimeMillis();
		testCase=eReport.createTest("This Will open Yahoo Page");
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Yahoo Execution is: " +totalTime);
	}
	
	@AfterSuite
	public void closeBrowser() {

		driver.quit();
		eReport.flush();
	}

}
