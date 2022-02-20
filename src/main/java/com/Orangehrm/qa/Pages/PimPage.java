package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;

public class PimPage{
	WebDriver driver;
	ElementUtil util;
	public  PimPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		util=new ElementUtil(driver);
	}
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pim;
	@FindBy(id="menu_pim_Configuration")
	WebElement config;
	@FindBy(id="menu_pim_listCustomFields")
	WebElement custom;
	@FindBy(id="buttonAdd")
	WebElement add;
	public void  pim()
	{
		util.clickmethod(pim);
		util.clickmethod(config);
		util.mousehover(custom);
		util.clickmethod(custom);
		util.clickmethod(add);
	}
	
}
