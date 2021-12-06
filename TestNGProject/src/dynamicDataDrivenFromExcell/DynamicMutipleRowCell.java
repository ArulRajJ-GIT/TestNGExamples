package dynamicDataDrivenFromExcell;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicMutipleRowCell {
	
	private void getDataFromExcell() throws IOException {
		String fileLocation="C:\\Users\\Arul\\Downloads\\Book1.xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastRowNum);
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				DataFormatter format=new DataFormatter();
				String formatCellValue = format.formatCellValue(cell);
				System.out.println(formatCellValue);
			}
		}
		wBook.close();
	}

}
