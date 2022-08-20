package datadriven.org;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException  {
		//1.Mention the File location
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\ExcelWrite.xlsx");
		
		//2. create a file
		boolean a = f.createNewFile();
		System.out.println(a);
		
		//3.type of workbook
		Workbook w = new XSSFWorkbook();
		
		//4.Create a sheet
		Sheet s = w.createSheet("Infosys");
		
		//5.create the row
		Row row = s.createRow(0);
		
		//6. create the cell
		Cell cell = row.createCell(1);
		
		//7.set the value
		cell.setCellValue("Selenium");
		
		//8.update the file (new file creation)
		FileOutputStream fout = new FileOutputStream(f);
		
		//9.write the changes
		w.write(fout);
		
		System.out.println("Sucess");
		
}
}