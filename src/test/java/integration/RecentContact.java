package integration;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;
import sendkudos.QtTcSendKudos135;

public class RecentContact extends base{
@Test
	
	public void rc() throws IOException, InterruptedException, AWTException {
		QtTcSendKudos135 r=new QtTcSendKudos135(); 
			r.auto();
		
	}
}
