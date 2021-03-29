package week4.day2;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.KeySubst;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Justdial {

	public static void main(String[] args) throws InterruptedException { 
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver =new ChromeDriver(options);
    driver.get("https://www.justdial.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//div[@class='search-city mnsrchwpr']//input[1]")).click();;
	WebElement findElement = driver.findElement(By.xpath("//li[@id='Chennai']//a[1]"));
	act.moveToElement(findElement).click().perform();
	driver.findElement(By.xpath("//a[@title='Auto Care in Chennai']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@title='Car Repair']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@title='Hyundai'][1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@title='Hyundai Xcent'][1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@title='All Options']")).click();
	WebElement sortby = driver.findElement(By.id("sortbydist"));
	sortby.sendKeys("porur");
	Thread.sleep(100);
	
	}

}
/*
Assignment 3:
1) https://www.justdial.com/
2) Set the Location as Chennai
3) Click Auto Care in the left menu
4) Click Car Repair
5) Click Car Brand as Hyundai
6) Click Make as Hyundai Xcent
7) Click on Location and Enter Porur
8) click on “All Options”
9) Select Porur from the dropdown list
10) Select Distance starting from 1 km
11) Identify all the Service Center having Ratings >=4.5 and Votes >=50
12) Save all the Service Center name and Phone number matching the above condition in excel 
13) Close the browser
*/

