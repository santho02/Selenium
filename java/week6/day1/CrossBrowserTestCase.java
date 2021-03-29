package week6.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTestCase {

	RemoteWebDriver driver;

   
	@Parameters({"browser"})
	@Test
	public void leafTapsLogin(String browser) {
		
	if(browser.equalsIgnoreCase("chrome")) {   
		WebDriverManager.chromedriver().setup();
		driver=	new ChromeDriver();
	}else
	if(browser.equalsIgnoreCase("firefox")) {   
		WebDriverManager.chromedriver().setup();
		driver=	new FirefoxDriver();
	}else
		if(browser.equalsIgnoreCase("edge")) {   
			WebDriverManager.chromedriver().setup();
			driver=	new EdgeDriver();
		}
	
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
   }
	
}
