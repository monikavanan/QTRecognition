package otherskudos;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import pageobjects.Othersmod6;
import resources.base;

public class QtTcOthers162 extends base {
	
	
	
	
	@Test
	public void ktm() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();

	log1.info("Successfully entered first name and last name the application");		
	
	
	
	
	 Othersmod6 ot = new Othersmod6(driver);
	 ot.kudostome().click();
	 String str2=ot.names().getText(); 
	 


	//System.out.println(str2); 

    String sender = str2.substring(str2.indexOf("") + 0, str2.indexOf("received an appreciation from")); 
	String x="appreciation from"; 
	String recepient = str2.substring(str2.indexOf(x) + x.length(), str2.indexOf(" on")); 

//	log1.info("Sender Name is Valid"); 
	String dname=ot.usernames().getText();


	if(sender.equals(dname)) { 



	log1.info("Sender is correct"); 



	} 



	 if(!sender.equals(recepient)) { 



	log1.info("Sender received an kudos from other employee");  



	} 



	}



	} 



	
	
