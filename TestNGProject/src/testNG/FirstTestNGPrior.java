package testNG;

import org.testng.annotations.Test;

public class FirstTestNGPrior {
	
	@Test(priority=0)
	public void printFirst() {
		System.out.println("First Execute");
	}
	
	@Test(priority=1)
	public void printSecond() {
		System.out.println("Second Execute");
	}
	
	@Test(priority=2)
	public void printThird() {
		System.out.println("Third Execute");
	}
	
	@Test(priority=3)
	public void printFourth() {
		System.out.println("Fourth Execute");
	}
}
