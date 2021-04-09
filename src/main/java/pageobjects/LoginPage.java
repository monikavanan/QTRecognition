package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		public WebDriver driver;
		By username=By.xpath("//body/div[2]/form[1]/input[1]");
		By password=By.xpath("//body/div[2]/form[1]/input[2]");
		By log=By.xpath("//button[contains(text(),'Login')]");
	
		
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement clickusername() {
			return driver.findElement(username);
		}
		public WebElement clickpassword() {
			return driver.findElement(password);
		}
		public WebElement clicklog() {
			return driver.findElement(log);
		}
		
		
}
