package datadriventask.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
	
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();//1 -String, 0- int,date
				
				if (cellType==1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
			}
	
		}
		
	}
		}