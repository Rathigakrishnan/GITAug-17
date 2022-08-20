package datadriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateandWriteExcel {

	public static void main(String[] args) throws IOException{
		
		//1. mention the file location
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx");
		
		//2.read the value
		FileInputStream fin = new FileInputStream(f);
		
		//3.type of workbook
		Workbook w = new XSSFWorkbook(fin);
		
		//4.get the sheet
		Sheet s = w.getSheet("Greens");
		
		//5.get the row
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				
				if (cellType==1) {
					String value = cell.getStringCellValue();
					
					if (value.equals("Eswar")) {
						
						cell.setCellValue("Kevin");
						
						FileOutputStream fout=new FileOutputStream(f);
						w.write(fout);
						
						System.out.println("Sucess");
						
					}
				}
			}
			
		}
		
		
		
		
		
	}
}
