package ExcelActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readingFile {
  @Test
  public void ReadExcel() throws IOException {
	  File Src= new File("C:\\Users\\training_H1b.06.15\\Pictures\\Screenshots\\TestId.xlsx");
	  
  FileInputStream fs= new FileInputStream(Src);
   XSSFWorkbook Wb = new XSSFWorkbook(fs);
   XSSFSheet Sh = Wb.getSheetAt(0);
   
   String data00 = Sh.getRow(0).getCell(0).getStringCellValue();
   System.out.println(data00);
   String data01 = Sh.getRow(0).getCell(1).getStringCellValue();
   System.out.println(data01);
   Wb.close();
   
  }
  
}
