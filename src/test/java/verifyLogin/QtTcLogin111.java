package verifyLogin;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcLogin111 extends base {

	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String Password) throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("Successfully opened the application");
		
	LoginPage l = new LoginPage(driver);
	l.clickusername().sendKeys(username);
	l.clickpassword().sendKeys(Password);
	l.clicklog().click();
	log1.info("Successfully entered first name and last name the application");		
	Thread.sleep(5000);
	driver.close();	
}
		@DataProvider
		public Object[][] getData() {
			Object[][] data=new Object[5][2];
			data[0][0]="monika.marudhavanan@qualitestgroup.com";
			data[0][1]="P@ssw0rd";
			
			data[1][0]="monika.marudhavanan@qualitestgroup.com";
			data[1][1]="password2";
			
			data[2][0]="";
			data[2][1]="P@ssw0rd";
			
			data[3][0]="monika.marudhavanan@qualitestgroup.com";
			data[3][1]="";
			
			data[4][0]="abc@qualitestgroup.com";
			data[4][1]="P@ssw0rd";
	
			 return data;
		}
		
		
		

		
		
	

}
