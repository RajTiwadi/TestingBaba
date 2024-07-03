package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.NestedFrames;

public class NestedTest extends BaseLibrary {
	NestedFrames ob;
	
	@BeforeTest
	@Parameters ("browser")
	public void LaunchUrl(String browser)
	{
		launchUrl(browser);
  ob=new NestedFrames();
	}
	
	@Test(priority=1)
	public void clickOnAlert()
	{
		ob.Windows();
	}
	
	@Test(priority=2)
	public void ClickNested()
	{
		ob.Nested();
	}
	
	@Test(priority=3)
	public void ClickChild()
	{
		ob.ClickFunction();
	}
	
}
