package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.SelectMenuPage;

public class SelectMenuTest extends BaseLibrary {
	SelectMenuPage ob;
	@BeforeTest
	@Parameters ("browser")
	public void urlLaunch(String browser)
	{
		launchUrl(browser);
		ob=new SelectMenuPage();
	}
	
	@Test(priority=1)
	public void clickWidget()
	{
	ob.SelectWidget();
	}
	
	@Test(priority=2)
	public void Menu()
	{
	ob.SelectMenu();
	}
	
	@Test(priority=3)
	public void menuPage()
	{
		ob.MenuPage();
	}
	
	@Test(priority=4)
	public void selectTiTle()
	{
		ob.selectTitle();
	}
	
	@Test(priority=5)
	public void OldPaGe()
	{
		ob.OldPage();
	}
	
	@Test(priority=6)
	public void mulTISelect()
	{
		ob.MultiselecT();
	}
}
