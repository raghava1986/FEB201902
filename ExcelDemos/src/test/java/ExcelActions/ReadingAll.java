package ExcelActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadingAll {
  @Test
  public void Rall() throws IOException, InterruptedException {
	  File Src= new File("C:\\Users\\training_H1b.06.15\\Pictures\\Screenshots\\TestId.xlsx");
	  
  FileInputStream fs= new FileInputStream(Src);
   XSSFWorkbook Wb = new XSSFWorkbook(fs);
   XSSFSheet Sh = Wb.getSheetAt(0);
   int rowcount = Sh.getLastRowNum();
   rowcount = rowcount +1;
   System.out.println("RowCount"+""+rowcount);
   for (int i=1;i<rowcount;i++) {
	   String Uid = Sh.getRow(i).getCell(0).getStringCellValue();
	   String Pwd = Sh.getRow(i).getCell(1).getStringCellValue();
	   Testlogin.TestloginMethod(Uid, Pwd);
	 
  }

   Wb.close();
  }
  
  
}
