package week6.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssert {

	public static void main(String[] args) {
		
		String expTitle="TestLeaf Automation platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		String actTitle = driver.getTitle();
		
		boolean linkpresent = driver.findElementByLinkText("CRM/SFA").isDisplayed();
      SoftAssert soft=new SoftAssert();
      
      soft.assertTrue(linkpresent);
     // soft.assertFalse(linkpresent);
      soft.assertEquals(actTitle, expTitle);

       soft.assertAll();
		
	}

}
