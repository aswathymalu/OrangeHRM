package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;

public class DashboardPage {

	WebDriver driver;
	ElementUtil util;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil(driver);
		
	}
	@FindBy(id="menu_dashboard_index")
	WebElement dash;
	@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/img")
	WebElement assign;
	@FindBy(id="//span[text()='Leave List']")
	WebElement leave;
	@FindBy(xpath="//span[text()='Timesheets']")
	WebElement timesheets;
	@FindBy(xpath="//span[text()='Apply Leave']")
	WebElement applyleave ;
	@FindBy(xpath="//span[text()='My Leave']")
	WebElement  myleave;
	@FindBy(xpath="//span[text()='My Timesheet']")
	WebElement  mytimesheet;
	@FindBy(id="welcome")
	WebElement wel;
	@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	WebElement logout;
	public void mouseHoverDashboard()
	{
		util.clickmethod(dash);
		util.mousehover(assign);
		util.mousehover(leave);
		util.mousehover(timesheets);
		util.mousehover(applyleave);
		util.mousehover(myleave);
		util.mousehover(mytimesheet);
		util.clickmethod(wel);
	    util.mousehover(logout);
		util.clickmethod(logout);
	
		
	}
	public void logout()
	{
		util.clickmethod(wel);
	    util.mousehover(logout);
		util.clickmethod(logout);
	}
	
	
}
