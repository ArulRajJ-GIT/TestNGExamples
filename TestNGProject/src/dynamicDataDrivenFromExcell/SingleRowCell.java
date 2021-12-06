package dynamicDataDrivenFromExcell;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SingleRowCell {
	
	public static void main(String[] args) throws IOException {
		String fileLocation="C:\\Users\\Arul\\Downloads\\Book1.xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheetAt = wBook.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(1);
		XSSFCell cell=row.getCell(1);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);
		wBook.close();
	
	}
}
