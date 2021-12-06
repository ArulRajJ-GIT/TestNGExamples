package dynamicDataDrivenFromExcell;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunCalledMethod {
	
	@Test(dataProvider="getData", dataProviderClass=CallingSheetDataFromDyn.class)
	private void login(String data[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\vidhya & arul\\StuDIes\\2021 Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		driver.findElement(By.xpath("//button[contains(text(), 'LOGIN')]"));
		driver.quit();

	}

}
