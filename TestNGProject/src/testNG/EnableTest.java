package testNG;

import org.testng.annotations.Test;

public class EnableTest {

	@Test(priority=0)
	private void startCar() {
		System.out.println("Key Start");
	}

	@Test(priority=1)
	private void putGear() {
		System.out.println("Gear Shifting");
	}

	@Test(priority=2)
	private void accelerate() {
		System.out.println("Push Acce");
	}
	
	@Test(priority=3, enabled=false)
	private void turnMusicOn() {
		System.out.println("Turn the Music ON");
	}

}
