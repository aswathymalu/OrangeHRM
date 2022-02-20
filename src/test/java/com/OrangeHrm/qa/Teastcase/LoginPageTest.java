package com.OrangeHrm.qa.Teastcase;

import org.testng.Assert;
import org.testng.annotations.Test;



import com.Orange.qa.Constants.Constants;

public class LoginPageTest extends BasePageTest{

	@Test
    public void f()
	{
		loginpage.loginAction(username,password);
		String title=driver.getTitle();
		Assert.assertEquals(title,Constants.title1);
	}
}
