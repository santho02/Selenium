package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithFrameTest {

	public static void main(String[] args) throws InterruptedException {
	     WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        ChromeDriver driver = new ChromeDriver(options);
	        // Maximize the browser
	        driver.manage().window().maximize();
	        driver.get("http://www.leafground.com/pages/frame.html");
	        // Implicitly wait for 5 milliseconds
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       Thread.sleep(1000);
	        int size = driver.findElementsByTagName("iframe").size();
	        //System.out.println(size);
	        
	        int count = size;
	        
	        for (int i = 0; i < size; i++) {
	        driver.switchTo().frame(i);
	        count = count + driver.findElementsByTagName("iframe").size();
	        driver.switchTo().defaultContent();
	        
	        }
	        System.out.println(count);
	    }
	
	}

/*
 * WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(options);
        // Maximize the browser
        driver.manage().window().maximize();
        driver.get("http://www.leafground.com/pages/frame.html");
        // Implicitly wait for 5 milliseconds
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        driver.findElementByXPath("//button[@id='Click1']").click();
 */
