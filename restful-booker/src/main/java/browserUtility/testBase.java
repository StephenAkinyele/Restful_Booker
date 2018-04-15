package browserUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {
	WebDriver driver;
	 
    //String browserType = "Chrome";
	
	
	

	public void setBrowser(String browserType)
	{

		if (browserType.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
				
	
	}// end browser setUp
	
	public void getUrl(String Url)
	{
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	

}
