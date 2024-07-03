package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.WebTablePage;

public class WebTablesTest extends BaseLibrary {

	WebTablePage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new WebTablePage();
	}
	
	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority=2)
	public void clickWebtables()
	{
		ob.clickonWebTables();
	}
	
	@Test(priority=3)
	public void fillDetails()
	{
		ob.Table();
	}
	@Test(priority=4)
		public void tableUpdate()
	{
	ob.UpdateTable();
}
}
