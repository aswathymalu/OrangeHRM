package com.Orangehrm.qa.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Utilities.ElementUtil;
import com.Orangehrm.qa.Utilities.WaitUtil;

public class AdminPage {
WebDriver driver;
WaitUtil wait;
public ElementUtil util;
@FindBy(id="menu_admin_viewAdminModule")
WebElement admin;
@FindBy(id="searchSystemUser_userName")
WebElement userfield;
@FindBy(id="searchBtn")
WebElement search;
@FindBy(id="resetBtn")
WebElement reset;
@FindBy(id="btnAdd")
WebElement adduser;
@FindBy(id="btnDelete")
WebElement delete;
@FindBy(id="searchSystemUser_userName")
WebElement usernameField;
@FindBy(id="searchSystemUser_employeeName_empName")
WebElement employee;
@FindBy(id="searchSystemUser_userType")
WebElement userrole;
@FindBy(id="searchSystemUser_status")
WebElement userstatus;
@FindBy(id="ohrmList_chkSelectAll")
WebElement check;
@FindBy(xpath="//*[@id=\"systemUser-information\"]/a")
WebElement toggle;
@FindBy(id="dialogDeleteBtn")
WebElement ok;
public void adminaction()
{
	util.clickmethod(admin);
	
	util.enableCheck(admin);
	util.enableCheck(search);
	util.enableCheck(reset);
	util.enableCheck(adduser);
	util.enableCheck(delete);
	
	
}
public void addClick()
{
util.clickmethod(adduser);


}
public void toggleclick()
{
	util.clickmethod(toggle);
}
public void searchFunctionuser(String s)
{
	
	util.sendkeysmethod(userfield,s);
	util.clickmethod(search);
	
	
}
public void searchfunctionemployee(String k)
{
	util.sendkeysmethod(employee, k);
	util.clickmethod(search);
}





public void userrolesel()
{
	util.selectDropdown(userrole,"index","1");
	util.clickmethod(userrole);
	util.selectDropdown(userstatus, "index","1");
	util.clickmethod(userstatus);
}


/*public void delete()
{

util.clickmethod(check);
util.clickmethod(delete);
util.clickmethod(ok);
//Alert alert=driver.switchTo().alert();
//alert.accept();
}*/
public void checkurlaction()
{
	
}

public AdminPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	util=new ElementUtil();
}
}
