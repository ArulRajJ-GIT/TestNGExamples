package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	
	// It will open three browser for three process bcoz we mentioned in XML thread-count-3

	
	@Test
	private void openGoogle() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Google Execution is: " +totalTime);
	}
	
	@Test
	private void openBIng() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Bing Execution is: " +totalTime); 
	}
	
	@Test
	private void openYahoo() {
		long startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.quit();
		long endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("The Time of Yahoo Execution is: " +totalTime);
	}
}
