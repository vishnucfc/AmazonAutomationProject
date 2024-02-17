package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class basetest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc= new Properties();
	public static FileReader fr ;
	public static FileReader fr1;
	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
			
			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			fr1= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locator.properties");
			prop.load(fr);
			loc.load(fr1);
		}
		

		if(prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckdriver\\geckodriver.exe");
			
			driver= new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
	
		else if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testurl"));
		}
		
		
	}
		
	
		
	
	
	@AfterMethod
	public void teardown() {
		//driver.close();
		System.out.println("teardown successful");
	}
	
}
