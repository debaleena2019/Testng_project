package Com.crm.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.crm.qa.base.Testbase;
import Com.crm.qa.pages.Homepage;
import Com.crm.qa.pages.Loginpage;
import junit.framework.Assert;

public class Loginpagetest extends Testbase{
	Loginpage loginpage;
	Homepage homepage;
	public Loginpagetest() throws IOException {
		super();
	}

	@BeforeMethod()
		public void setup() throws IOException{
		init();
		loginpage=new Loginpage();
	}
	
	@Test
	public void loginpgtitletest() {
		String title=loginpage.loginpgtitle();
		Assert.assertEquals(title,"CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
@Test
public void imagetest() {
	Boolean bool=loginpage.crmimage();
	Assert.assertTrue(bool);
}
@Test
public void logincheck() throws IOException {
	homepage=loginpage.login(pr.getProperty("username"),pr.getProperty("password"));
}

@AfterMethod()
public void close(){
	driver.quit();
}}

