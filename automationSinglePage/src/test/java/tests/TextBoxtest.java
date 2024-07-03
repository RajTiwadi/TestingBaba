package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import baseLibrary.BaseLibrary;
import pages.TextBoxPage;

public class TextBoxtest extends BaseLibrary{

	TextBoxPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchuRL(String browser)
	{
		launchUrl(browser);
		ob=new TextBoxPage();
	}
	

	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority=2)
	public void clickOntext()
	{
		ob.clickonText();
	}
		
	@Test(priority=3)
	public void fillDetails()
	{
		ob.filldetails();
	}
		@Test(priority=4)
		public void getValidate() {
			ob.getValidate();
		}
		
}
