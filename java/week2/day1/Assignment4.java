package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	@Test
	public void runDuplicateLead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test LTD");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nobro007@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Santhosh");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String title1 = driver.getTitle();
        System.out.println(title1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
        driver.findElement(By.linkText("Duplicate Lead")).click();
        String title2 = driver.getTitle();
        System.out.println(title2);
        driver.findElement(By.linkText("Create Lead")).click();      
        driver.close();		
        
	}

}
