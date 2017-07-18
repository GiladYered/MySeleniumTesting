package MySeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverEventListener;;

public class ChromeTest {

		@Test
		public void ValidLogin() {
			
			SingletonWebDriver singletonWebDriver = SingletonWebDriver.getinstance();
			WebDriver connect = singletonWebDriver.ConnectToWebSiteByChrome();
			connect.get("https://www.rimon.net.il/he/");
			LoginPage loginPage = new LoginPage(connect);
			loginPage.typeusername();
			loginPage.typepassword();
			loginPage.clickOnLoginButton();			
		}
	}

