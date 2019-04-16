package package1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.loginpage;
import resources.base;

public class TC1 extends base{
	
	public static Logger log = LogManager.getLogger(TC1.class.getName());
	
	WebDriver driver;
	
	@Test
	public void ckeckloginfunc() throws IOException
	{
		driver = initializebrowser();
		log.info("browser opened successfully");
		driver.get(openwebsiteurl());
		log.info("website opened successfully");
		
		loginpage lp = new loginpage(driver);
		
		lp.enteruserid().sendKeys("UserId");
		log.info("userid entered successfully");
		
		lp.enterpassword().sendKeys("Password");
		log.info("password entered successfully");
		
		lp.clickloginbutton().click();
		log.info("login button clicked");
		log.info("login successful");
	}
	

}
