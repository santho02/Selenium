package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eRail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("https://erail.in/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
	      WebElement fromStation = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
	      fromStation.clear();
	      fromStation.sendKeys("ms",Keys.TAB);
	     
	      WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
	      toStation.clear();
	      toStation.sendKeys("mdu",Keys.TAB);
	     
	      driver.findElement(By.id("chkSelectDateOnly")).click();
	      
	      //driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
	   
	      Thread.sleep(2000);
	      
	      List<String> listTrainNames=new ArrayList<String>();
	      
	      List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr"));
	 
	      for (int i = 0; i <= rows.size(); i++) {
	    	  String trainNames = driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
	    	  listTrainNames.add(trainNames);
		}
	      Set<String> setTrainNames= new HashSet<String>(listTrainNames);
	      if(listTrainNames.size()== setTrainNames.size())
	      {
	    	  System.out.println("No Duplicate");
	      }else {
	    	  System.out.println("There are duplicate Train names");
	      }
	     
	      
	      
	}

}
