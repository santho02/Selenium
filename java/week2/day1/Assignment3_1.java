package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week2/day1.assignments/CreateLead.java");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.getTitle();
		
	}

 }
