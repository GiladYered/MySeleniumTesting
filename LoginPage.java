package MySeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    /*create static LoginPage instance for design pattern singleton*/
    
	
	WebDriver driver;
	
	By username= By.id("edit-user-name");
	By password= By.id("edit-password");
	By Loginbutton= By.id("edit-submit--2");
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	

	/*Methods*/
	public void typeusername () 
	{
		driver.findElement(username).sendKeys("gilady1");	
	}
	
	public void typepassword () 
	{
		driver.findElement(password).sendKeys("gilady1");	
	}

	public void clickOnLoginButton () 
	{
		driver.findElement(Loginbutton).click();	
	}
	
}



//code for try-
//By changeprotectedLevel= By.cssSelector("Div.entity entity-field-collection-item field-collection-item-field-orginal-buttons clearfix");


//import org.apache.xpath.operations.Div;
	
//	public void ClickOnButtunChangeProtectedLevel () 
//	{
//		getdriver.findElement(changeprotectedLevel).click();	
//	}
	
	//loginPage.ClickOnButtunChangeProtectedLevel();
	//driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div/div[9]/div/div/div/div[4]/div/div/section[2]/div/div")).click();