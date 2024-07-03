package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class Frames extends BaseLibrary {
public Frames()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[@data-target='#alerts']")
private WebElement Windows;

@FindBy(xpath="//a[@href='#tab_13']")
private WebElement Frames;

@FindBy(xpath="//iframe [@style='height:200px;width:400px']")
private WebElement Parentframe;


@FindBy(xpath="//iframe [@style='height:80px;width:120px']")
private WebElement ChildFrame;

@FindBy(xpath="//h1[text()='This is a sample page'][1]")
private WebElement ParentFrameText;

@FindBy(xpath="//iframe[@title='Iframe Example'][2]")
private WebElement ChildText;

public void ClickWindow() {
	waitforClick(Windows);
}

public void ClickFrames() {
	waitforClick(Frames);
}

public void GetvalidateFirstFrame()
{
	SoftAssert asser=new SoftAssert();
	driver.switchTo().frame(Parentframe);
	String actual=ParentFrameText.getText();
	String expected=getReadData("ParentFrames");
	asser.assertEquals(actual,expected);
	 asser.assertAll();
	 System.out.println("Validation Successful for Parent Frame");
	 driver.switchTo().defaultContent(); 
}
public void GetValidateChildFrame()
{
driver.switchTo().frame(ChildFrame);
SoftAssert asser=new SoftAssert();
String actual=ChildText.getText();
String expected=getReadData("ChildFrames");
asser.assertEquals(actual,expected);
 asser.assertAll();
 System.out.println("Validation Successful for child Frame");
 driver.switchTo().defaultContent();
}
}
