package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paraTest {

	@Test
	@Parameters( {"emailID" , "password"}) //it will get Parameters from xml file and it will also get multiple parameter with comma
	private void schoolName(String  email, String pass) {  //need to pass as string with our own way
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(email); //pass "email" string that we initialized in method
		driver.findElement(By.id("pass")).sendKeys(pass); //pass "pass" string that we initialized in method
		//driver.quit();
	}

}
