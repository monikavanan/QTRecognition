package kudosSearch;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.SearchKudos;
import resources.base;

public class QtTcSearchKudos142 extends base {
	@Test
	public void searchkudos() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();

	log1.info("Successfully entered first name and last name the application");		
	
	SearchKudos sk=new SearchKudos(driver);
	sk.clicksearch().click();	
	sk.clickuname().sendKeys((prop.getProperty("email")));
	log1.info("name is entered succesfully");
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_ENTER);
	log1.info("Successfully entered mail");
	sk.clickicon().click();
	log1.info("Kudos sent from user and received by user is seen");
	driver.close();
}}

