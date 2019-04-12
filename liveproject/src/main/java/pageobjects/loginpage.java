package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name='uid']")
	WebElement userid;
	
	
	@FindBy(css="input[type='password']")
	WebElement password;
	
	@FindBy(css="input[value='LOGIN']")
	WebElement loginbutton;
	
	public WebElement enteruserid()
	{
		return userid;
	}

	public WebElement enterpassword()
	{
		return password;
	}
	
	public WebElement clickloginbutton()
	{
		return loginbutton;
	}
}
