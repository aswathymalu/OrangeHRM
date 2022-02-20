package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;

public class PimAddPage {
WebDriver driver;
public ElementUtil util;
public PimAddPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	util=new ElementUtil(driver);
}
@FindBy(id="customField_name")
WebElement field;
@FindBy(id="customField_screen")
WebElement screen;
@FindBy(id="customField_type")
WebElement type;
@FindBy(id="btnSave")
WebElement save;
@FindBy(id="customField_extra_data")
WebElement custom;


public void addActions(String name,String v)
{
util.sendkeysmethod(field,name);
util.selectDropdown(screen, "index", "3");
util.selectDropdown(type, "visibletext", "Drop Down");
util.sendkeysmethod(custom, v);
util.clickmethod(save);
}

}
