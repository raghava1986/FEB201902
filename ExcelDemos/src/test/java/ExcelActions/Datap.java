package ExcelActions;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datap {
	 FileInputStream fs;
	 XSSFWorkbook Wb;
	 XSSFSheet Sh;
	 WebDriver Driver;
  @Test(dataProvider="sampledata")
  public void testf(String UID,String Pwd) throws IOException, InterruptedException {
		
		
		Driver= BrowserLaunch.LaunchChrome();
			  
			   Thread.sleep(3000);
			  
			   Driver.findElement(By.linkText("SignIn")).click();
			   Thread.sleep(3000);
			   Driver.findElement(By.name("userName")).sendKeys(UID);
			   Driver.findElement(By.name("password")).sendKeys(Pwd);
			   Driver.findElement(By.name("Login")).click();
			   Thread.sleep(3000);
			   String name = Driver.findElement(By.linkText("SignOut")).getText();
			     Assert.assertEquals(name,"SignOut");
			   
  }
    @AfterMethod
    public void closebrowser() throws IOException {
    	Driver.close();
    	Wb.close();
    }
  @DataProvider(name="sampledata")
  public Object[][] Testdata() throws IOException {
	  
	  File Src= new File("C:\\Users\\training_H1b.06.15\\Pictures\\Screenshots\\TestId.xlsx");
	  fs = new FileInputStream(Src);
	  Wb = new XSSFWorkbook(fs);
	   Sh = Wb.getSheetAt(0);
	   int rowcount = Sh.getLastRowNum();
	   int totalncnt = rowcount +1;
	   Object[][] data=new Object[totalncnt][2];
	   for (int i=0;i<totalncnt;i++) {
		   data[i][0]  = Sh.getRow(i).getCell(0).getStringCellValue();
		   data[i][1]  = Sh.getRow(i).getCell(1).getStringCellValue();  
	   }
	return data;
	
	  
  }
}
