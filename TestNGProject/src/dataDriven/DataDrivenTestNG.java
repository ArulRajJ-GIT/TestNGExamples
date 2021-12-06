package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//DataDriven concept within same class by passing the DataProvider Annotations

public class DataDrivenTestNG {
	
	@DataProvider(name="login") //assign it and it can be assign more than one
	private String[][] login() {
		String[][] set=new String[2][2];
		set[0][0]="arulseba93@gmil.com";
		set[0][1]="arulseba93";
		
		set[1][0]="arulraj93@gmil.com";
		set[1][1]="arulseba93";
		
		return set;
		
	}
	@Test(dataProvider="login") //Calling the Data Provider with the assigned name "login"
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
