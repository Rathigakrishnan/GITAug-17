package junitframework;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SampleOne {
	
	@Test
	public void tc21() {
		System.out.println("Test Case 21");

	}
	
	@Test
	public void tc23() {
		Assert.assertTrue(false);
		System.out.println("Test Case 23");

	}
	
	@Test
	public void tc22() {
		System.out.println("Test Case 22");

	}
	@Ignore
	@Test
	public void tc24() {
		System.out.println("Test Case 24");

	}

}
