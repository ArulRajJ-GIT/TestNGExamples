package dataDriven;

public class DataProvider { //This SSProg goes to DataDrivenOutieClass Class with DataDriven Concept refer that also
	
	
	//indices is for run a particular string ex:0 and 2 string only pass in.
	//parallel will run simultaneously
	//we can declare without name also but we must call it by methodName
	@org.testng.annotations.DataProvider(name="login", parallel=true, indices={0,2}) //assign it and it can be assign more than one
	public String[][] login() {
		String[][] set=new String[3][2];
		set[0][0]="arulseba93@gmil.com";
		set[0][1]="arulseba93";
		
		set[1][0]="arulraj93@gmil.com";
		set[1][1]="arulseba93";
		
		set[2][0]="arulrajj93@gmil.com";
		set[2][1]="arulseba93";
		
		return set;
		
	}

}
