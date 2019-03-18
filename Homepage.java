package Com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.Testbase;

public class Homepage extends Testbase {
	
	Contactpage contactpage;
	Dealspage dealspage;
	Taskpage taskpage;

	
//	@FindBy(xpath= "//td[contains(text(),'User: Debaleena Paul')]")
//WebElement username;
@FindBy(xpath="//td[@class='headertext']")
WebElement username;

@FindBy(xpath= "//a[contains(text(),'Contacts')]")
WebElement Contacts;
@FindBy(xpath= "//a[contains(text(),'Deals')]")
WebElement Deals;
@FindBy(xpath= "//a[contains(text(),'Tasks')]")
WebElement Tasks;

 public Homepage() throws IOException{
	 PageFactory.initElements(driver, this);
 }
 public String verifytitle() {
	 return driver.getTitle();
 }
 public boolean correctusername() {
	boolean bol= username.isDisplayed();
	System.out.println("bol"+bol);
	return bol;
 }

 
 public Contactpage contactsclick() throws IOException{
	 Contacts.click();
	 return new Contactpage(); 
	 }
 public Dealspage Dealsclick(){
	 Deals.click();
	 return new Dealspage(); 
	 }
 public Taskpage Taskclick(){
	 Deals.click();
	 return new Taskpage(); 
	 }
 public void clickoncontactslink() {
	 Actions action=new Actions(driver);
	 action.moveToElement(Contacts).build().perform();
	Contacts.click();
 }

}

