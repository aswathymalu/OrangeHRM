package com.Orange.qa.Constants;

public class Constants {

public static final String username="Admin";
public static final String password="admin123";
public static  final String configpath=System.getProperty("user.dir")+"\\Configuration\\Config.Properties";
public static final String title1="OrangeHRM";
public static final String addurl="https://opensource-demo.orangehrmlive.com/index.php/admin/saveSystemUser";
public static final String saveurl="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
public static final String screenshot_path=System.getProperty("user.dir")+"//PomOrangeHrmProject//Screenshot";
public static final String testdata="//src//test//resources//Excel_read//Testdata.xlsx";
public static final String pimdata="//src//test//resources//Excel_read//pim.xlsx";
public static final String dataprovider_filepath=System.getProperty("user.dir")+testdata;
public static final String dataprovider_filepath2=System.getProperty("user.dir")+pimdata;
public static final String choosefile="/src/test/resources/Excel_read/importData (3).csv";
public static final String choosefile_filepath1=System.getProperty("user.dir")+choosefile;
public static final String dataimporturl="https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList#";
public static final String assigndata="/src/test/resources/Excel_read/AssignData.xlsx";
public static final String dataprovider_filepath3=System.getProperty("user.dir")+assigndata;
public static final String pimurladd="https://opensource-demo.orangehrmlive.com/index.php/pim/listCustomFields";
}