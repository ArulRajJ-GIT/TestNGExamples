package dynamicDataDrivenFromExcell;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DynMultipleRCCalling {
	
	@Test(dataProvider="getData",dataProviderClass=CallingSheetDataFromDyn.class)
	public String[][] getDataFromExcell() throws IOException {
		String fileLocation="C:\\Users\\Arul\\Downloads\\Book1.xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String data[][]=new String[lastRowNum][lastCellNum];
		for (int i = 0; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter format= new DataFormatter();
				String formatCellValue = format.formatCellValue(cell);
				System.out.println(formatCellValue);
				data[i-1][j]=formatCellValue;
			}
		}
		wBook.close();
		return data;
	}
	

}
