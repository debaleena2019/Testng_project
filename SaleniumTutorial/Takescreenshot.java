package SaleniumTutorial;

import java.io.File;

import org.openqa.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/pdebale/Downloads/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyfile(src,new File("/Users/pdebale/Downloads/Debaleena/FirstJavaproject/src/SaleniumTutorial/google.png"));
	}


	}


