package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Othersmod6 {
	public WebDriver driver;
	By kudosfromme=By.xpath("//span[contains(text(),'Kudos from me')]");
	By kudostome=By.xpath("//span[contains(text(),'Kudos to me')]");
	By name = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h5[1]");
	By username=By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h5[1]");
	By count=By.xpath("//h5[@id='todayCount']");
	
	
	public Othersmod6(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement names() {
		return driver.findElement(name);
	}
	public WebElement usernames() {
		return driver.findElement(username);
	}
	public WebElement kudosfromme() {
		return driver.findElement(kudosfromme);
	}
	public WebElement kudostome() {
		return driver.findElement(kudostome);
	}
	public WebElement clickcount() {
		return driver.findElement(count);
	}

}
