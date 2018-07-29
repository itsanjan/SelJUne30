package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class TC001_CreateLeadNEG extends Annotations{
	
	@BeforeTest
	public void setValues() {
		excelFileName = "CreateLeadNEG";
		testName = "Create Lead(NEG)";
		testDesc = "Create a New Lead";
		category = "sanity";
		author = "sarath";
		moduleName = "Leads";
	}
	

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName,String expectedText) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.clickSubmitForFailure()
		.verifyErrMsg(expectedText);
		
	}
}
















