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

public class Q3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
	
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		
	
		 Row row = s.createRow(2);
		 Cell cell = row.createCell(2);
		 cell.setCellValue("updated");
	
		 

		 FileOutputStream fout = new FileOutputStream(f);
		 w.write(fout);
		
		 System.out.println("sucess");
		
	
	}
}
