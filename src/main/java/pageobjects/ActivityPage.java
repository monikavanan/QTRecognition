package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActivityPage {
		public WebDriver driver;
		By kudos=By.xpath("//body/nav[1]/div[1]/div[1]/div[2]/a[1]");
		
		By email=By.xpath("//input[@id='email_address']");
		
		By box=By.xpath("//body/div[@id='myModal']/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
		
		//By box=By.xpath("//div[@class='card-body effect-body'][//i[contains(text(),'\"Excellent Team Work\"')]]");
		By comment=By.xpath("//textarea[@id='comment']");
		
		By send=By.xpath("//button[contains(text(),'Send')]");
		
		By recent=By.xpath("//body/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/h5[1]/small[1]/a[1]/i[1]");
		By auto=By.xpath("//input[@id='email_address']");
		
		
		public void kudostype(String kudostype)
		{
			WebElement kk=driver.findElement(By.xpath("//i[contains(text(),'"+kudostype+"')]/ancestor::center"));
			kk.click();
		}
	
		public ActivityPage(WebDriver driver) {
			this.driver=driver;
		}
		public WebElement clickkudos() {
			return driver.findElement(kudos);
		}
		public WebElement clickemail() {
			return driver.findElement(email);
		}
		
		public WebElement clickbox() {
			return driver.findElement(box);
		}
		public WebElement clickcomment() {
			return driver.findElement(comment);
		}
		public WebElement clicksend() {
			return driver.findElement(send);
		}
		
		public WebElement clickrecent() {
			return driver.findElement(recent);
		}
		public WebElement clickauto() {
			return driver.findElement(auto);
		}
}





