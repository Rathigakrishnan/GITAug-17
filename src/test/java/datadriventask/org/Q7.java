package datadriventask.org;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.org.Baseclass;

public class Q7 extends Baseclass{
	public static void main(String[] args) throws IOException {
		
	
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		
		
		WebElement txtUser =driver.findElement(By.id("email"));
		fill(txtUser,getData(1, 0, "FaceBook", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
		
		WebElement txtPass =driver.findElement(By.id("pass"));
		fill(txtPass,getData(1, 1, "FaceBook", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnClick(btnLogin);
		
		//String value = cell.getStringCellValue();
		
		
}
}