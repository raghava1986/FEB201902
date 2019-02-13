package ExcelActions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class Testlogin {
	public static  void TestloginMethod(String UID,String Pwd) throws InterruptedException {
	WebDriver Mh1;
	
	Mh1= BrowserLaunch.LaunchChrome();
		  
		   Thread.sleep(3000);
		  
		   Mh1.findElement(By.linkText("SignIn")).click();
		   Thread.sleep(3000);
		   Mh1.findElement(By.name("userName")).sendKeys(UID);
		   Mh1.findElement(By.name("password")).sendKeys(Pwd);
		   Mh1.findElement(By.name("Login")).click();
		   String name = Mh1.findElement(By.linkText("SignOut")).getText();
		     Assert.assertEquals(UID, name);
		   
		Mh1.close();
	}

}