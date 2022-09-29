package junitframework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junitorder {

	
	@BeforeClass
	public static void browserLaunch() {
		System.out.println("Chrome");
	}
	
	@AfterClass
	public static void browserClose() {
		System.out.println("close chrome");
	}
	
	@Before
	public void startTime() {
		System.out.println("start");
		
	}
	
	@After
	public void endTime() {
		System.out.println("end");

	}
	@Ignore
	@Test
	public void tc2() {
		System.out.println("Test 2");

	}
	
	@Test
	public void tc1() {
		System.out.println("Test 1");

	}
	
	@Test
	public void tc3() {
		System.out.println("Test 3");

	}
}
