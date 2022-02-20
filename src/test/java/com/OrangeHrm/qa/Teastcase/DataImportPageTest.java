package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;

import org.testng.Assert;

import com.Orange.qa.Constants.Constants;



public class DataImportPageTest extends BasePageTest{
@Test(priority=1)
public void setup()
{
	loginpage.loginAction(username, password);
	String s=driver.getTitle();
Assert.assertEquals(s,Constants.title1);
}
@Test(priority=2)
public void dataImportAction()
{
	
	data.csvData();
	String str=driver.getCurrentUrl();
	System.out.println(str);
	data.upload();
	Assert.assertEquals(str,Constants.dataimporturl);
	
}
}
