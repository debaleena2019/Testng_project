package Com.crm.qa.base;

import java.io.IOException;

public class Testutil extends Testbase {
public Testutil() throws IOException {
		super();
			}

public void switchtoframe() {
	driver.switchTo().frame("mainpanel");
	}
}
