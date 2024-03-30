package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestDemo {
public static void main(String[] args) throws Throwable {
	
	FileInputStream file = new FileInputStream("C://SeleniumData//Book2.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowCount = sheet.getLastRowNum();
	short colCount = sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<rowCount;i++)
	{
		XSSFRow currentRow = sheet.getRow(i);
		
		for(int j=0;j<colCount;j++)
		{
			String vlaue = currentRow.getCell(j).toString();
			System.out.print("   "+ vlaue);
	}
		System.out.println();
	}
	
}
}
