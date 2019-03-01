package SaleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		ChromeOptions  options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.freecrm.com/index.html");
		System.out.println("before"+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("debaleena");
		driver.findElement(By.name("password")).sendKeys("Tithli@124");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("After"+driver.getTitle());	
	}

}
