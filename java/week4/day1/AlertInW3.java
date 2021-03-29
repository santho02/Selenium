package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertInW3 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().accept();
		String text = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		System.out.println(text);
		
		  File source=driver.getScreenshotAs(OutputType.FILE);
	      File target=new File("./snap/frame.png");
	      FileUtils.copyFile(source, target);
		
	}

}
