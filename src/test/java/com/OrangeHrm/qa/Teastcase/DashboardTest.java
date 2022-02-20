package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;

import org.testng.Assert;


import com.Orange.qa.Constants.Constants;

public class DashboardTest extends BasePageTest {
	@Test(priority=1)
public void loginsetup()
{
	loginpage.loginAction(Constants.username,Constants.password);
	String s=driver.getTitle();
	
	Assert.assertEquals(s,Constants.title1);
}
	@Test(priority=2)
	public void  dashboardaction()
	{
dashboard.mouseHoverDashboard();
dashboard.logout();

}
}