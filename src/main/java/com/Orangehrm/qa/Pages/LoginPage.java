package com.Orangehrm.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orangehrm.qa.Utilities.ElementUtil;


public class LoginPage {
WebDriver driver;
public ElementUtil util;
@FindBy(id="txtUsername")
WebElement username;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement login;
@FindBy(id="divLogo")
WebElement logo;

public void loginAction(String a,String b)
{
	util.sendkeysmethod(username,a);
	util.sendkeysmethod(password,b);
	util.clickmethod(login);
}
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		util=new ElementUtil();
	}

}
