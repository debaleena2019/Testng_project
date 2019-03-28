package Com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testutil extends Testbase {
public static String Testdata_path="C:\\JAVA\\Freecrmtestautomation\\src\\main\\java\\Com\\crm\\qa\\testdata\\freecrmtestdata.xlsx";
public static Workbook book;
public static Sheet sheet;	
public Testutil() throws IOException {
		super();
			}

public void switchtoframe() {
	driver.switchTo().frame("mainpanel");
	}
public static Object[][] gettestdata(String sheetname) throws FileNotFoundException{
FileInputStream file=null;
try {
file=new FileInputStream(Testdata_path);
System.out.println("insidetry-1st");
}
catch (FileNotFoundException e)
{
	e.printStackTrace();
}
try {
	book=WorkbookFactory.create(file);
	System.out.println("insidetry-2nd");

}catch(InvalidFormatException e) {
	e.printStackTrace();
}
catch(IOException e) {
	e.printStackTrace();
	
}
  sheet = book.getSheet(sheetname);
	System.out.println("sheetname");

Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
System.out.println("after getrow");
System.out.println(sheet.getLastRowNum());
System.out.println(sheet.getRow(0).getLastCellNum());

for (int i=0;i< sheet.getLastRowNum();i++) {
for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
	System.out.println("insidetry-loop");
data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	}
	}
	return data	;
}
}
