package com.Orangehrm.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Utilities.ElementUtil;
import com.Orangehrm.qa.Utilities.WaitUtil;

public class DataImportPage {
WebDriver driver;
public ElementUtil util;
public WaitUtil wait;
public DataImportPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	util=new ElementUtil(driver);
	wait=new WaitUtil(driver);
}
@FindBy(id="menu_pim_Configuration")
WebElement cofig;
@FindBy(id="menu_admin_pimCsvImport")
WebElement data;
@FindBy(id="menu_pim_viewPimModule")
WebElement pim;
@FindBy(id="pimCsvImport_csvFile")
WebElement choose;
@FindBy(xpath="//a[text()='Download']")
WebElement dwnld;
@FindBy(id="btnSave")
WebElement upload;
public void csvData()
{
	util.clickmethod(pim);
	util.clickmethod(cofig);
	util.mousehover(data);
}
public void upload()
{
	
	util.clickmethod(data);
	wait.implicitwait(10);
	util.sendkeysmethod(choose,Constants.choosefile_filepath1);
	util.clickmethod(upload);
}
}
