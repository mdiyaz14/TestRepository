package PageFactory;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMTest {
	String driverPath ="C:\\Users\\IYAZMO\\OneDrive - Capgemini\\Desktop\\Selenium\\selenium jars\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	LoginPage objLoginPage;
	HomePage objHomePage;
	
	@SuppressWarnings("deprecation")
	public void setup() {
		System.setProperty("", driverPath);
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	public void test_Home_Page_Appear_Correct() {
		objLoginPage = new LoginPage(driver);
		
		objLoginPage.loginToOHRM("Admin", "admin123");
		
		objHomePage=new HomePage(driver);
		
		Assert.assertTrue(objHomePage.getHomePageDashBoardUserName().matches("^welcome.*"));
		driver.close();
	}
}
