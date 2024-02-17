package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testdata.DataProvCheckout;
import base.basetest;

public class CheckoutTestcases extends basetest {
	
	@BeforeMethod
	public void login() throws InterruptedException {
		WebElement signinhome = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(signinhome).perform();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-flyout-accountList\"]")));
		WebElement signinbutton = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/a/span"));
		signinbutton.click();
		driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys("vishnufdz07@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
		driver.findElement(By.xpath(loc.getProperty("signin_password"))).sendKeys("53575022");
		driver.findElement(By.xpath(loc.getProperty("signin_button"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("cart"))).click();
		
	}	
	
	@Test(dataProvider="cartuserdetails",dataProviderClass=DataProvCheckout.class)
	public void testcaseone(String name,String mobilenum,String housenum,String area,String Landmark) {
		driver.findElement(By.xpath(loc.getProperty("proceedtobuy"))).click();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("checkoutname"))));
		driver.findElement(By.xpath(loc.getProperty("checkoutname"))).sendKeys(name);
		driver.findElement(By.xpath(loc.getProperty("checkoutmobilenum"))).sendKeys(mobilenum);
		driver.findElement(By.xpath(loc.getProperty("checkouthousenum"))).sendKeys(housenum);
		driver.findElement(By.xpath(loc.getProperty("checkoutarea"))).sendKeys(area);
		driver.findElement(By.xpath(loc.getProperty("checkoutlandmark"))).sendKeys(Landmark);
		driver.findElement(By.xpath(loc.getProperty("checkoutdefaultaddresscheckbox"))).click();
	}
	
	@Test
	public void testcaseeight() {
		//check autofill option
		driver.findElement(By.xpath(loc.getProperty("proceedtobuy"))).click();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("checkoutautofill"))));
		driver.findElement(By.xpath(loc.getProperty("checkoutautofill"))).click();
		//driver.switchTo().alert().accept();
	}
	
	@Test
	public void testcasenine() {
		//delivery instructions home
		driver.findElement(By.xpath(loc.getProperty("proceedtobuy"))).click();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("checkoutdeliveryinstructions"))));
		
		driver.findElement(By.xpath(loc.getProperty("checkoutdeliveryinstructions"))).click();
		/*WebElement element = driver.findElement(By.id(loc.getProperty("checkoutdeliveryinstructionshouse")));
		Actions act = new Actions(driver);
		act.moveToElement(element);
		act.perform();*/
		//driver.findElement(By.xpath(loc.getProperty("checkoutdeliveryinstructionshouse"))).click();
		
	}
		
}
