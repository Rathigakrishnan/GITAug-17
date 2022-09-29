package testngframework;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utility.org.Baseclass;

public class Employee1 extends Baseclass {

	@DataProvider(name="Login")
	private Object[][] greens() throws IOException {
		
		return new Object [][] {
			{getData(1, 1, "greens", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx"),getData(2, 1, "greens", "C:\\Users\\user\\eclipse-workspace\\Clone Maven Configuration\\GITAug-17\\Excel\\SampleExcel.xlsx")},
			{"selenium","selenium@123"},
			{"oracle","oracle@123"},
			{"sql","sql@123"}
		};
}
}