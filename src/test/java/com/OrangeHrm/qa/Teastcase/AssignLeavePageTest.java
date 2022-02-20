package com.OrangeHrm.qa.Teastcase;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Utilities.ExcelRead;



public class AssignLeavePageTest extends BasePageTest {
@Test(priority=1)
public void loginFunction()
{
	loginpage.loginAction(username, password);
	String str=driver.getTitle();
	Assert.assertEquals(str, Constants.title1);
}

@Test(priority=2)
public void check()
{
	assign.enableCheck();
	
}
@Test(dataProvider="assignData",priority=2)
public void assignFunction(String emp,String comment)
{
	assign.assignLeave(emp, comment);
}
@DataProvider()

public Object[][] assignData() throws InvalidFormatException, IOException{

	Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath3, "AssignPage");

	return data;
}

}
