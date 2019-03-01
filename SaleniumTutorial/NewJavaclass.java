package SaleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewJavaclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.freecrm.com/index.html");
//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
driver.findElement(By.name("username")).sendKeys("debaleena");
driver.findElement(By.name("password")).sendKeys("Tithli@124");
//driver.findElement(By.id("firstname")).sendKeys("debaleena");
//driver.findElement(By.id("lastname")).sendKeys("paul");
//driver.findElement(By.id("email")).sendKeys("debaleena.paul.09");
//driver.findElement(By.id("password")).sendKeys("Tithli@124");
//driver.findElement(By.xpath("//a[@id='ppaNav']")).click();
//driver.findElement(By.linkText("Create a business account")).click();
//driver.findElement(By.name("password")).sendKeys("Tithli@124")
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
//driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
driver.switchTo().frame("mainpanel");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

}
