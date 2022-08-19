package datadriven.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.org.Baseclass;

public class BrowserlaunchBasic extends Baseclass {
	
	public static void main(String[] args) {
		
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		printTitle();
		printCurrentUrl();
		
		WebElement txtUser =driver.findElement(By.id("email"));
		fill(txtUser,"greens");
		rightClick(txtUser);
		
		WebElement txtPass =driver.findElement(By.id("pass"));
		fill(txtPass,"greens@123");
		
		dClick(txtPass);
	}

	
	
}
