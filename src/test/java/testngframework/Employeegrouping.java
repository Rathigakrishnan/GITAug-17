package testngframework;

import org.testng.annotations.Test;

public class Employeegrouping {

	//@Test(groups="sanity")
	//@Test(groups= {"smoke","cricket"})//OR operator
	@Test(groups= {"smoke,cricket"})//AND operator
	private void tc4() {
		System.out.println("Test 4");

	}
	
	@Test(groups="smoke")
	private void tc2() {
		System.out.println("Test 2");

	}
	
	@Test(groups= {"regression","cricket"})
	private void tc1() {
		System.out.println("Test 1");

	}
	
	@Test(groups="regression")
	private void tc3() {
		System.out.println("Test 3");

	}
}
