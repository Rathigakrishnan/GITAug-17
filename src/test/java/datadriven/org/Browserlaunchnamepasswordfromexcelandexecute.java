package datadriven.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.org.Baseclass;

public class Browserlaunchnamepasswordfromexcelandexecute extends Baseclass {
	
	
	// to get the user name and password from the excel and execute in the site
	public static void main(String[] args) throws IOException {
			
			launchChrome();
			winMax();
			loadUrl("https://www.facebook.com");
			printTitle();
			printCurrentUrl();
			
			WebElement txtUser =driver.findElement(By.id("email"));
			fill(txtUser,getData(5, 0));
			rightClick(txtUser);
			
			WebElement txtPass =driver.findElement(By.id("pass"));
			fill(txtPass,getData(5, 2));
			
			dClick(txtPass);
		}

}
