
package sendkudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcSendKudos1322 extends base {
	
	@Test
	public void mul() throws IOException, InterruptedException, AWTException {
	
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
		h.clickbox().click(); 
		Thread.sleep(1000);
	
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		
		h.clickkudos().click();
		h.clickemail().sendKeys((prop.getProperty("email")));
		log1.info("name is entered succesfully");
		
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		log1.info("Successfully entered mail");
		String arr[]= {"Exceptional Work","Excellent Team Work","Innovative Thinker","Good Client Relations","Quality Hero","Quick Learner","Hard Worker","Team player"};
		for(int i=0;i<arr.length;i++) {
			h.kudostype(arr[i]);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Pictures\\SST\\multiplekudos.png"));
			Thread.sleep(5000);
		
			
		
	
		}

		
	driver.close();
}
	
		
		
		
		
	

}
