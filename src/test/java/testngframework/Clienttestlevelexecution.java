package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clienttestlevelexecution {
	public static WebDriver driver; 
	@Parameters({"browser"})
	@Test
	private void tc2(String name) {
	System.out.println("Launch chrome");
	
	if(name.equals("chrome")) {
		//steps to launch chrome
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}
	else if(name.equals("ff")) {
		//steps to launch firefox
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();	
	}
	else {
		//steps to launch edge
		WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();	
		
	}
	 driver.get("https://www.facebook.com");
}
}