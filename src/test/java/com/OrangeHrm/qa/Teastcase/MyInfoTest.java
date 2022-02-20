package com.OrangeHrm.qa.Teastcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;

public class MyInfoTest extends BasePageTest{
	@Test(priority=1)
	public void myinfoLogin()
	{
		loginpage.loginAction(username, password);
		String str=driver.getTitle();
		Assert.assertEquals(str, Constants.title1);
	}
@Test(priority=2)
public void myinfoActions()
{
	myinfo.myinfopage();
	myinfo.personalDetails();
}
//@Test()
}
