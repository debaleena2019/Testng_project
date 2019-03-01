package SaleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("debaleena.paul.09@gmail.com");
   driver.findElement(By.id("pass")).sendKeys("tithli");
		Exwait(driver,driver.findElement(By.xpath("//*[@id='loginbutton']")),20);
	}
public static void Exwait(WebDriver driver,WebElement locator,int timeout){
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();
}
}
