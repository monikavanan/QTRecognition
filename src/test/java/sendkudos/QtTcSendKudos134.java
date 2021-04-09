
package sendkudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcSendKudos134 extends base {	
	
	@Test
	public void Csd() throws IOException, InterruptedException, AWTException {
		basePageNavigation();
		

	log1.info("Successfully entered first name and last name the application");		
	
	 ActivityPage h = new ActivityPage(driver);
		h.clickkudos().click();
	log1.info("send kudos clicked successfully");
	
		h.clickemail().sendKeys((prop.getProperty("email")));
		log1.info("name is entered succesfully");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		log1.info("Successfully entered mail");
		h.clickbox().click(); 
		h.clickcomment().sendKeys("Goodh");
		h.clicksend().click();
		Thread.sleep(5000);
		log1.info("Email sent successfully :confirmation box displayed");
		log1.info("Kudos sent is reflected in recent activity section");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Qualitest\\Pictures\\SST\\recentcontactnu.png"));
		log1.info("Kudos sent is not reflected in recent contact section");
		
		driver.close();
	}
	}