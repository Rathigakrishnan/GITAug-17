package datadriven.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadAug16 {
	
	// To get the datas from the excelsheet

	public static void main(String[] args) throws IOException  {
		//File location
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Maven configuration\\Excel\\SampleExcel.xlsx");
	
	//read the value from excel
	FileInputStream fin = new FileInputStream(f);
	
	//type of workbook
	Workbook w = new XSSFWorkbook(fin);
	
	//to get the sheet 
	Sheet s = w.getSheet("Greens");

	//0 1<6T
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		
		Row row = s.getRow(i);
		
	// 5<5 F
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			
			int cellType = cell.getCellType();//1 -String, 0- int,date
			
			if (cellType==1) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if (DateUtil.isCellDateFormatted(cell)) {
				
				Date d = cell.getDateCellValue();
				
				SimpleDateFormat sim = new SimpleDateFormat("dd, MMMM, yyyy");
				String value = sim.format(d);
				System.out.println(value);
			}
			else {
				double d = cell.getNumericCellValue();
				
				//dec t long, long to  string
				
				long l= (long)d;
				
				String value = String.valueOf(l);
				System.out.println(value);
			}
		}
	}
	
	
	
	
	
	}
	}
