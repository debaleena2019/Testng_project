package SaleniumTutorial;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		//String title=driver.getTitle();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
	 Set<String> handler=driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
	String Parentwindow=it.next();
	System.out.println("Parentwindow"+Parentwindow);
	String Childwindow=it.next();
	driver.switchTo().window(Childwindow);
	System.out.println("Childwindow"+Childwindow);
	driver.close();
	driver.switchTo().window(Parentwindow);
	driver.close();
	Set<String> handler1=driver.getWindowHandles();
	Iterator<String> it1= handler1.iterator();
	String Childwindow1=it1.next();
	System.out.println("Childwindow1"+Childwindow1);
	driver.close();
	}

}
