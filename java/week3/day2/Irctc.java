package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.irctc.co.in/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//button[text()='OK']")).click();
	      driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
	      Thread.sleep(2000);
	      WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'block-nav-right d-none')]//a)[3]"));
	      String text = element.getText();
	      System.out.println(text);
	      driver.close();
	      
	}

}
