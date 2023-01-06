package BasicApachePoiPractice;

import java.util.Arrays;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL;

public class apachepoiBasicPractice {

	public static void main(String[] args) {
		
		String Excelfilepath = "D:\\Eclipse Workspaces\\My all Eclipse\\Batch31\\31 repo\\EalProject2\\TestData\\testdata.xlsx";
		
		Xlsx_Reeader_EAL reader = new Xlsx_Reeader_EAL(Excelfilepath);
		
		//how many rows
		int rowcount=reader.getRowCount("register");
		System.out.println(rowcount);
		
		//How many Columns 
		int colcount=reader.getColumnCount("register");
		System.out.println(colcount);
		
		//get all data 
		Object[][] data=reader.getSheetData("fb");
		System.out.println(Arrays.deepToString(data));
		

	}

}
