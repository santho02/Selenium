package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
	    driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		WebElement womens = driver.findElement(By.xpath("//a[text()='Women'][1]"));
		act.moveToElement(womens).perform();
		driver.findElement(By.xpath("//a[text()='Jackets & Coats']")).click();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.className("title-count")).getText();
		String totalCount=text.replaceAll("\\D", "");
        System.out.println("The total Coats and Jackets "+totalCount);
		int a=Integer.parseInt(totalCount);
		
        String text2 = driver.findElement(By.xpath("//input[@value='Jackets']/following-sibling::span[1]")).getText();
		String jacket=text2.replaceAll("\\D", "");
		System.out.println(jacket);
		int b=Integer.parseInt(jacket);
		
		String text3 = driver.findElement(By.xpath("//input[@value='Coats']/following-sibling::span[1]")).getText();
		String coats=text3.replaceAll("\\D", "");
		System.out.println(coats);
		int c=Integer.parseInt(coats);
							
		 if(a==b+c)
		{
			System.out.println("The iteam count is match");
		}else {
			System.out.println("The item count is mismatch");
		}
										
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label']//div)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("MANGO");
		driver.findElement(By.xpath("//label[@class=' common-customCheckbox']//div[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[@class='FilterDirectory-titleBar']//span[1]")).click();
		
	    String text4 = driver.findElement(By.xpath("//input[@value='MANGO']/following-sibling::span[1]")).getText();
	    String mango=text4.replaceAll("\\D", "");
	    System.out.println(mango);
	    int man=Integer.parseInt(mango);
	    
	    String text5 = driver.findElement(By.xpath("//div[@class='title-container']//span[1]")).getText();
        String mangoTotal=text5.replaceAll("\\D", "");
        System.out.println(mangoTotal);
        int manTO=Integer.parseInt(mangoTotal);
	    
        if(man==manTO) {
        	System.out.println("The mango and total count is match");
        }else {
        	System.out.println("The mango and total count is Not match");
        }
        WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
        act.moveToElement(sort).perform();
        Thread.sleep(100);
        driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
        Thread.sleep(100);
        String priceofItem = driver.findElement(By.xpath("(//div[@class='product-price']//span)[2]")).getText();
        System.out.println(priceofItem);
        //driver.findElement(By.xpath("//span[contains(@class,'product-wishlistFlex product-actionsButton')]//span"));
      WebElement item = driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]"));
      act.moveToElement(item).perform();
      driver.findElement(By.xpath("//span[@class='desktop-userTitle']")).click();
      driver.close();
	}

}
/*
Assignment 1: 
1) Open https://www.myntra.com/
2) Mouse over on WOMEN 
3) Click Jackets & Coats
4) Find the total count of item 
5) Validate the sum of categories count matches
6) Check Coats
7) Click + More option under BRAND	
8) Type MANGO and click checkbox
9) Close the pop-up x
10) Confirm all the Coats are of brand MANGO
11) Sort by Better Discount
12) Find the price of first displayed item
13) Mouse over on size of the first item
14) Click on WishList Now
15) Close Browser 
*/

