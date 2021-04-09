
package sendkudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcSendKudos135 extends base {	
	
	@Test
	public void auto() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();

	log1.info("Successfully entered first name and last name the application");		
	
	 ActivityPage h = new ActivityPage(driver);
		Thread.sleep(5000);
		h.clickrecent().click();
		Thread.sleep(5000);
		h.clickauto().click();
		Thread.sleep(5000);
		h.clickbox().click(); 
		h.clickcomment().sendKeys("Providing for quick solution");
		h.clicksend().click();
		//Thread.sleep(5000);
		driver.close();
	}}

 





