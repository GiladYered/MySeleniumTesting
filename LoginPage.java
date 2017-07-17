package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    /*create static LoginPage instance for design pattern singleton*/
    private static LoginPage loginPage=null;
	
	WebDriver getdriver;
	
	By username= By.id("edit-user-name");
	By password= By.id("edit-password");
	By Loginbutton= By.id("edit-submit--2");
	

	
	/*static CONS'R for design pattern singleton*/
	public static LoginPage singleton()
	{
		if (loginPage==null)
			loginPage = new LoginPage();
		return loginPage;	
	}
	
	/*My old CONS'R    	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	*/
	

	/*Methods*/
	public void typeusername () 
	{
		getdriver.findElement(username).sendKeys("UserNameIsECT");	
	}
	
	public void typepassword () 
	{
		getdriver.findElement(password).sendKeys("PassIsECT");	
	}

	public void clickOnLoginButton () 
	{
		getdriver.findElement(Loginbutton).click();	
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