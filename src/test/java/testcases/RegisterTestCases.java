package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import base.basetest;
import testdata.DataProvResgister;

public class RegisterTestCases extends basetest {
	
	@Test(dataProvider="userdetailsprimary",dataProviderClass=DataProvResgister.class)
	public void tesstcaseonetoseven(String username, String mobileno,String password) {
		
		driver.findElement(By.xpath(loc.getProperty("registerusername"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("registermobileno"))).sendKeys(mobileno);
		driver.findElement(By.xpath(loc.getProperty("registerpassword"))).sendKeys(password);
		driver.findElement(By.xpath(loc.getProperty("registersubmit"))).click();
		
	}
	
	@Test(dataProvider="secondary",dataProviderClass=DataProvResgister.class)
	public void testcasenine(String mobileno) throws InterruptedException {
		
		driver.findElement(By.xpath(loc.getProperty("registerdragdown"))).click();
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN);
		act.sendKeys(Keys.ENTER);
		act.perform();
		driver.findElement(By.xpath(loc.getProperty("registermobileno"))).sendKeys(mobileno);
		Thread.sleep(2000);
	
	}
	
	@Test()
	public void testcaseten() {
		
		driver.findElement(By.xpath(loc.getProperty("registersigninbutton"))).click();
		System.out.println("Page redirect successful");
	
	}
	
	@Test
	public void testcaseeleven() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links are "+li.size());
		
		for(int i=0;i<li.size();i++) {
			System.out.println("Tag "+li.get(i).getAttribute("href"));
		}
	}
	
	@Test
	public void testcasetwelve() {
		
		driver.findElement(By.xpath(loc.getProperty("registerbusinessacc"))).click();
		System.out.println("redirect to business acc successful");
	}
	
	@Test
	public void testcasethirteen() {
		
		driver.findElement(By.xpath(loc.getProperty("conditionsofuse"))).click();
		System.out.println("Redirect to conditions of use successful");
	}
	
	@Test
	public void testcasefourteen() {
		
		driver.findElement(By.xpath(loc.getProperty("privacysection"))).click();
		System.out.println("Redirect to privacy section successful");
	}
	
	@Test
	public void testcasefifteen() {
		
		driver.findElement(By.xpath(loc.getProperty("help"))).click();
		System.out.println("Redirect to help section successful");
	}
}
