package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;
import com.Orangehrm.qa.Utilities.WaitUtil;

public class AddUser {
WebDriver driver;
WaitUtil wait;
ElementUtil util;
public AddUser(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	util=new ElementUtil();
}
@FindBy(id="systemUser_employeeName_empName")
WebElement employeename;
@FindBy(id="systemUser_userName")
WebElement usernameadd;
@FindBy(id="systemUser_password")
WebElement passwordadd;
@FindBy(id="systemUser_confirmPassword")
WebElement confirmadd;
@FindBy(id="btnAdd")
WebElement adduser;
@FindBy(id="systemUser_userType")
WebElement role;
@FindBy(id="systemUser_status")
WebElement status;
@FindBy(id="btnSave")
WebElement save;
@FindBy(id="menu_admin_viewAdminModule")
WebElement admin;


public void adduserdata(String em,String user,String pass,String cnfrm)
{
	util.clickmethod(admin);
	util.clickmethod(adduser);
	util.clickmethod(role);
	util.selectDropdown(role,"visibletext","Admin");
	util.sendkeysmethod(employeename,em);
	util.sendkeysmethod(usernameadd, user);
	util.clickmethod(status);
	util.selectDropdown(status,"visibletext","Enabled");
	util.sendkeysmethod(passwordadd, pass);
	util.sendkeysmethod(confirmadd, cnfrm);
	util.clickmethod(save);
	
	String t=driver.getCurrentUrl();
	System.out.println(t);
	
}
}
