package junitframework;

import org.junit.Assert;
import org.junit.Test;

public class Employee {
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");

	}

	@Test
	public void tc2() {
		System.out.println("Test case 2");

	}
	
	@Test
	public void tc1() {
		Assert.assertTrue(false);;
		System.out.println("Test case 1");

	}
}
