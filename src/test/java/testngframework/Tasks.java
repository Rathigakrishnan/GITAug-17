package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tasks {

	@BeforeClass
	private void preCondition() {
		System.out.println("launch the Browser...");

	}
	
	@Test
	private void tc1() {
		System.out.println("Test case 1");
	}
	
	
	@AfterMethod
	private void endDate() {
		System.out.println("test case ending date  & time");

	}
	
	@Test(invocationCount=4)
	private void tc3() {
		System.out.println("Test case 3");
	}
	
	@BeforeMethod
	private void startDate() {
		System.out.println("test case starting date & time");

	}
	
	@Test(enabled=false)
	private void tc2() {
		System.out.println("test case 2");
	}
	
	@AfterClass
	private void postCondition() {
		System.out.println("clse the browser");

	}
	
}
