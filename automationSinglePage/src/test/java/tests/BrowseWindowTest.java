package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowserWindow;

public class BrowseWindowTest extends BaseLibrary {
	BrowserWindow ob;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser)
	{
		launchUrl(browser);
	ob=new BrowserWindow();
	}
	 @Test(priority=1)
	 public void Windows()
	 {
		 ob.windowsButton();
	 }
	 @Test(priority=2)
	 public void WindowsBrowser()
	 {
		 ob.browserButton();
	 }
	 
	 @Test(priority=3)
	 public void newTabWindows()
	 {
		 ob.Newtab();
		 
	 }
	 
	 @Test(priority=4)
	 public void NewWindowPage()
	 {
		 ob.NewWindow();
	 }
	 
	 @Test(priority=5)
		 public void windowMsg()
		 {
			 ob.WindowMassage();
		 }
	 }
	 
	
