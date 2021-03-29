package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
	    driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement fromSlot = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		fromSlot.sendKeys("Koyambedu, Chennai",Keys.ENTER);
		
		WebElement toSlot = driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
		toSlot.sendKeys("Madurai (All Locations)",Keys.ENTER);
				
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[5]/td[1]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
		 
	    driver.findElement(By.xpath("//span[@class='f-bold busFound']"));
		//List<Integer> buses=new ArrayList<Integer>();
		
		//Set<String> busNames=new LinkedHashSet<String>();
		
		
	}
}
/*
Assignment 3:
=============
1.Launch the browser
2.Go to the https://www.redbus.in/
3.Choose "Koyambedu, Chennai" in FROM field
4.Choose "Madurai (All Locations)" in TO field
5.Select a day next to your current date from the calender
6.Click "Search Buses"
7.Print the number of buses available. (seen at the right top as "....BusesFound"). Try printing the number alone from the whole string.
8.Print the unique travels names ( ie, without duplication)
9.Click on "View Seats" of the first displayed bus.
10. Take a screen shot of the available seats. 
*/
