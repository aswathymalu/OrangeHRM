package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;

public class LeavePageTest extends BasePageTest {
@Test
public void leaveactonTest()
{
loginpage.loginAction(username, password);
String n=driver.getTitle();
AssertJUnit.assertEquals(n, Constants.title1);
	leave.leavepageAction();
}

}
