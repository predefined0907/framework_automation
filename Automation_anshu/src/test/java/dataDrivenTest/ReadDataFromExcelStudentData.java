package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelStudentData {
public static void main(String[] args) throws IOException {
	
	FileInputStream file = new FileInputStream("./src/test/resources/Book2.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("studentdata");
	
	int rowCount = sheet.getLastRowNum();
	
	short cellCount = sheet.getRow(0).getLastCellNum();
	
	for(int i=0;i<rowCount;i++)
	{
		XSSFRow currentRow = sheet.getRow(i);
		for(int j=0;j<cellCount;j++)
		{
			String value = currentRow.getCell(j).toString();
			System.out.print("  "+value);
		}
		System.out.println();
	}
	
	
	
	
}
}
