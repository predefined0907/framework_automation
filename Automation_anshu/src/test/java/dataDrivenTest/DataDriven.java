package dataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws Throwable {
	FileInputStream file = new FileInputStream("C://SeleniumData//Book2.xlsx");
	
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workBook.getSheetAt(0);
	
	int rowCount = sheet.getLastRowNum();
	short colCount = sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<rowCount;i++)
	{
		XSSFRow currentRow = sheet.getRow(i);
		
		for(int j=0;j<colCount;j++)
		{
			String value = currentRow.getCell(j).toString();
			System.out.print("   "+value);
		}
		System.out.println();
	}	
}
}
