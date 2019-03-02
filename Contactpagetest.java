package Com.crm.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.crm.qa.base.Testbase;
import Com.crm.qa.base.Testutil;
import Com.crm.qa.pages.Contactpage;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;

public class Contactpagetest extends Testbase{
	Loginpage loginpage;
	Homepage homepage;
	Contactpage contactpage;
	Testutil testutil;
	public Contactpagetest()throws IOException{
		super();
	}
	@BeforeTest()
	
	public void setup() throws IOException	{
		init();
		loginpage=new Loginpage();
		homepage=new Homepage();
		homepage=loginpage.login(pr.getProperty("username"),pr.getProperty("password"));
	contactpage=new Contactpage();
	testutil=new Testutil();
		
	}
	
	@Test()
	public void verifycontactpagelabeltest() {
		testutil.switchtoframe();
		testutil.switchtoframe();

		Assert.assertTrue(contactpage.verifycontactlabel());
	}
	@Test()
	public void clickoncontacttest() {
		contactpage.clickoncontact(pr.getProperty("test 2 test 2"));
			}
	@AfterTest()
	public void quit() {
		driver.close();
	}
	
}
