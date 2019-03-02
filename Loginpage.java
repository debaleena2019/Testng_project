package Com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.Testbase;

public class Loginpage extends Testbase{

	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password") 
	WebElement password;
	@FindBy(xpath="\\input[@type=submit]")
	WebElement login;
	@FindBy(xpath="\\img[@class=img-responsive]")
	WebElement crmlogo;

	public Loginpage()throws IOException{
		PageFactory.initElements(driver,this);
	}

	public boolean crmimage() {
	return crmlogo.isDisplayed();	
	}
	public String loginpgtitle() {
		return driver.getTitle();
	}
	public Homepage login(String us,String ps) throws IOException {
		username.sendKeys(us);
		password.sendKeys(ps);
	login.click();
	return new Homepage();
	
	}
}

