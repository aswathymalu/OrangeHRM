package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;


import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Utilities.ExcelRead;

public class PimAddPageTest extends BasePageTest{
@Test(priority=1)
public void setupadd()
{
	loginpage.loginAction(username, password);
	String s=driver.getTitle();
	Assert.assertEquals(s, Constants.title1);
	pim.pim();
}
@Test(dataProvider="Pimdata",priority=2)
public void pimadd(String name,String str)
{
	pimadd.addActions(name,str);
	String pimurl=driver.getCurrentUrl();
	System.out.println(pimurl);
	Assert.assertEquals(pimurl, Constants.pimurladd);
	
}

@DataProvider()

public Object[][] Pimdata() throws InvalidFormatException, IOException{

	Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath2, "AddPim");

	return data;
}

}
