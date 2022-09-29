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

public class Q6 extends Baseclass {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
	
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.createSheet("FaceBook");

		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Email id");
		
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("PassWord");
	
		Row row1 = s.createRow(1);
		Cell fcell = row1.createCell(0);
		fcell.setCellValue("Rahul @ id");
		
		Cell fcell1 = row1.createCell(1);
		fcell1.setCellValue("dog");
		
		Row row2 = s.createRow(2);
		Cell fcell2 = row2.createCell(0);
		fcell2.setCellValue("deepak@dos");
		
		Cell fcell3 = row2.createCell(1);
		fcell3.setCellValue("god");
		
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	
		System.out.println("sucessful");
		
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com");
		
		
		WebElement txtUser =driver.findElement(By.id("email"));
		fill(txtUser,getData(1, 0, "FaceBook", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
	
		
		WebElement txtPass =driver.findElement(By.id("pass"));
		fill(txtPass,getData(1, 1, "FaceBook", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx"));
		
		
		
		
		
		
	}
}