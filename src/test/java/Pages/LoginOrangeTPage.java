package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginOrangeTPage {

	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	WebElement username;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	WebElement password;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifWrongCredentials;
	
	public LoginOrangeTPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void connect(String Username, String Password) {
		Config.attente(10);
		username.sendKeys(Username);
		password.sendKeys(Password);
		submit.click();
		
	}
	
	public String verifMessage() {
		String actualMessage = verifWrongCredentials.getText();
		return actualMessage;
	}
}
