package datadriventask.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\DataDrivenTask.xlsx");
	
		FileInputStream fin = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		int pRows = s.getPhysicalNumberOfRows();
		System.out.println("Physical no of rows "+pRows);
		
		Row r = s.getRow(1);
		
		int pCells = r.getPhysicalNumberOfCells();
		System.out.println("Physical no of cells"+pCells);
	
	}
}
