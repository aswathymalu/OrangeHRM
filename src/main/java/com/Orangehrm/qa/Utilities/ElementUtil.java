package com.Orangehrm.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Orange.qa.Constants.Constants;

public class ElementUtil {
	WebDriver driver;
	static Properties pro=new Properties();

public ElementUtil()
{
	File src=new File(Constants.configpath);
			try
	{
				FileInputStream fis=new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
	}catch(Exception e)
	{
		
		System.out.println("Exception is"+e.getMessage());
	}
}
public ElementUtil(WebDriver driver)
{
	this.driver=driver;
}
public String getUsername()
{
	String user=pro.getProperty("username");
	return user;
	
}
public String getPassword()
{
	String pass=pro.getProperty("password");
	return pass;
}
public String getBaseUrlmethod()
{
	String url=pro.getProperty("baseUrl");
	return url;
}
public void clickmethod(WebElement e)
{
	e.click();
}


public static String getPropertyValue(String key)
{

	String propertyFile=System.getProperty("user.dir")+"/Configuration/config.properties";
	FileInputStream fis=null;
	try {
		fis = new FileInputStream (propertyFile);
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
	try {
		pro.load(fis);
	} catch (IOException e) {

		e.printStackTrace();
	}
	String value=pro.get(key).toString();
	return value;

}
public void sendkeysmethod(WebElement s,String value)
{
	s.clear();
	s.sendKeys(value);
}
public  boolean enableCheck(WebElement t)
{
	boolean s=t.isEnabled();
	System.out.println(s);
	return s;

}
public boolean displaycheck(WebElement d)

{
	boolean b=d.isDisplayed();
	System.out.println(b);
	return b;
	
}
public String userFieldadd()
{
	String str=pro.getProperty("user");
	return str;
}
public String employeefield()
{
	String str2=pro.getProperty("employee");
	return str2;
}


public void selectDropdown(WebElement e,String t,String value)
{
	Select sel=new Select(e);
	switch(t)
	{
		case "index":sel.selectByIndex(Integer.parseInt(value));
		              break;
		              
		case "visibletext":sel.selectByVisibleText(value);
                            break;
                            
		case "byvalue":sel.selectByValue(value); 
		break;
	}
}
public void mousehover(WebElement h)
{
	Actions act=new Actions(driver);

	act.moveToElement(h).build().perform();
	
	
}

}


