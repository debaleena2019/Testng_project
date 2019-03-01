package SaleniumTutorial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Actions action = new Actions(driver);
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			action.clickAndHold(driver.findElement(By.id("draggable")))
			.moveToElement(driver.findElement(By.id("droppable")))
			.release().build().perform();
		  
		}

	}



