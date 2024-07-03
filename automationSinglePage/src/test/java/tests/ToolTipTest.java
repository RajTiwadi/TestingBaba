package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ToolTipsPage;

public class ToolTipTest extends BaseLibrary{
 ToolTipsPage ob;
 
 @BeforeTest
 @Parameters("browser")
 public void launchurl(String browser)
 {
 launchUrl(browser);
 ob=new ToolTipsPage();
 }
 
 @Test(priority=1)
 public void clickWidget()
 {
 ob.widget();
 }
 
 @Test(priority=2)
 public void clickOnToolTip()
 {
 ob.tooltip();
}
 @Test(priority=3)
 public void getAttribute()
 {
 ob.getattribute();
}
}