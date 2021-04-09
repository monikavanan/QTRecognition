package otherskudos;



import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.openqa.selenium.Keys;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import pageobjects.Othersmod6;
import resources.base;

public class QtTcOthers161 extends base {
	
	
	@Test
	public void Kfm() throws IOException, InterruptedException, AWTException {
	
		basePageNavigation();

	log1.info("Successfully entered first name and last name the application");		
	
	 Othersmod6 ok = new Othersmod6(driver);
		ok.kudosfromme().click();
	String str2=ok.names().getText();
	String sender = str2.substring(str2.indexOf("") + 0, str2.indexOf("has sent an appreciation to")); 

//Monika Marudhavanan


	String x="appreciation to"; 
	String recepient = str2.substring(str2.indexOf(x) + x.length(), str2.indexOf(" on")); 
    if(sender.equals(ok.usernames().getText())) {
        log1.info("Sender is valid");
    }
   
     if(!sender.equals(recepient)) {
        System.out.println("Sender sents kudos to other empl");
        log1.info("Sender sents kudos to other empl");
    }
	}

	}