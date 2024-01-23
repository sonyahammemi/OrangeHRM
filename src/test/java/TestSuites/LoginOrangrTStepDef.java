package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePageOrangeT;
import Pages.LoginOrangeTPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangrTStepDef {
	@Before
	public void init() {
		Config.ConfigChrome();
		Config.driver= new ChromeDriver();
		Config.maximizeWindow();
	}
	
	
	@Given("admin is on login page")
	public void admin_is_on_login_page() {
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
//scenario 1
	@When("admin enter correct username {string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String username, String pwd) {
		LoginOrangeTPage login = new LoginOrangeTPage(Config.driver);
        login.connect(username, pwd);
	}

	@Then("admin is directed to the home page that contains {string}")
	public void admin_is_directed_to_the_home_page_that_contains(String Msg) {
		HomePageOrangeT home = new HomePageOrangeT(Config.driver);
		String actualMessage = home.verifMessage();
		Assert.assertEquals(Msg, actualMessage);
	}
	
//scenario 2
	@When("admin enter correct username {string} and wrong password {string}")
	public void admin_enter_correct_username_and_wrong_password(String name, String password) {
		LoginOrangeTPage login = new LoginOrangeTPage(Config.driver);
        login.connect(name, password);
	}


	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message(String expectedMessage) {
		LoginOrangeTPage login = new LoginOrangeTPage(Config.driver);
		String actualMessage = login.verifMessage();
		Assert.assertEquals(expectedMessage, actualMessage);

	}




}
