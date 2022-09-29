package testngframework;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.org.Baseclass;
import utility.org.LoginPojo;

public class TestNgwithparametersoptional extends Baseclass {
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
	
	//valid username and invalid password
	@Test(enabled=false,priority=2)
	private void tc2() throws IOException, InterruptedException{
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), getData(2, 0, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		fill(l.getTxtPass(), getData(2, 1, "Greens","C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx "));
		btnClick(l.getBtnLogin());
		Thread.sleep(2000);
	}
	
	//invalid username and invalid password
	@Parameters({"cricket", "fruits"})
	@Test
	private void tc1(@Optional("Jadeja")String s1,@Optional("Greens123") String s2) throws IOException, InterruptedException {
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(), s1);
		fill(l.getTxtPass(), s2);
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
}
