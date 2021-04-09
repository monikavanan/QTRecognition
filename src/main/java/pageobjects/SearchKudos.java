package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchKudos {
	public WebDriver driver;
	By search =By.xpath("//span[contains(text(),'Kudos Search')]");
	By uname=By.xpath("//input[@id='s_e_add']");
	By icon=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]");
	
	public SearchKudos(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clicksearch() {
		return driver.findElement(search);
	}
	public WebElement clickuname() {
		return driver.findElement(uname);
	}
	public WebElement clickicon() {
		return driver.findElement(icon);
	}

}


