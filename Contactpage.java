package Com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.Testbase;

public class Contactpage extends Testbase {
	
	@FindBy(xpath="//*[@id=\"vContactsForm\"]/table")
	WebElement Contactslabel;
	
	public Contactpage()throws IOException {
PageFactory.initElements(driver, this);
	}
	public boolean verifycontactlabel() {
		return Contactslabel.isDisplayed();
	}
	public void clickoncontact(String name) {
	driver.findElement(By.xpath("//a[text="+name+"]//parent::td[@class=\"datalistrow\"]//preeceding-sibling::td[@class=\"datalistrow\"] //input[@name=\"contact_id\"]")).click();
	}
	
}
	
