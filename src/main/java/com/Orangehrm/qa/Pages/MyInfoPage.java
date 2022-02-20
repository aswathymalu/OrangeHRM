package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;

public class MyInfoPage {
WebDriver driver;
ElementUtil util;
public MyInfoPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	util=new ElementUtil(driver);
}
@FindBy(id="menu_pim_viewMyDetails")
WebElement info;
@FindBy(id="btnSave")
WebElement edit;

public void myinfopage()
{
	util.clickmethod(info);
}
public void personalDetails()
{
	util.clickmethod(edit);
}
}
