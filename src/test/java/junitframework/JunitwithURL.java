package junitframework;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


import utility.org.LoginPOJO;
import utility.org.Baseclass;

public class JunitwithURL extends Baseclass {

	
	@Test
	public void tc1() {
		launchurl("https://www.facebook.com/");
		LoginPOJO l = new LoginPOJO();
		passText ("selenium", l.getEmailtxt());
		passText ("1234",l.getPasswordtxt());
		
		}
	
	@AfterClass
	public static void postCondition() {
		closeTheBrowser();
		
	}
	
	@After
	public void endDate() {
		Date d=new Date();
		System.out.println("d");
		
	}
	
	
	@Test
	public void tc3() {
		launchurl("https://www.amazon.in/");
	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println("d");
	}
	
	@Ignore
	
	@Test
	public void tc2() {
		launchurl("https://www.flipkart.com/");
	}
	
	@BeforeClass
	public static void preCondition() {
		launchBrowser();
	}
}
