package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class T001_TimeSheetTest extends BaseClass {
	

	@Test
	public void fill_TimeSheet()
	{
		HomePage hp=new HomePage(driver);
		hp.clickOnTimeSheet();
		hp.selectDate();
	}

}
