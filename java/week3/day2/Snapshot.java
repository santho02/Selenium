package week3.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("http://leafground.com/pages/Window.html");
	      driver.manage().window().maximize();
	      
	      File source=driver.getScreenshotAs(OutputType.FILE);
	      File target=new File("./window_timestamp.png");
	      FileUtils.copyFile(source, target);
	      
	}

}
