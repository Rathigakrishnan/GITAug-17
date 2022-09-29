package testngframework;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import utility.org.Baseclass;
import utility.org.LoginPojo;

public class TestNgwithdataprovider extends Baseclass{
	@BeforeClass
	private void browser() {
		launchChrome();
		winMax();
	}
	
	@AfterClass
	private void browserClose() {
		closeBrowser();
	}
	
	//valid username invalid password
	@Test(priority=-5,invocationCount=2, enabled=false)
	private void tc3() throws IOException, InterruptedException{
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),getData(3, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(3, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	//4 combination
	@Test(enabled=true,priority=2,dataProvider="Login")
	private void tc2(String s1, String s2) throws IOException, InterruptedException{
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getData(2, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(2, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	
	
		@BeforeMethod
	private void start() {
		System.out.println(new Date());
		loadUrl("https://www.facebook.com");
	}
	
	@AfterMethod
	private void end() {
		System.out.println(new Date());

	}
	
	@DataProvider(name="Login")
	private Object[][] greens() {
		
		return new Object [][] {
			{"Java","java@123"},
			{"selenium","selenium@123"},
			{"oracle","oracle@123"},
			{"sql","sql@123"}
		};
		
	
	
		

	}
}
