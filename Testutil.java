package Com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Testutil extends Testbase {
	static String Testdata_path="C:\\JAVA\\Freecrmtestautomation\\src\\main\\java\\Com\\crm\\qa\\testdata\\freecrmtestdata.xlsx";
public Testutil() throws IOException {
		super();
			}

public void switchtoframe() {
	driver.switchTo().frame("mainpanel");
	}
public static Object[][] gettestdata(String sheetname) throws FileNotFoundException{
	FileInputStream file=null;
	file=new FileInputStream(Testdata_path);
	Object sheet = book.getsheet(sheetname);
	Object[][] data=new Object[sheet.getLastrow()][sheet.getrow().getlastcellnum()];
	for (int i=0;i<sheet.getLastRowNum();i++) {
		for(int k=0;k<sheet.getRow(0).getlastCellNum;k++) {
			data[i][k]=sheet.getow(i+1).getCell(k).toString();
		}
	}
		
}
}
