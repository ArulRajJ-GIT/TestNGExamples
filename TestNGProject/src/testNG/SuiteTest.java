package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteTest {
	
	//We have only a process a TestCase all the other are declared in Before and After Suite
	//it will run in single browser with time calcultion
	
	long startTime;
	long endTime;
	WebDriver driver;
	
	@BeforeSuite
	private void openBrowser() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@Test
	private void openGoogle() {
		/*long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("https://www.google.co.in/");
		/*driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Google Execution is: " +totalTime); */
	}
	
	@Test
	private void openBIng() {
		/*//long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("https://www.bing.com/");
		/*driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Bing Execution is: " +totalTime); */
	}
	
	@Test
	private void openYahoo() {
		/*//long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		/*driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Yahoo Execution is: " +totalTime);*/
	}

	@AfterSuite
	private void quitBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Execution is: " +totalTime);
	}
}
