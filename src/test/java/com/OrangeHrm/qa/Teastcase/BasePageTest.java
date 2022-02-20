package com.OrangeHrm.qa.Teastcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.Orange.qa.Constants.Constants;
import com.Orangehrm.qa.Pages.AddUser;
import com.Orangehrm.qa.Pages.AdminPage;
import com.Orangehrm.qa.Pages.AssignLeavePage;
import com.Orangehrm.qa.Pages.DashboardPage;
import com.Orangehrm.qa.Pages.DataImportPage;
import com.Orangehrm.qa.Pages.LeavePage;
import com.Orangehrm.qa.Pages.LoginPage;
import com.Orangehrm.qa.Pages.MyInfoPage;
import com.Orangehrm.qa.Pages.PimAddPage;
import com.Orangehrm.qa.Pages.PimPage;
import com.Orangehrm.qa.Utilities.ElementUtil;
import com.Orangehrm.qa.Utilities.WaitUtil;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class BasePageTest {
	WebDriver driver;
	public LoginPage loginpage;
	public AdminPage admin;
	public AddUser add;
	public DashboardPage dashboard;
	public LeavePage leave;
	public PimPage pim;
	public PimAddPage pimadd;
	public DataImportPage data;
	public AssignLeavePage assign;
	public MyInfoPage myinfo;
	public WaitUtil wait;
	ElementUtil util=new ElementUtil();

	public String url=util.getBaseUrlmethod();
public String username=util.getUsername();
public String password=util.getPassword();
public String str1=util.userFieldadd();
public String str2=util.employeefield();
@Parameters({"browser"})
@BeforeClass(alwaysRun = true)

  public void beforeClass(String browsername) {
	  String path=System.getProperty("user.dir");
	  if(browsername.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver",path+ElementUtil.getPropertyValue("chromepath"));
	  driver=new ChromeDriver();
	  }
	  else if(browsername.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver",path+ElementUtil.getPropertyValue("firefoxpath"));
		  FirefoxOptions ff=new FirefoxOptions();
		  ff.setAcceptInsecureCerts(true);
		  driver=new FirefoxDriver(ff);
	  }
	  else if(browsername.equals("edge"))
	  {

		  
		  System.setProperty("webdriver.edge.driver",path+ElementUtil.getPropertyValue("edgepath"));
		  driver=new EdgeDriver();
		  
	  }
	  driver.get(url);
	  driver.manage().window().maximize();
	  loginpage=new LoginPage(driver);
	  admin=new AdminPage(driver);
	  add=new AddUser(driver);
	  dashboard=new DashboardPage(driver);
	  leave=new LeavePage(driver);
	  pim=new PimPage(driver);
	  pimadd=new PimAddPage(driver);
	  data=new DataImportPage(driver);
	  assign=new AssignLeavePage(driver);
	  myinfo=new MyInfoPage(driver);
	  wait=new WaitUtil(driver);
	 wait.implicitwait(10);
	  
  }
@AfterMethod
public void takeScreenShotOnFailure(ITestResult iTestResult) throws IOException {
	if (iTestResult.getStatus() == iTestResult.FAILURE) {
		takeScreenShotOnFailure(iTestResult.getName());

	}
}

public String takeScreenShotOnFailure(String name) throws IOException {
	String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());


	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	String destination =Constants.screenshot_path + name + dateName + ".png";

	File finalDestination = new File(destination);

	FileUtils.copyFile(source, finalDestination);
	return destination;
}


  @Test
  public void f()
  {
	  
  }
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
