package SaleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmove {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.name("username")).sendKeys("debaleena");
		driver.findElement(By.name("password")).sendKeys("Tithli@124");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		///html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]/td[2]/a
		///html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[5]/td[2]/a
		//"/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[6]/td[2]/a
		///html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[7]/td[2]/a
	    String Beforexpath="/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[";
	    String Afterxpath="]/td[2]/a";
	 //   for(int i=4;i<=7;i++){
	  //  	String name=driver.findElement(By.xpath(Beforexpath+i+Afterxpath)).getText();
	 //   System.out.println(name);
	  
	//if(name.contains("test2 test2"))
	//	  driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[6]/td[2]/a")).click();
	//}
	 driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	    }

}
