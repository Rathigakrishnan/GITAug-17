package testngframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgOrders {

	@BeforeClass
	private void browser() {
		System.out.println("Chrome");

	}
	
	@AfterClass
	private void browserClose() {
		System.out.println("close ");

	}
	
	@Test(priority=-5)
	private void tc3() {
		System.out.println("Test 3");
	}
	
	@Test(enabled=false,priority=-3)
	private void tc2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=2)
	private void tc1() {
		System.out.println("test 1");
	}
	

	@Test(priority=9)
	private void tc5() {
		System.out.println("test 5");
	}
	

	@Test(priority=4,invocationCount=4)
	private void tc4() {
		System.out.println("test 4");
	}
	
	
	@BeforeMethod
	private void start() {
		System.out.println("start");

	}
	
	@AfterMethod
	private void end() {
		System.out.println("end");

	}
}
