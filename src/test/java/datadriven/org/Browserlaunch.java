package datadriven.org;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import utility.org.Baseclass;
import utility.org.LoginPOJO;

public class Browserlaunch extends Baseclass {
	
	// to get the user name and password from the excel and execute in the site
	// using LoginPOJO
	
	public static void main(String[] args) throws IOException {
		
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		
		LoginPOJO l = new LoginPOJO();
		
		//method-1(this ll reduce the coding lines without getting return type
		fill(l.getTxtUser(), getData(2, 1));
		
		//method-2
		WebElement txtPass = l.getTxtPass();
		fill(txtPass, getData(2, 0));
		
		WebElement btnLogin = l.getBtnLogin();
		btnClick(btnLogin);
		
		
	}

}
