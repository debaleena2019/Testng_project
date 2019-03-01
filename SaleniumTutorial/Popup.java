package SaleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Come & Go Test")).click();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		 String Parentwindow=it.next();
		System.out.println("Parent window"+Parentwindow);
		String Childwindow=it.next();
	//	 String Childwindow2=it.next();
		System.out.println("Child window"+Childwindow);
			
		driver.switchTo().window(Childwindow);
						Thread.sleep(3000);
				
	 System.out.println("Child title"+driver.getTitle());
		driver.close();
	
		driver.switchTo().window(Parentwindow);
	 System.out.println("Parent title"+driver.getTitle());
	 driver.close();
	
	
	 Set<String> handler1 = driver.getWindowHandles();
		Iterator<String> it1= handler1.iterator();
		String Childwindow2=it1.next();
		driver.switchTo().window(Childwindow2);
		Thread.sleep(3000);
		System.out.println("2nd Child window"+Childwindow2);
				 System.out.println("2nd Child title"+driver.getTitle());
		
	}

}
