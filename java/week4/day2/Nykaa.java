package week4.day2;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
	    driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//li[@class='menu-dropdown-icon']//a"));
		act.moveToElement(brands).perform();
		Thread.sleep(2000);
		WebElement popular = driver.findElement(By.xpath("//div[@class='BrandsCategoryHeading']//a[1]"));
		act.moveToElement(popular).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']")).click();
        Set<String> newwindow1 = driver.getWindowHandles();
        for (String eachwindow : newwindow1) {
		}
        ArrayList<String> allwindow=new ArrayList<String>(newwindow1);
        driver.switchTo().window(allwindow.get(1));
        System.out.println(driver.getTitle());
		Thread.sleep(1000);	
		driver.findElement(By.className("value")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='filter-sidebar__filter-wrap']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Shampoo'])[1]")).click();
		WebElement shampoo = driver.findElement(By.xpath("//div[@id='listingContainer']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[13]/div[1]/label[1]/span[1]/span[1]"));
		String text1 = shampoo.getText();
		Thread.sleep(1000);
		WebElement filters = driver.findElement(By.xpath("(//div[@class='clearfix'])[2]"));
		String text2 = filters.getText();
		System.out.println(text2);
		Thread.sleep(1000);
		//(//ul[@class='pull-left applied-filter-lists']/li)[1]--> to get the text as shampoo
		if(text1.contains(text2)) {
			System.out.println("The Filter has a Shampoo");
		}else {
			System.out.println("No Filter");
		}
		
		driver.findElement(By.xpath("(//div[@class='m-content__product-list__title']//span)[3]")).click();	
		Set<String> newwindow2 = driver.getWindowHandles();
		for (String eachwindow : newwindow2) {		
		}
		ArrayList<String> allwindows=new ArrayList<String>(newwindow2);
		driver.switchTo().window(allwindows.get(2));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@class='  size-pallet-selected text-center']//span[1]")).click();
		String text3 = driver.findElement(By.xpath("//span[@class='post-card__content-price-offer']")).getText();
		String price = text3.replaceAll("\\D", "");
		System.out.println("The price of the shampoo is "+price);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='pull-left']//button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='cursor-hand arrowup-tooltip']//div[1]")).click();
		Thread.sleep(2000);
		WebElement grandtotal = driver.findElement(By.xpath("//div[@class='value medium-strong']"));
		String grand = grandtotal.getText();
		String text4 = grand.replaceAll("\\D", "");
		System.out.println("The grand total of the product "+text4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn full')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn full big']")).click();
		Thread.sleep(2000);
		WebElement grandprice = driver.findElement(By.xpath("(//div[@class='value'])[2]"));
		String text5 = grandprice.getText();		
		String text6 = text5.replaceAll("\\D", "");
		System.out.println(text6);
		Thread.sleep(1000);
		if(text4.equals(text6)) {
			System.out.println("The Total value is match");
		}else {
			System.out.println("The value is not match");
		}
		Thread.sleep(1000);
		driver.quit();
		
	}

}

/*
Assignment 2: 
1) Go to https://www.nykaa.com/
2) Mouseover on Brands and Mouseover on Popular
3) Click L'Oreal Paris
4) Go to the newly opened window and check the title contains L'Oreal Paris
5) Click sort By and select customer top rated
6) Click Category and click Shampoo
7) check whether the Filter is applied with Shampoo
8) Click on L'Oreal Paris Colour Protect Shampoo
9) GO to the new window and select size as 175ml
10) Print the MRP of the product
11) Click on ADD to BAG
12) Go to Shopping Bag 
13) Print the Grand Total amount
14) Click Proceed
15) Click on Continue as Guest
16) Check if this grand total is the same in step 13
17) Close all windows
*/
