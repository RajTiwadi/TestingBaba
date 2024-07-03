package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baseLibrary.BaseLibrary;
import pages.CheckBoxPage;

public class CheckBoxtest extends BaseLibrary {
	CheckBoxPage ob;
	
	@BeforeTest
	@Parameters ("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new CheckBoxPage();
	}
	
	
	@Test(priority=3)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority=4)
	public void clickcheckBox()
	{
		ob.clickOnCheckBox();
	}
	
	@Test(priority=5)
	public void clickMobile()
	{
		ob.ClickOnMobile();
	}

	@Test(priority=6)
	public void clickonLaptop()
	{
		ob.ClickLaptop();
	}

	@Test(priority=7)
	public void clickonDeskTop()
	{
		ob.ClickDesktop();
	}
}
