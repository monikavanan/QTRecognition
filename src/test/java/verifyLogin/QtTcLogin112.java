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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.TakesScreenshot;

import pageobjects.ActivityPage;
import pageobjects.LoginPage;
import resources.base;

public class QtTcLogin112 extends base {
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException {
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		log1.info("Successfully opened the application");
		
		
		 Assert.assertEquals(driver.getTitle(), "QTRecognition");
		 log1.info("Title is correct");
			 //System.out.println("Passed");	
		 Thread.sleep(5000);
		 driver.close();
	
	}
}
