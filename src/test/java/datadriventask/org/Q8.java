package datadriventask.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.org.Baseclass;

public class Q8 extends Baseclass {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	launchChrome();
	winMax();
	loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");

	Thread.sleep(2000);
	
	WebElement txtUser =driver.findElement(By.id("first-name"));
	fill(txtUser,getData(1, 0, "Q4", "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Clone Maven Configuration\\\\GITAug-17\\\\Excel\\\\DataDrivenTask.xlsx"));

	
	WebElement txtlname =driver.findElement(By.id("last-name"));
	fill(txtlname,getData(1, 1, "Q4", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtmail =driver.findElement(By.id("email"));
	fill(txtmail,getData(1, 1, "Q4", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtmobile =driver.findElement(By.id("mobile"));
	fill(txtmobile,getData(1, 1, "Q4", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtcountry =driver.findElement(By.name("country"));
	fill(txtcountry,getData(1, 1, "Q4", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtcity =driver.findElement(By.id("city"));
	fill(txtcity,getData(1, 1, "Q4", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
	btnClick(btnLogin);
}
}