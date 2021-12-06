package testNG;

import org.testng.annotations.Test;

public class GroupTest {
	
	//will call it in xml check with TestNG.xml
	
	@Test(groups="Apple")
	public void firstApple() {
		System.out.println("Apple XR");
	}
	
	@Test(groups="Apple2")
	public void secondApple() {
		System.out.println("Apple 11");
	}
	
	@Test(groups="MI")
	public void firstMI() {
		System.out.println("Redmi Note 5");
	}
	
	@Test(groups="MI1")
	public void secondMI() {
		System.out.println("Redmi Note 10 Pro");
	}
	
	@Test(groups="Samsung1")
	public void firstSamsung() {
		System.out.println("Samsung M30");
	}
	
	@Test(groups="Samsung")
	public void secondSamsung() {
		System.out.println("Samsung M50A");
	}
}
