package dynamicDataDrivenFromExcell;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRowCell {
	
	public void grabDataFromExcel() throws IOException {
		String fileLocation="C:\\Users\\Arul\\Downloads\\Book1.xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wBook.getSheetAt(0);
		for (int i = 1; i < 3; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < 3; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				String format=cellValue.toString();
				System.out.println(format);
			} 
		}
		wBook.close();
	}

}
