package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ReadTheDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
FileInputStream file = new FileInputStream("./src/test/resources/Book1.xlsx");	

Workbook workbook = WorkbookFactory.create(file);
Sheet sheet = workbook.getSheet("sheet1");
Row row = sheet.getRow(3);
Cell cell = row.getCell(2);
double cellValue = cell.getNumericCellValue();
System.out.println("cellValue :"+cellValue);
}
}
