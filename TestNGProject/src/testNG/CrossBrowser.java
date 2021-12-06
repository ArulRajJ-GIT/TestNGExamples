package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//This is the program for CrossBrowser
//This Prog will not run bcos it has firefox driver error.


public class CrossBrowser {
	
	
	WebDriver driver=null;
	
	@Test
	@Parameters({"emailID", "password", "browser"})
	public CrossBrowser(String email, String password, String browser) {
				
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arul\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		/*switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
			testCase=eReport.createTest("OPen Google Browser");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Arul\\Downloads\\geckodriver.exe");
			testCase=eReport.createTest("OPen Firefox Browser");
			driver=new FirefoxDriver();
			break;
		default:
			
			break;
		}*/
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys(email); //pass "email" string that we initialized in method
		driver.findElement(By.id("pass")).sendKeys(password); //pass "pass" string that we initialized in method
		//driver.quit();
	}

}
