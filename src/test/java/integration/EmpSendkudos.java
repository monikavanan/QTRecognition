package integration;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import resources.base;
import sendkudos.QtTcSendKudos135;
import sendkudos.SendSingleKudo;



public class EmpSendkudos extends base {	
	public WebDriver driver;
	@Test
	public void Cd() throws IOException, InterruptedException, AWTException {
		SendSingleKudo sd=new SendSingleKudo();
		sd.Csd();
		log1.info("Kudos is sent ");
	
		
	}
	

	
	@Test
	
	public void rc() throws IOException, InterruptedException, AWTException {
		QtTcSendKudos135 r=new QtTcSendKudos135(); 
			r.auto();
		
	}
}

