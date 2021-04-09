

package sendkudos;

import java.awt.AWTException;
import java.io.IOException;

//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcSendKudos131 extends base {
	
	@Test
	public void clk() throws IOException, InterruptedException, AWTException {
		basePageNavigation();
	log1.info("Successfully entered first name and last name the application");		
	
	
	
	
	 ActivityPage h = new ActivityPage(driver);
		h.clickkudos().click();
		Thread.sleep(5000);
		driver.close();
	
		
	
}
		
}
