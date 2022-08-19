package utility.org;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample extends Baseclass{
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		
		launchurl("https://www.facebook.com/");
		
		LoginPOJO l = new LoginPOJO();
		
	/*	passText("selenium", l.getEmailtxt());
		passText("12345", l.getPasswordtxt());
		
		driver.navigate().refresh();
		
		
		passText("java", l.getEmailtxt());
		passText("6789", l.getPasswordtxt());
	*/
		
		passText("greens@123", l.getTxtuser());
		passText("12345", l.getTxtpass());
}
	
	}
