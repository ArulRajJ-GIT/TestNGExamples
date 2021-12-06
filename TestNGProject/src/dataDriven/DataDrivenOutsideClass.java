package dataDriven;

//refering DataProvider Class

import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//public class DataDrivenOutsideClass extends DataProvider { //if we go for inheritance concept 
public class DataDrivenOutsideClass { // if we go with data provider use "dataProviderClass" in method by calling the class mentioned below
																																		//|
	@Test(dataProvider="login", dataProviderClass=DataProvider.class)  //<-----------------------------------------------------------------
	public void openBrowser(String email, String pass) {
		//System.out.println(email+" "+pass);
		
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.quit();
	}

}
