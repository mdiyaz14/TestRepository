package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OHRMHome {
	WebDriver driver;
	@FindBy(id="welcome")
	WebElement homePageUserName;
	
	public OHRMHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public String getHomePageDashBoardUserName() {
		return homePageUserName.getText();
	}
}
