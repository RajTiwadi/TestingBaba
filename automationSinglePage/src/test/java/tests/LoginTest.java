package tests;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baseLibrary.BaseLibrary;
import pages.loginPage;

public class LoginTest extends BaseLibrary {
	loginPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchURL(String browser)
	{
		launchUrl(browser);
		ob = new loginPage();
	}
	

	@Test
	public void  getTitle()

	{
		ob.getTitle();
	}
	
	@Test
	public void getUrl()
	{
		ob.getUrl();
	}
	
	
	}
