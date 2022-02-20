package com.Orangehrm.qa.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Orangehrm.qa.Utilities.ElementUtil;

public class LeavePage {
WebDriver driver;
public ElementUtil util;
@FindBy(id="menu_leave_viewLeaveModule")
WebElement leave;
@FindBy(id="menu_leave_assignLeave")
WebElement assign;
public LeavePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	util=new ElementUtil(driver);
}
public void leavepageAction()
{
util.clickmethod(leave);
	util.mousehover(assign);

	
}
}
