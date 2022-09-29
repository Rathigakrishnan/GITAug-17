package testngframework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reruntestcases {
	
	@Test
	private void tc4() {
		System.out.println("Test 4");

	}
	
	//@Test(retryAnalyzer=Failed.class)
	@Test
	private void tc2() {
		Assert.assertTrue(false, "checking");
		System.out.println("Test 2");

	}
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	@Test
	private void tc3() {
		Assert.assertTrue(false, "checking");
		System.out.println("Test 3");

	}
	
	

}
