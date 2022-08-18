package datadriven.org;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelRead {
	
	public static void main(String[] args) throws IOException  {
		//File location
		File f = new File("C:\\Users\\user\\eclipse-workspace\\Maven configuration\\Excel\\SampleExcel.xlsx");
	
	//read the value from excel
	FileInputStream fin = new FileInputStream(f);
	
	//type of workbook
	Workbook w = new XSSFWorkbook(fin);
	
	//to get the sheet 
	Sheet s = w.getSheet("Greens");
	
	//to get the physical n of rows
	int pRows = s.getPhysicalNumberOfRows();
	System.out.println("Physical no of rows "+pRows);
	
	//get the row
	Row r = s.getRow(2);
	
	// to get physical no of cells
	int pCells = r.getPhysicalNumberOfCells();
	System.out.println("Physical no of cells"+pCells);
	
	
	
	
	
	}

}
