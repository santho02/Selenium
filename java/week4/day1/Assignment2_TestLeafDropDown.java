package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_TestLeafDropDown {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			WebElement appium = driver.findElement(By.xpath("//section[@class='innerblock']/div[6]/select/option[@value='2']"));
	     WebElement load = driver.findElement(By.xpath("//section[@class='innerblock']/div[6]/select/option[@value='4']"));
			Actions act=new Actions(driver);
			act.keyDown(Keys.CONTROL).click(appium).click(load).keyUp(Keys.CONTROL).release().perform();
			
	}

}
