package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	
	public static void  ConfigChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\ChromeDriver120\\chromedriver.exe");
		
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public static void BrowserQuit() {
		driver.quit();
	}
	
	public static void attente(long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}

}
