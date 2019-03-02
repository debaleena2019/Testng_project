package Com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.qa.base.Testbase;

public class Homepage extends Testbase {
	
	Contactpage contactpage;
	Dealspage dealspage;
	Taskpage taskpage;

@FindBy(xpath="//a[contains(text(),'Contacts')]")
WebElement contacts;

@FindBy(xpath="//td[contains(text(),'User: Debaleena Paul')]")
WebElement username;

@FindBy(xpath="//td[contains(text(),'Deals')]")
WebElement Deals;

 public Homepage() throws IOException{
	 PageFactory.initElements(driver, this);
 }
 public String verifytitle() {
	 return driver.getTitle();
 }
 public boolean correctusername() {
	boolean bol= username.isDisplayed();
	return bol;
 }

 
 public Contactpage contactsclick() throws IOException{
	 contacts.click();
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
 

}

