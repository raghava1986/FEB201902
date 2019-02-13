package ExcelActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestmeObjRepositiry {
	WebDriver driver;
	By Siginlink = By.linkText("SignIn");
	By Homebutton = By.linkText("Home");
	By username = By.name("userName");
	By Pwd = By.name("password");
	By Loginbutton =By.name("Login");


		

	public  TestmeObjRepositiry(WebDriver mh11) {
	this.driver =driver;
	}
	public void typeusername(String uname) {
		driver.findElement(username).sendKeys(uname);
		
	} 
	public void typepWd(String password) {
		driver.findElement(Pwd).sendKeys(password);
	}
	
	public void clicksign(){
		driver.findElement(Loginbutton).click();
		

	}
}
