package kudosSearch;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.SearchKudos;
import resources.base;

public class QtTcSearchKudos141 extends base {
	@Test
	public void searchkudos() throws IOException, InterruptedException, AWTException {
	basePageNavigation();
	log1.info("Successfully entered first name and last name the application");		
	
	SearchKudos sk=new SearchKudos(driver);
	sk.clicksearch().click();	
	
	
}}
