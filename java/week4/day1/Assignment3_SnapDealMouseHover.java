package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_SnapDealMouseHover {

	public static void main(String[] args) throws InterruptedException {

    	WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
    	driver.manage().window().maximize();
	    WebElement mensfashion = driver.findElement(By.xpath("//li[@class='navlink lnHeight'][1]"));
		WebElement loafers = driver.findElement(By.xpath("//span[text()='Loafers']"));
		Actions act=new Actions(driver);
		act.moveToElement(mensfashion).perform();
		loafers.click();
		Thread.sleep(3000);
		WebElement black = driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])//div[1]"));
		act.moveToElement(black).perform();
		black.click();
		driver.quit();
		

	}

}
