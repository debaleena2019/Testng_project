package SaleniumTutorial;


import java.util.ArrayList;
import java.util.List;

//import java.awt.List;
//import java.awt.PopupMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Checkbrokenlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.name("username")).sendKeys("debaleena");
		driver.findElement(By.name("password")).sendKeys("Tithli@124");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
	java.util.List<WebElement> Linklist=driver.findElements(By.tagName("a"));
		 Linklist.addAll(driver.findElements(By.tagName("img")));
		 List<WebElement> activelinks=new ArrayList<WebElement>();
		System.out.println("size of full length"+Linklist.size());
	
	for (int i=0;i<Linklist.size();i++){
		if (Linklist.get(i).getAttribute("href")!=null){
		activelinks.add(Linklist.get(i));
		//System.out.println("activelinks.add(Linklist.get(i))"+activelinks.size());
		}
	}
	System.out.println("size of actual length"+activelinks.size());

}
}