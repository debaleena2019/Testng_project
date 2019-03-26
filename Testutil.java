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
static Workbook book;
static Sheet sheet;	
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
}
catch (FileNotFoundException e)
{
	e.printStackTrace();
}
try {
	book=WorkbookFactory.create(file);
}catch(InvalidFormatException e) {
	e.printStackTrace();
}
catch(IOException e) {
	e.printStackTrace();
	
}
  Sheet sheet = book.getSheet(sheetname);
Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for (int i=0;i< sheet.getLastRowNum();i++) {
for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	}
	}
	return data	;
}
}
