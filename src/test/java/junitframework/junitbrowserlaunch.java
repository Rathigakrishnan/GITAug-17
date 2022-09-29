package junitframework;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;

import utility.org.Baseclass;
import utility.org.LoginPojo;

public class junitbrowserlaunch extends Baseclass {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		winMax();
		
	}
	
	@AfterClass
	public static void browserClose() {
		closeBrowser();
	} 
	
	@Before
	public void startTime() {
		loadUrl("https://www.facebook.com");
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}
	//valid user name invalid password
	@Test
	public void tc1() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getData(1, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(1, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	//invalid user name and valid password
	@Test
	public void tc3() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getData(2, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(2, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	//valid user name and valid password
	@Test
	public void tc2() throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getData(3, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(3, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}

	}

