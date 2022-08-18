package junitframework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {

	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
	}
	
	@AfterClass
	public static void postCondition() {
		System.out.println("close the browser");
	}
	
	@After
	public void endDate() {
		System.out.println("Test case end Date and time");
		
	}
	
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}
	
	@Before
	public void startDate() {
		System.out.println("Test Case Start Date and time");
	}
	
	@Ignore
	
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}
	
	@BeforeClass
	public static void preCondition() {
		System.out.println("launch the browser");
	}
}
	
	
	
	
	
	
	

