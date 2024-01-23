package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageOrangeT {
	
	@FindBy(tagName="h6")
	WebElement HomeDashboardMessage ;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li/a/span")
	List<WebElement> menus;
	 
	
	public HomePageOrangeT(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifMessage() {
		String actualMessage = HomeDashboardMessage.getText();
		return actualMessage;
	}
	
	public void clickOnMenuByName(String menuName) {
		Config.attente(10);
		try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuName)) {
				menu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	public String verifMenu() {
		String actualMessage = HomeDashboardMessage.getText();
		return actualMessage;
		
	}

}
