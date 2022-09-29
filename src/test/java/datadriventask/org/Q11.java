package datadriventask.org;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utility.org.Baseclass;

public class Q11 extends Baseclass{
	public static void main(String[] args) throws IOException {
		

	
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
		
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.createSheet("Q11");
		
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Name");
		
		//Row row2 = s.createRow(0);
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Email");
		
		//Row row4 = s.createRow(0);
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Passwoord");
		
		//Row row3 = s.createRow(0);
		Cell cell3 = row.createCell(3);
		cell3.setCellValue("Mobile No");
		
		Row row1 = s.createRow(1);
		Cell cell4 = row1.createCell(0);
		cell4.setCellValue("Kumar");
		
		//Row row2 = s.createRow(0);
		Cell cell5 = row1.createCell(1);
		cell5.setCellValue("Email@gmail.com");
		
		//Row row4 = s.createRow(0);
		Cell cell6 = row1.createCell(2);
		cell6.setCellValue("12345pass");
		
		//Row row3 = s.createRow(0);
		Cell cell7 = row1.createCell(3);
		cell7.setCellValue("9876543210");
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	
		System.out.println("sucessful");
	
	
	
	launchChrome();
	winMax();
	loadUrl("https://my.naukri.com/account/register/basicdetails");

	WebElement txtUser =driver.findElement(By.id("name"));
	fill(txtUser,getData(1, 0, "Q11", "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Clone Maven Configuration\\\\GITAug-17\\\\Excel\\\\DataDrivenTask.xlsx"));

	
	WebElement txtlemail =driver.findElement(By.id("email"));
	fill(txtlemail,getData(1, 1, "Q11", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtpass =driver.findElement(By.id("password"));
	fill(txtpass,getData(1, 2, "Q11", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement txtmobile =driver.findElement(By.id("mobile"));
	fill(txtmobile,getData(1, 3, "Q11", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Register Now']"));
	btnClick(btnLogin);
	
	
	}
}




