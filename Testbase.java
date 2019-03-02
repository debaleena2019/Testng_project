package Com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
public static WebDriver driver;
public static Properties pr;

public Testbase() throws IOException{
	try {
		Properties pr=new Properties();
		FileInputStream fp=new FileInputStream("C:\\JAVA\\Javaproject\\src\\Saleniumproject\\config.properties");
pr.load(fp);

	}
	catch(FileNotFoundException e){
		e.printStackTrace();
		
	}
}
public static void init() {
	String browser=pr.getProperty("browser");
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
driver=new ChromeDriver();
	}
	driver.get("https://classic.crmpro.com/index.html?e=2");
	
}
}
