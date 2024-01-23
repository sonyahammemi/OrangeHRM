package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePageOrangeT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageOrangeStepDef {
	
	
	
	@Given("utilisateur est sur la page home")
	public void utilisateur_est_sur_la_page_home() {
		Config.ConfigChrome();
		Config.driver= new ChromeDriver();
		Config.maximizeWindow();
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

	}

	@When("utilisateur clique sur le menu {string}")
	public void utilisateur_clique_sur_le_menu(String Menu) {
		HomePageOrangeT home = new HomePageOrangeT(Config.driver);
		home.clickOnMenuByName(Menu);

	}

	@Then("la page de menu est affichée {string}")
	public void la_page_de_menu_est_affichée(String menu) throws InterruptedException {
		HomePageOrangeT home = new HomePageOrangeT(Config.driver);
		String actualMessage = home.verifMenu();
		Assert.assertEquals(menu, actualMessage);
		Thread.sleep(3000);
	    Config.driver.quit();
	}




}
