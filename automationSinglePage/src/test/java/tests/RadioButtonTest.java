package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baseLibrary.BaseLibrary;
import pages.RadioButtons;

public class RadioButtonTest extends BaseLibrary {
	RadioButtons ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new RadioButtons();
	}
	

	@Test(priority=3)
	public void clickOnElement()
	{
		ob.clickonElement();
}
	
	@Test(priority=4)
	public void clickRadio()
	{
		ob.clickOnRadio();
}	
	
	@Test(priority=5)
	public void YesButton()
	{
		ob.ClickYes();
	}
	
}
