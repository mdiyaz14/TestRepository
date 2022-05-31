package OpenDemoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ODCHome {
	WebDriver driver;
	By homePageUserName=By.id("Welcome");
	
	public ODCHome(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getHomePageDashboardUserName() {
		return driver.findElement(homePageUserName).getText();
		
	}
}
