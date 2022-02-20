package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;

public class PimPageTest extends BasePageTest{
	@Test(priority=1)
	public void setuplogin()
	{
		loginpage.loginAction(username, password);
String s=driver.getTitle();
AssertJUnit.assertEquals(s,Constants.title1);
	}
	@Test(priority=2)
public void pimAction()
{
		pim.pim();
}
}
