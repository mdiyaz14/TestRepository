package OpenDemoCart;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ODCTest {
	String driverPath ="C:\\Users\\IYAZMO\\OneDrive - Capgemini\\Desktop\\Selenium\\selenium jars\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	ODCLogin objODCLogin;
	ODCHome objODCHome;
	
	@SuppressWarnings("deprecation")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("//demo.opencart.com/");
		
		
	}
	public void test_Home_Page_Appear_Correct() {
		objODCLogin = new ODCLogin(driver);
		
		objODCLogin.loginToODC("Admin", "admin123");
		
		objODCHome=new ODCHome(driver);
		
		Assert.assertTrue(objODCHome.getHomePageDashboardUserName().matches("^welcome.*"));
		driver.close();
	}
}
