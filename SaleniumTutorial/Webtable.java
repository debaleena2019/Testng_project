package SaleniumTutorial;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("debaleena");
		driver.findElement(By.name("password")).sendKeys("Tithli@124");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		String Date="31-September-2017";
		String datearr[]=Date.split("-");
		String day=datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		driver.switchTo().frame("mainpanel");
		boolean flag=false;
		Select select =new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 =new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		String Before_xpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String After_xpath="]/td[";
		String val;
		for (int row=2;row<=7;row++ ){
			for (int col=1;col<=7;col++){
				try{
				val=driver.findElement(By.xpath(Before_xpath+row+After_xpath+col+"]")).getText();
				}
				catch(NoSuchElementException e){
					System.out.println("Invalid date");
					flag=false;
					break;
				}
				System.out.println(val);
				if (val.equals(day)){
					flag=true;
					driver.findElement(By.xpath(Before_xpath+row+After_xpath+col+"]")).click();
									break;
				}}
			if (flag)
				break;
		}
			//
	}
	}


