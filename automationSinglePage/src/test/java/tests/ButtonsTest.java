package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonPage;

public class ButtonsTest extends BaseLibrary {
	ButtonPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new ButtonPage();
	}
	
	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority=2)
	public void clickButton()
	{
		ob.clickOnButtons();
}
	@Test(priority=3)
	public void Doubleclick()
	{
		ob.DoubleClick();
}
	@Test(priority=4)
	public void Rightclick()
	{
		ob.clickRightClick();
}
	
	@Test(priority=5)
	public void clickmeSingle()
	{
		ob.clickSingleClick();
	}
}