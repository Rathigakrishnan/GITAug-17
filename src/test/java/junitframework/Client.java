package junitframework;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Client {

	@Test
	public void tc23() {
		
		Assert.assertTrue(false);;
		System.out.println("Test case 23");

	}

	@Test
	public void tc22() {
		System.out.println("Test case 22");

	}
	@Ignore
	@Test
	public void tc21() {
		System.out.println("Test case 21");

	}
}
