package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead { 
	static FileInputStream f;   //these three are the class in the dependency
	static XSSFWorkbook w;
	static  XSSFSheet sh;
	 


public static String getStringData(int a,int b) throws IOException
{
	f=new FileInputStream("E:\\ExcelReadData.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
}
public static String getIntegerData(int a,int b) throws IOException
{
	f=new FileInputStream("E:\\ExcelReadData.xlsx");
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	int x=(int) c.getNumericCellValue();  //typecasting integer to string
	return String.valueOf(x);
}

}