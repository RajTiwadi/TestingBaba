package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class BrowserWindow extends BaseLibrary {
	public BrowserWindow() 
	{
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@data-target='#alerts']")
	private WebElement Windows;
	
	@FindBy(xpath="//a[@href='#tab_11']")
	private WebElement BrowserWindows;

	@FindBy (xpath="//a[@href='https://www.google.co.in/']")
private WebElement newTab;
	
	@FindBy (xpath="//a[@onclick='win1open()']")
	private WebElement newWindow;
	
	@FindBy (xpath="//a[@onclick='win2open()']")
	private WebElement WindowMsg;
	
	public void windowsButton() {
	waitforClick(Windows);
	}
	
	public void browserButton() {
		waitforClick(BrowserWindows);
		}
	
	public void Newtab() {
		waitforClick(newTab);
		switchtowindow(1);
		driver.close();
		switchtowindow(0);
	}
	public void NewWindow()
	{
		waitforClick(newWindow);
		switchtowindow(1);
		driver.close();
		switchtowindow(0);
	}
	
	public void WindowMassage() 
	{
		waitforClick(WindowMsg);
		switchtowindow(1);
		driver.close();
		switchtowindow(0);
	}
	}
