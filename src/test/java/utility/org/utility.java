package utility.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utility {

	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();

	}

	public static void launchurl(String url) {
	driver.get(url);
	}
	
	public static void getThepageTitle() {
		String title=driver.getTitle();
	System.out.println(title);	
	}
	
	public static void getTheUrl() {
		String url=driver.getCurrentUrl();
	System.out.println(url);
	}
	
	public static void passText(String text,WebElement ele) {
		ele.sendKeys(text);
	}
	
	
	public static void clickWebElement(WebElement btnWebEle) {
		btnWebEle.click();
	}
	
	
}
