package junitframework;

import org.junit.Ignore;
import org.junit.Test;

public class TestSample {

	@Test
	public void tc11() {
		System.out.println("Test Case 11");

	}
	
	@Test
	public void tc13() {
		System.out.println("Test Case 13");

	}
	@Ignore
	@Test
	public void tc12() {
		System.out.println("Test Case 12");

	}
	
	@Test
	public void tc14() {
		System.out.println("Test Case 14");

	}
	
}
