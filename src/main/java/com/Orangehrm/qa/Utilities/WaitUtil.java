package com.Orangehrm.qa.Utilities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WaitUtil {
WebDriver driver;
WebDriverWait  wait;
public WaitUtil(WebDriver driver)
{
	this.driver=driver;
	
}
public void implicitwait(int a)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
}
public void waitForPageTitle(String title){
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains(title));
}

public void waitForElementClick(WebElement e)
{
	new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(e));
}
public void waitForElementvisibility(WebElement el)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By)el));
}
}
