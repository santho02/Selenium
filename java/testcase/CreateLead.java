package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week5.day2.ReadExcel;

public class CreateLead extends BaseClass{

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String url, String username, String password) {
	
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(url);
		driver.findElementById("createLeadForm_firstName").sendKeys(username);
		driver.findElementById("createLeadForm_lastName").sendKeys(password);
		driver.findElementByName("submitButton").click();
		//Assertion
		//To check wheather the first name is displayed or not.
		/*boolean fname = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		SoftAssert.assertTrue(fname);
		SoftAssert.assertAll();
		 */
	
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException{
		ReadExcel re=new ReadExcel();
		String[][] data = re.excelRead();

	return data;
	/*
	 * data[0][0]="TestLeaf";
	data[0][1]="kiruthi";
	data[0][2]="v";
	
	data[1][0]="vetti";
	data[1][1]="santhosh";
	data[1][2]="s";
	 */
}
}





