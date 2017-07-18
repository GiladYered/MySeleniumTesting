package MySeleniumTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingletonWebDriver {
	
	/*static CONS'R for design pattern singleton*/
	private static SingletonWebDriver instance = null;
	
	private SingletonWebDriver() {} ;
	
	public static SingletonWebDriver getinstance()
	{
		if (instance ==null)
		{
			instance = new SingletonWebDriver();
		}
		return instance;
		
	}
	
	protected static WebDriver ConnectToWebSiteByChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yered\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
}
