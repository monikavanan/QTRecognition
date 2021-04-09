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

public class QtTcOthers165 extends base {
	
	
	
	
	@Test
	public void kmk() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();
	log1.info("Successfully entered first name and last name the application");		
	
	
	
	
	 Othersmod6 ot = new Othersmod6(driver);
	 ot.kudostome().click();
	 String str2=ot.names().getText(); 
	 


	//System.out.println(str2); 

    String sender = str2.substring(str2.indexOf("") + 0, str2.indexOf("received an appreciation from")); 
    System.out.print(sender);
	String x="appreciation from"; 
	String receiver = str2.substring(str2.indexOf(x) + x.length(), str2.indexOf(" on")); 
	System.out.print(receiver);



	if(sender.contains(receiver)) { 



	log1.info("Sender is able to send kudos to themselves"); 



	} 





	}



	} 



	
	