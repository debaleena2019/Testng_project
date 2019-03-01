package SaleniumTutorial;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
Properties pt=new Properties();
FileInputStream fi=new FileInputStream("/Users/pdebale/Downloads/Debaleena/FirstJavaproject/src/SaleniumTutorial/Fileinput.properties");
pt.load(fi);

System.out.println("Name"+pt.getProperty("Name"));
System.out.println("Age"+pt.getProperty("Age"));
System.out.println("URL"+pt.getProperty("URL"));
String Browsername=pt.getProperty("Browser");
if(Browsername.equals("Chrome")){
	System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get(pt.getProperty("Freecrm"));
Thread.sleep(3000);
driver.findElement(By.xpath(pt.getProperty("Name_xpath"))).sendKeys(pt.getProperty("username"));
driver.findElement(By.xpath(pt.getProperty("Pass_xpath"))).sendKeys(pt.getProperty("password"));
Thread.sleep(3000);
driver.findElement(By.xpath(pt.getProperty("click_xpath"))).click();
	}

	}
}