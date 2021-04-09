
package sendkudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcSendKudos132 extends base {
	
	@Test
	public void ml() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();

	log1.info("Successfully entered first name and last name the application");		
	 ActivityPage h = new ActivityPage(driver);
		h.clickkudos().click();
	
		h.clickemail().sendKeys((prop.getProperty("email")));
		log1.info("name is entered succesfully");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		log1.info("Successfully entered mail");
		Thread.sleep(5000);
		driver.close();
	
		
	
}
	
		
		
		
		
	

}
