package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	WebDriver driver;
	Properties prop;
	
	public WebDriver initializebrowser() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\liveproject\\src\\main\\java\\resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	
	public String openwebsiteurl()
	{
		String websiteurl = prop.getProperty("url");
		return websiteurl;
	}

}
