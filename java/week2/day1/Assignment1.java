package week2.day1;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.ListDocumentImpl.ListImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
       
       /* 1) http://leafground.com/pages/Link.html
        *  driver.get("http://leafground.com/pages/Link.html");
      driver.findElement(By.linkText("Go to Home Page")).click();
      driver.navigate().back();
      driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
      //driver.findElement(By.xpath("//button[@id='home']")).click();
      //driver.findElement(By.linkText("Click button to travel home page")).click();
      driver.navigate().back();
      driver.findElement(By.linkText("Verify am I broken?")).click();
      String title = driver.getTitle();
      System.out.println(title); 
      driver.navigate().back();
      driver.findElement(By.linkText("Go to Home Page")).click();
      driver.navigate().back();
      List<WebElement> path = driver.findElementsByXPath("//a");
      System.out.println(path.size());
      driver.navigate().back(); */
      
     /* 2) http://leafground.com/pages/Image.html
      *  driver.get("http://leafground.com/pages/Image.html");
      driver.findElementByXPath("//label[text()='Click on this image to go home page']/following-sibling::img").click();
      driver.navigate().back();
      driver.findElementByXPath("//label[text()='Am I Broken Image?']/following-sibling::img").click();
      String title = driver.getTitle();
      System.out.println(title);
      driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img").click();
      driver.navigate().back();
      */
      
     /* 3)http://leafground.com/pages/Dropdown.html
      *  driver.get("http://leafground.com/pages/Dropdown.html");
      WebElement element = driver.findElementByXPath("//select[@id='dropdown1']");
      Select dropDown=new Select(element);
      dropDown.selectByIndex(1);
    
      WebElement element2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
      Select dropDown1=new Select(element2);
      dropDown1.selectByVisibleText("UFT/QTP");
      
      WebElement element3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
      Select dropDown2=new Select(element3);
      dropDown2.selectByValue("1");
      
      List<WebElement> findElements = driver.findElements(By.xpath("//select[@class='dropdown']/option"));
      System.out.println(findElements.size());
           
     driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Selenium");
     WebElement element5 = driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[6]/select[1]"));
      Select dropDown3=new Select(element5);
      dropDown3.selectByValue("1");
      dropDown3.selectByIndex(2);
      dropDown3.deselectByValue("2");*/
      
    /* 4) http://leafground.com/pages/radio.html
     *  driver.get("http://leafground.com/pages/radio.html");
      driver.findElement(By.xpath("//div[@id='first']//label[1]")).click();
      //WebElement findElement = driver.findElement(By.xpath("//label[@for='Checked']"));
      */
      
      /* 5)http://leafground.com/pages/checkbox.html
       *  driver.get("http://leafground.com/pages/checkbox.html");
       
      driver.findElement(By.xpath("//input[@type='checkbox']")).click();
      
      driver.findElement(By.xpath("//div[text()='Selenium']")).getText();
      
      WebElement element = driver.findElement(By.xpath("//div[text()='I am Selected']"));
      Select check=new Select(element);
      check.deselectAll();
      
      driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']")).click();*/
      
      /* 6) http://leafground.com/pages/table.html
       driver.get("http://leafground.com/pages/table.html");
       
      List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table_id']//tr"));
      System.out.println(rows.size());
      //System.out.println(cells.size());
      
      for (int i = 2; i <= rows.size(); i++) { //This loop is for rows 
    	  List<WebElement> cells = driver.findElements(By.xpath("//table[@id='table_id']//tr["+i+"]/td"));
    	  
		for(int j=1;j<=cells.size();j++)  //This loop is for columns
		{
			String text= driver.findElement(By.xpath("//table[@id='table_id']//tr["+i+"]/td["+j+"]")).getText();
			 System.out.println(text);  */
			
		}  
      }
	
  

