package datadriven.org;

import java.io.IOException;
import org.openqa.selenium.WebElement;


import utility.org.Baseclass;

import utility.org.Pojologin;



public class Browserlaunch extends Baseclass {
	
	// to get the user name and password from the excel and execute in the site
	// using LoginPOJO
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		
		Pojologin p = new Pojologin();
		WebElement txtUser = p.getTxtUser();
		fill(txtUser, getData(1, 0, "Greens", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx"));
		
		WebElement txtPass = p.getTxtPass();
		fill(txtPass, getData(1, 1, "Greens", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx"));
		
		WebElement btnLogin = p.getBtnLogin();
		btnClick(btnLogin);
	}

}
