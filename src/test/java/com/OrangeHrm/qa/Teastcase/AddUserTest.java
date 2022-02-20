package com.OrangeHrm.qa.Teastcase;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Utilities.ExcelRead;

public class AddUserTest extends BasePageTest{

	
	@Test(priority=1)
	public void datasetup()
	{
		loginpage.loginAction(Constants.username,Constants.password);
		String login=driver.getTitle();
		
		Assert.assertEquals(login, Constants.title1);

		
	}
	 @Test(dataProvider="userData",priority=2)
	
		public void adduserTest(String em,String user,String pass,String cnfrm)
		{
		 
		add.adduserdata(em,user,pass,cnfrm);
		
		String crnturl=driver.getCurrentUrl();
		System.out.println(crnturl);
		//Assert.assertEquals(crnturl,saveurl);
	
		
				
				
	}
	@DataProvider()

	public Object[][] userData() throws InvalidFormatException, IOException{

		Object[][] data=ExcelRead.getDataFromExcel(Constants.dataprovider_filepath, "AddUserData");

		return data;
	}

}
