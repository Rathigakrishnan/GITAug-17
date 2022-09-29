package testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgwithasserts {

	@Test
	private void tc4() {
		System.out.println("Test 4");

	}
	
	//Soft Assert
	@Test
	private void tc2() {
		SoftAssert s = new SoftAssert();
		s.assertTrue(true, "TESTING");
		System.out.println("Test 2");
		System.out.println("GREENS");
		s.assertAll();
		System.out.println("Sucess");
	}
	
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	
	//Hard Assert
	@Test
	private void tc3() {
		Assert.assertTrue(false, "checking");
		System.out.println("Test 3");

	}
}

