package OpenDemoCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ODCLogin {
WebDriver driver;
	
	By userName= By.name("txtUsername");
	By password= By.name("txtPassword");
	By login= By.name("Submit");
	
	  public ODCLogin(WebDriver driver){
 
        this.driver = driver;
 
    }
	  public void setUserName(String strUserName){
		  
	        driver.findElement(userName).sendKeys(strUserName);
	 
	    }
	 
	 
	    public void setPassword(String strPassword){
	 
	         driver.findElement(password).sendKeys(strPassword);
	 
	    }
	 
	    public void clickLogin(){
	 
	            driver.findElement(login).click();
	 
	    }
	 
	    public void loginToODC(String strUserName,String strPasword){
	 
	        this.setUserName(strUserName);
	 
	        this.setPassword(strPasword);
	 
	        this.clickLogin();        
	    }
}
