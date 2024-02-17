package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.basetest;
import testdata.DataProvLogin;



public class LoginTestCases extends basetest {

		@Test(dataProvider="userdetailsprimary",dataProviderClass=DataProvLogin.class)
		public void testcaseonetoseven(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
			driver.findElement(By.xpath(loc.getProperty("signin_password"))).sendKeys(password);
			driver.findElement(By.xpath(loc.getProperty("signin_button"))).click();
		
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcaseseven(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
			driver.findElement(By.xpath(loc.getProperty("change_acclink"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcaseeight(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
			driver.findElement(By.xpath(loc.getProperty("forgot_password"))).click();
			driver.findElement(By.xpath(loc.getProperty("forgot_password_continue"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasenineandten(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
			driver.findElement(By.xpath(loc.getProperty("forgot_password"))).click();
			driver.findElement(By.xpath(loc.getProperty("keepmesignedin"))).click();
			driver.findElement(By.xpath(loc.getProperty("details"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcaseeleven(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("signin_email"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("signin_continue"))).click();
			driver.findElement(By.xpath(loc.getProperty("forgot_password"))).click();
			driver.findElement(By.xpath(loc.getProperty("customerservice"))).click();
			
		}
		
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasetwelve(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("conditionsofuse"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasethirteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("privacynotice"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasefourteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("help"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasefifteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("createacc"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasesixteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("needhelp"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcaseseventeen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("otherissues"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcaseeighteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("shoponamazonbusiness"))).click();
			
		}
		
		@Test(dataProvider="userdetailssecondary",dataProviderClass=DataProvLogin.class)
		public void testcasenineteen(String username,String password) {
			driver.findElement(By.xpath(loc.getProperty("shoponamazonbusiness"))).click();
			driver.findElement(By.xpath(loc.getProperty("amazonbusinessemailorphone"))).sendKeys(username);
			//driver.findElement(By.xpath(loc.getProperty("amazonbusinesssignedin"))).click();
			driver.findElement(By.xpath(loc.getProperty("amazonbusinesspassword"))).sendKeys(password);
			driver.findElement(By.xpath(loc.getProperty("amazonbusinesssignin"))).click();
		
		}
		
		
		
		
		
		
		
}
