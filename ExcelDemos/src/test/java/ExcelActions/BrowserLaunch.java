package ExcelActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static  WebDriver LaunchChrome() {
		WebDriver Mh11;
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
		   Mh11 = new ChromeDriver();
		   Mh11.get("http://10.188.144.28:8083/TestMeApp");
		return Mh11;
		   
	}

	
}
