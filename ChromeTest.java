package seleniumtesting;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.WebDriverEventListener;;

public class ChromeTest {

		@Test
		public void ValidLogin() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Yered\\Downloads\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.rimon.net.il/he/");

			/*this code worked correctly before trying to insert the singleton design pattern:*/
			LoginPage loginPage = new LoginPage(driver);
			LoginPage.typeusername();
			loginPage.typepassword();
			loginPage.clickOnLoginButton();			
		}
	}

