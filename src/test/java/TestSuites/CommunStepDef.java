package TestSuites;

import Helper.Config;
import Pages.LoginOrangeTPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {

	@Given("utilisateur est connecte avec le bon username {string} et le bon password {string}")
	public void utilisateur_est_connecte_avec_le_bon_username_et_le_bon_password(String name, String pwd) {
	    Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    LoginOrangeTPage login = new LoginOrangeTPage(Config.driver);
	    login.connect(name, pwd);
	}
}
