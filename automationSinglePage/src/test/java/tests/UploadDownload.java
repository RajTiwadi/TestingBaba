package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.UploadAndDownload;

public class UploadDownload extends BaseLibrary{
	UploadAndDownload ob;
	@BeforeTest
	@Parameters ("browser")
	public void launchurL(String browser)
	{
		launchUrl(browser);
		ob=new UploadAndDownload();
	}
	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickonElement();
	}
	
	@Test(priority = 2)
	public void ClickOnUpload()
	{
ob.ClickUpload();	
}
	@Test(priority = 3)
	public void chooseFile()
	{
		ob.ChooseFile();
	}
}