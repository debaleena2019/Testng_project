package SaleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		//driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.name("username")).sendKeys("debaleena");
		driver.findElement(By.name("password")).sendKeys("Tithli@124");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		driver.switchTo().frame("mainpanel");
		String date="20-October-2017";
		String datearr[]=date.split("-");
		String datenew=datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		Thread.sleep(5000);
		Select select1=new Select(driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[1]/td/select[2]")));
		select1.selectByValue(year);
		boolean flag=false;
		System.out.println("before loop:date"+ datenew);
	for(int row=1;row<=6;row++){
			for (int col=1;col<=7;col++){
			String date3=driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr["+row+"]/td["+col+"]")).getText();
			System.out.println("date"+ date3);
			if(date3.equals(datenew)){
			driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr["+row+"]/td["+col+"]")).click();	
			flag=true;
				break;
			} //*[@id="crmcalendar"]/table/tbody/tr[1]/td/select[2]
			}
			if (flag){
				break;
			} 
			}
		
		
	}

}
