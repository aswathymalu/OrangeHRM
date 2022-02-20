package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;

public class AssignLeavePage {
WebDriver driver;
public ElementUtil util;
public AssignLeavePage (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	util=new ElementUtil(driver);
}
@FindBy(id="assignleave_txtEmployee_empName")
WebElement empl;

@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")
WebElement assign;
@FindBy(id="assignleave_txtLeaveType")
WebElement leavetype;;
@FindBy(id="assignleave_txtFromDate")
WebElement frdate;
@FindBy(id="assignleave_txtToDate")
WebElement todate ;
@FindBy (xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")
WebElement date;
@FindBy(id="assignleave_txtComment")
WebElement comment;
@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
WebElement mnth;
@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
WebElement yr;
@FindBy(id="assignleave_partialDays")
WebElement partial;
@FindBy(id="assignleave_duration_duration")
WebElement duration;
@FindBy(id="assignBtn")
WebElement submit;
public void enableCheck()
{
	util.enableCheck(empl);
util.enableCheck(leavetype);
util.enableCheck(assign);
util.enableCheck(comment);
util.enableCheck(date);
util.enableCheck(mnth);
util.enableCheck(yr);
util.enableCheck(submit);
	
}
public void assignLeave(String employname,String cmnt)
{
	util.clickmethod(assign);
	util.sendkeysmethod(empl, employname);
	util.selectDropdown(leavetype, "index", "2");
	util.clickmethod(frdate);
util.selectDropdown(mnth, "visibletext", "May");
	util.selectDropdown(yr, "visibletext", "2020");
	util.clickmethod(date);
	util.clickmethod(todate);
	util.selectDropdown(mnth, "visibletext", "Jan");
	util.selectDropdown(yr, "visibletext","2022" );
	util.clickmethod(date);
	util.selectDropdown(partial, "index", "2");
	util.sendkeysmethod(comment,cmnt);
	util.clickmethod(submit);
	
	
	
}


}
