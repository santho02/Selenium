package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
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
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Merge Leads")).click();  
	//driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys("10275"); 
	driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys("10290");  
	driver.findElement(By.linkText("Merge")).click();
	driver.switchTo().alert().accept();  
	driver.findElement(By.linkText("Find Leads")).click(); 
	driver.findElement(By.xpath("//span[text()='Advanced']/following::input")).sendKeys("9988796"); 
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
    String element = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]")).getText();
	System.out.println(element);
	driver.quit();
	
	
	}
}


/*
Application : http://leaftaps.com/opentaps/control/main
==========
1. Launch the browser
2. Enter the username
3. Enter the password
4. Click Login
5. Click crm/sfa link
6. Click Leads link
7. Click Merge leads
8. Click on Icon near From Lead
9. Move to new window
10. Enter Lead ID
11. Click Find Leads button
12. Click First Resulting lead
13. Switch back to primary window
14. Click on Icon near To Lead
15. Move to new window
16. Enter Lead ID
17. Click Find Leads button
18. Click First Resulting lead
19. Switch back to primary window
20. Click Merge
21. Accept Alert
22. Click Find Leads link
23. Enter From Lead ID
24. Click Find Leads button
25. Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
26. Close the browser (Do not log out)
 */