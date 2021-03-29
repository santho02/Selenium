package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public ChromeDriver driver;
	public SoftAssert SoftAssert;  
    
    @Parameters({"url","username","password"})
	@BeforeMethod
	public void Precondition() {
    	//To create an object for the softassert to verify.
    	//SoftAssert=new SoftAssert();
		WebDriverManager.chromedriver().setup();
		driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	
}
