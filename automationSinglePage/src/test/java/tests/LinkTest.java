package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;

import pages.LinksPages;

public class LinkTest extends BaseLibrary{
	LinksPages ob;
	
	@BeforeTest
	@Parameters ("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new LinksPages();
	}
	

	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority=2)
	public void clickOnLink()
	{
		ob.ClickOnLinks();
	}
	
	@Test(priority=3)
	public void ClickDemoPage()
	{
		ob.ClickOnDemo();
	}
	
	@Test(priority=4)
	public void api()
	{
		ob.API();
	}
	}

