package ExcelActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fun {
  @Test
  public void Pageobj() {
	  
	  WebDriver Mh11;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
	   Mh11 = new ChromeDriver();
	   Mh11.get("http://10.188.144.28:8083/TestMeApp");
	
	   TestmeObjRepositiry loginobj = new TestmeObjRepositiry(Mh11);
	   
	   loginobj.typeusername("admin");
	   loginobj.typepWd("password1234");
	   loginobj.clicksign();
  }
}
