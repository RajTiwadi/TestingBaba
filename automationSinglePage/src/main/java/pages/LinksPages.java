package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class LinksPages extends BaseLibrary {
public LinksPages()
{
	PageFactory.initElements(driver,this);
}


@FindBy (xpath="//button[@data-target='#elements']")
private WebElement element;

@FindBy(xpath="//a[@href='#tab_6']")
private WebElement Links;

@FindBy(xpath="//a[text()='Demo Page']")
private WebElement Demo;

@FindBy(xpath="//a[text()='Created']")
private WebElement APIcreated;

@FindBy(xpath="//a[text()='No Content']")
private WebElement ApiNoContent;

@FindBy(xpath="//a[text()='Moved']")
private WebElement ApiMoved;

@FindBy(xpath="//a[text()='Bad Request']")
private WebElement BadRequest;

@FindBy(xpath="//a[text()='Unauthorized']")
private WebElement Unauthorized;

@FindBy(xpath="//a[text()='Forbidden']")
private WebElement Forbidden;

@FindBy(xpath="//a[text()='Not Found']")
private WebElement NotFound;

@FindBy(xpath="//p[@id='link-result']")
private WebElement APITEXT;


public void clickonElement()
{
	element.click();
}
public void ClickOnLinks()
{
	Links.click();
	
}

public void ClickOnDemo()
{
	 Demo.click();
	switchtowindow(1);
	driver.close();
	switchtowindow(0);
}
public void API()
{
	SoftAssert asser=new SoftAssert();
	APIcreated.click();
	String actual=APITEXT.getText();
	String expected=getReadData("Created");
	asser.assertEquals(actual, expected);
	asser.assertAll();
	System.out.println("validation done for Created ");
	ApiNoContent.click();
	ApiMoved.click();
	BadRequest.click();
	Unauthorized.click();
	Forbidden.click();
	NotFound.click();
}

}