package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeTest {

	

	@Test(invocationCount=2, description="This is Thiruvalluvar")
	public void Thiruvalluvar() {
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Thiruvalluvar" +Keys.ENTER);	
		driver.quit();
	}
	
	@Test(invocationTimeOut=10000)
	public void cricket() {
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Cricket" +Keys.ENTER);	
		driver.quit();
	}


	/*@Test(priority=1)
	private void putGear() {
		System.out.println("Gear Shifting");
	}

	@Test(priority=2)
	private void accelerate() {
		System.out.println("Push Acce");
	}
	
	@Test(priority=0, enabled=false)
	private void turnMusicOn() {
		System.out.println("Turn the Music ON");
	}*/

}
