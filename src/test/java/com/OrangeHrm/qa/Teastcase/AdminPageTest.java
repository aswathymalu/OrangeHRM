package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;



public class AdminPageTest extends BasePageTest{
	
	@Test(priority=1,groups={"sanity"})
	public void adminp()
{
	loginpage.loginAction(Constants.username,Constants.password);
	String login=driver.getTitle();
	
	AssertJUnit.assertEquals(login, Constants.title1);

	admin.adminaction();
	
	admin.addClick();
	String crnturl=driver.getCurrentUrl();
	AssertJUnit.assertEquals(crnturl,Constants.addurl);
	
	admin.adminaction();
	admin.toggleclick();
	admin.toggleclick();
	admin.searchFunctionuser(str1);
	admin.userrolesel();
	admin.searchfunctionemployee(str2);
	admin.searchFunctionuser(str1);

	//admin.delete();
	
	
}
	
}
