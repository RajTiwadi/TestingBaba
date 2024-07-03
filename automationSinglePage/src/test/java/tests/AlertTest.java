package tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AlertPage;


public class AlertTest extends BaseLibrary {
	AlertPage ob;
	@BeforeTest
	@Parameters("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new AlertPage();
	}
	
	
	@Test(priority=1)
	public void clickOnAlert()
	{
		ob.alertPage();
	}
	
	@Test(priority=2)
	public void AlertButton()
	{
		ob.alertButton();
	}
	@Test(priority=3)
	public void ClickOnme()
	{
		ob.Clickme();
		driver.switchTo().alert().accept();
}
	
	@Test(priority=4)
	public void Clicknextbutton()
	{
		ob.AlertInSec();
		waitforalert();
		driver.switchTo().alert().accept();
}
	
	@Test(priority=5)
	public void ConfirmBox()
	{
		ob.ConfirmationButton();
		driver.switchTo().alert().dismiss();
}
	@Test(priority=6)
	public void PromptMsg()
	{
ob.promptBoxAlert();
driver.switchTo().alert().sendKeys("Rajesh");
		driver.switchTo().alert().accept();
}
	
}