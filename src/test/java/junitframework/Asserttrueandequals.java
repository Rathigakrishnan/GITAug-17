package junitframework;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import utility.org.LoginPOJO;
import utility.org.utility;

public class Asserttrueandequals extends utility{
	
	@Test
	public void tc1() {
		launchurl("https://www.facebook.com/");
		String title =getThepageTitle();
		Assert.assertEquals("Chk the page title in TC1", "facebook", title.substring(0, 8));
		
		LoginPOJO l = new LoginPOJO();
		passText ("selenium", l.getEmailtxt());
		passText ("1234",l.getPasswordtxt());
		}
	
	@Test
	public void tc3() {
		launchurl("https://www.facebook.com/");
		String title =getThepageTitle();
		Assert.assertTrue("Chk the page title in TC3", title.contains("Facebook"));
		
		LoginPOJO l = new LoginPOJO();
		passText ("selenium", l.getEmailtxt());
		passText ("1234",l.getPasswordtxt());
		}
	
	@After
	public void endDate() {
		Date d=new Date();
		System.out.println("d");
		
	}
	
	
	@Test
	public void tc2() {
		launchurl("https://www.amazon.in/");
	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println("d");
	}
	
	@Ignore
	
	@Test
	public void tc4() {
		launchurl("https://www.flipkart.com/");
	}
	
	@BeforeClass
	public static void preCondition() {
		launchBrowser();
	}
}
