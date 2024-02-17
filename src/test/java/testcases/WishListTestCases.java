package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.basetest;

public class WishListTestCases extends basetest {

	@BeforeMethod
	public void login() {
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

	}

	@Test
	public void testcaseone() throws InterruptedException {
		// creation of a new list
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("createnewlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(loc.getProperty("createnewlistname"))).clear();
		driver.findElement(By.xpath(loc.getProperty("createnewlistname"))).sendKeys("vishnu");
		driver.findElement(By.xpath(loc.getProperty("createnewlistokbutton"))).click();

	}

	@Test
	public void testcasetwo() {
		// adding to cart
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("addtocart"))).click();

	}

	@Test
	public void testcasethree() throws InterruptedException {
		// moving item to diff lists provided there exists multiple lists
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("movetodifflist"))).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loc.getProperty("dropdownbox"))));
		driver.findElement(By.xpath(loc.getProperty("dropdownoption"))).click();

	}

	@Test
	public void testcasefour() throws InterruptedException {
		// adding comments to the product
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("addcommentslink"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("commentsbox"))).sendKeys("good product");
		driver.findElement(By.xpath(loc.getProperty("savebutton"))).click();

	}

	@Test
	public void testcasefive() throws InterruptedException {
		// adding quantity to the product in the list
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("addcommentslink"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("needs"))).clear();
		driver.findElement(By.xpath(loc.getProperty("needs"))).sendKeys("5");
		driver.findElement(By.xpath(loc.getProperty("has"))).clear();
		driver.findElement(By.xpath(loc.getProperty("has"))).sendKeys("3");
		driver.findElement(By.xpath(loc.getProperty("savebutton"))).click();
	}

	@Test
	public void testcasesix() throws InterruptedException {
		// changing priority
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("addcommentslink"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("priority"))).click();
		driver.findElement(By.xpath(loc.getProperty("medium"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("savebutton"))).click();
	}

	@Test
	public void testcaseseven() {
		// uploading to other media(email)

		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("uploadtoothermediabutton"))).click();
		driver.findElement(By.xpath(loc.getProperty("uploadtoemail"))).click();

	}

	@Test
	public void testcaseeight() {
		// uploading to other media pinterest

		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("uploadtoothermediabutton"))).click();
		driver.findElement(By.xpath(loc.getProperty("uploadtopinterest"))).click();

	}

	@Test
	public void testcasenine() {
		// uploading to other media facebook

		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("uploadtoothermediabutton"))).click();
		driver.findElement(By.xpath(loc.getProperty("uploadtofacebook"))).click();

	}

	@Test
	public void testcaseten() {
		// uploading to other media x

		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("uploadtoothermediabutton"))).click();
		driver.findElement(By.xpath(loc.getProperty("uploadtox"))).click();

	}

	@Test
	public void testcaseeleven() {
		// uploading to other media copylink

		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("uploadtoothermediabutton"))).click();
		driver.findElement(By.xpath(loc.getProperty("copylink"))).click();

	}

	@Test
	public void testcasetwelve() throws InterruptedException {
		// invite someone to view only by copying link
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("sendlisttoothers"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewonly"))).click();
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewonlycopylink"))).click();
	}

	@Test
	public void testcasethirteen() throws InterruptedException {
		// invite someone to view only invite by email
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("sendlisttoothers"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewonly"))).click();
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewonlyinvitebyemail"))).click();
	}

	@Test
	public void testcasefourteen() throws InterruptedException {
		// invite someone to view and edit but cancelling
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("sendlisttoothers"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewandedit"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("")));
		driver.findElement(By.xpath(loc.getProperty("inviteothers_viewandedit_inviteotherslater"))).click();
	}

	@Test
	public void testcasefifteen() throws InterruptedException {
		// invite someone to view and edit by creating profile
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("sendlisttoothers"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(loc.getProperty("inviteothersviewandedit"))).click();
		
		driver.findElement(By.xpath(loc.getProperty("inviteothers_viewandedit_createprofile"))).click();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		driver.findElement(By.xpath(loc.getProperty("inviteothers_viewandedit_createprofile_name"))).clear();
		driver.findElement(By.xpath(loc.getProperty("inviteothers_viewandedit_createprofile_name"))).sendKeys("vishnu");
		driver.findElement(By.xpath(loc.getProperty("inviteothers_viewandedit_createprofile_submit"))).click();
	}

	@Test
	public void testcasesixteen() {
		// change view into grid
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("viewasgrid"))).click();

	}

	@Test
	public void testcaseseventeen() throws InterruptedException {
		// manage list
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("more"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(loc.getProperty("printlist"))).click();

	}

	@Test
	public void testcaseeighteen() throws InterruptedException {
		// print list
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("more"))).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(loc.getProperty("managelist"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("managelistdialogbox")));
		driver.findElement(By.xpath(loc.getProperty("managelist_listname"))).clear();
		driver.findElement(By.xpath(loc.getProperty("managelist_email"))).sendKeys("vishnufdz@gmail.com");

		Actions act = new Actions(driver);

		driver.findElement(By.xpath(loc.getProperty("managelist_bdaymonth"))).click();
		WebElement ele = driver.findElement(By.xpath(loc.getProperty("managelist_bdaymonth")));
		act.sendKeys(ele, Keys.ARROW_DOWN).perform();
		act.sendKeys(ele, Keys.ENTER).perform();

		driver.findElement(By.xpath(loc.getProperty("managelist_bdaydate"))).click();
		WebElement ele1 = driver.findElement(By.xpath(loc.getProperty("managelist_bdaydate")));
		act.sendKeys(ele1, Keys.ARROW_DOWN).perform();
		act.sendKeys(ele1, Keys.ENTER).perform();

		driver.findElement(By.xpath(loc.getProperty("managelist_savechanges"))).click();
	}

	@Test
	public void testcasenineteen() {
		// searching list
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("searchlist"))).sendKeys("Bergmann");
	}

	@Test
	public void testcasetwenty() {
		// browsing history
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("viewbrowsinghistory"))).click();
	}

	@Test
	public void testcasetwentyone() throws InterruptedException {
		// filterandsort unpurchased
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("filterandsort"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("unpurchased"))).click();

	}

	@Test
	public void testcasetwentytwo() throws InterruptedException {
		// filterandsort purchased
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("filterandsort"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(loc.getProperty("purchased"))).click();

	}

	@Test
	public void testcasetwentythree() {
		// deleting items
		driver.get("https://www.amazon.in/hz/wishlist/ls?requiresSignIn=1&ref_=nav_AccountFlyout_wl");
		driver.findElement(By.xpath(loc.getProperty("deletelist"))).click();
	}

}
