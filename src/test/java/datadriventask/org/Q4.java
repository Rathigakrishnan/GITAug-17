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

public class Q4 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
	
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.createSheet("Q4");
		
		Row row = s.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Name");
		
		//Row row1 = s.createRow(0);
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Last Name");
		
		//Row row2 = s.createRow(0);
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Email");
		
		//Row row3 = s.createRow(0);
		Cell cell3 = row.createCell(3);
		cell3.setCellValue("Mobile No");
		
		//Row row4 = s.createRow(0);
		Cell cell4 = row.createCell(4);
		cell4.setCellValue("Country");
		
		//Row row5 = s.createRow(0);
		Cell cell5 = row.createCell(5);
		cell5.setCellValue("City");
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	
		System.out.println("sucessful");
	
	}
}