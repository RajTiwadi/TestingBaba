package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.Frames;

public class FrameTest extends BaseLibrary {
	Frames ob;
	
	@BeforeTest
	@Parameters ("browser")
	 public void LaunchUrl(String browser)
	 {
		launchUrl(browser);
		ob=new Frames();
	 }

	
	@Test(priority=1)
	public void clickOnAlert()
	{
		ob.ClickWindow();
	}
	
	@Test(priority=2)
	public void FrameWindow()
	{
		ob.ClickFrames();
	}
	
	@Test(priority=3)
	public void getValidateTexts()
	{
		ob.GetvalidateFirstFrame();
	}
	
	@Test(priority=4)
	public void getValidatechild()
	{
		ob.GetValidateChildFrame();
	}
}
