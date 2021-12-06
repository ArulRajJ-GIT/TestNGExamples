package dynamicDataDrivenFromExcell;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class CallingSheetDataFromDyn {
	
	@DataProvider(name="getDataFromExcell")
	public String[][] getData() throws IOException {
		DynMultipleRCCalling call=new DynMultipleRCCalling();
		String[][] dataFromExcell = call.getDataFromExcell();
		return dataFromExcell;
	}
	

}
