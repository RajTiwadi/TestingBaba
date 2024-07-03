package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class RadioButtons extends BaseLibrary {
public RadioButtons(){ 
	PageFactory.initElements(driver, this);
	
}


@FindBy (xpath="//button[@data-target='#elements']")
private WebElement element;

@FindBy (xpath="//a [@href='#tab_3']")
public WebElement radioButton;


@FindBy (xpath="//input[@id='yes']")
public WebElement Yesbutton;

@FindBy (xpath="//input[@id='impressive']")
public WebElement impressive;

@FindBy (xpath="//input[@id='no']")
public WebElement no;

@FindBy (xpath="//p[@id='radio-content']")
public WebElement TextYesNoImpressive;


public void clickonElement()
{
	element.click();
}
 public void clickOnRadio()
 {
	 radioButton.click();
 }
public void ClickYes()
{
	SoftAssert asser=new SoftAssert();
 Yesbutton.click();
 String actual=TextYesNoImpressive.getText();
 String expected=getReadData("yes");
		 asser.assertEquals(actual,expected);
 asser.assertAll();
 System.out.println("validation Sucessful done for yes");
}
}
