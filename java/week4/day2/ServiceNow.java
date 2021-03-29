package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev68594.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.switchTo().frame("gsft_main");
		WebElement login = driver.findElement(By.xpath("//div[@class='login']//input[1]"));
		login.sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElementByXPath("//button[@id='sysverb_login']").click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[text()='Create New'])[1]")).click();
		Thread.sleep(1000);
		WebElement caller = driver.findElement(By.xpath("//div[@class='input-group ref-container']//input"));
		caller.sendKeys("Guest",Keys.ENTER);
		driver.switchTo().frame(caller);
		Thread.sleep(1000);
		WebElement description = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		description.sendKeys("Automation Testing");
		driver.switchTo().frame(description);
		Thread.sleep(1000);
		WebElement inciNumber = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		String regNumber = inciNumber.getText();
		System.out.println(regNumber);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='sysverb_insert']")).click();
		
		
	}

}
