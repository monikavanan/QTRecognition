package otherskudos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import pageobjects.Othersmod6;
import resources.base;

public class QtTcOthers164 extends base{
	@Test
	public void kc() throws IOException, InterruptedException, AWTException {
	
		
		basePageNavigation();
	
	}
	@Test
	public int countkudos1() throws IOException {
     //   basePageNavigation();
        Othersmod6 ok=new Othersmod6(driver);
        int val=Integer.parseInt(ok.clickcount().getText().split(" ")[0]);
        return val;
    }
        public void sendkuds() throws AWTException, InterruptedException {
        ActivityPage h =new ActivityPage(driver);
       
        h.clickkudos().click();
    	
		h.clickemail().sendKeys((prop.getProperty("email")));
		log1.info("name is entered succesfully");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		log1.info("Successfully entered mail");
		
		h.clickbox().click(); 
		h.clickcomment().sendKeys("comments");
		h.clicksend().click();
        }
        public int  countkudos2() throws InterruptedException {
            Othersmod6 ok=new Othersmod6(driver);
            int vals=Integer.parseInt(ok.clickcount().getText().split(" ")[0]);
        return vals;
        }
   
        @Test
        public void testcase() throws IOException, InterruptedException, AWTException {
            int before=countkudos1();
            sendkuds();
            Thread.sleep(10000);
            int after=countkudos2();
            if(before<after)
            {
                System.out.println("count is increased");
            }
            else {
                System.out.println("HI");
            }
        }
	
	
	
	
	
	
}
