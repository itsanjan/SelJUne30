package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLead extends Annotations{
	
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLead";
		testName = "Create Lead";
		testDesc = "Create a New Lead";
		category = "smoke";
		author = "sarath";
		moduleName = "Leads";
	}
	

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmit()
		.verifyFirstName(fName);
		
	}
}
















