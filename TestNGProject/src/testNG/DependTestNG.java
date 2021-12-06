package testNG;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class DependTestNG {

	@Test(enabled=false, alwaysRun=true) //enabled only it will execute
	public void primarySchool() {
		System.out.println("Finshed Primary School");
	}
	
	@Test
	private void higher() {
		System.out.println("Finshed Higher Secondry School");
		throw new NoSuchElementException("Element Not There"); //if we pass the exception the nxt dependent method will run bcos of always run option
	}
	
	@Test(dependsOnMethods="TestNG.DependTestNG.higher", alwaysRun=true) 
	private void college() {
		System.out.println("Finshed College Secondry School");
	}
}
