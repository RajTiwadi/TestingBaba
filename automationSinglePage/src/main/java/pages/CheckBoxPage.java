package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class CheckBoxPage extends BaseLibrary {
	public  CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy (xpath="//a[text()='check box']")
	private WebElement CheckBox;
	
	@FindBy (xpath="//input[@id='myCheck']")
	private WebElement ClickMobile;
	
	@FindBy (xpath="//input[@id='mylaptop']")
	private WebElement Laptop;
	
	@ FindBy (xpath="//input[@id='mydesktop']")
	private WebElement Desktop;
	@FindBy (xpath="//iframe[@src='Checkbox.html']")
	private WebElement frame;
	@FindBy (xpath="//h6[@id='text']")
	private WebElement Mobiletext;
	
	@FindBy (xpath="//h6[@id='text1']")
	private WebElement Laptoptext;
	
@FindBy (xpath="//h6[@id='text2']")
private WebElement Desktoptext;
	


public void clickonElement()
{
	element.click();
}
	public void clickOnCheckBox()
	{
		CheckBox.click();
	}
public void ClickOnMobile()
{
	driver.switchTo().frame(frame);
	ClickMobile.click();
	String actual=Mobiletext.getText();
	String expected=getReadData("Mobile");
	Assert.assertEquals(actual,expected);
	driver.switchTo().defaultContent();
	System.out.println("validation Sucessful done for Mobile");
}
public void ClickLaptop() {
	SoftAssert asse=new SoftAssert();
driver.switchTo().frame(frame);
Laptop.click();
String actual=Laptoptext.getText();
String expected=getReadData("Laptop");
asse.assertEquals(actual,expected);
asse.assertAll();
System.out.println("validation Sucessful done for Laptop");
driver.switchTo().defaultContent();
}


public void ClickDesktop() {
	SoftAssert asse=new SoftAssert();
driver.switchTo().frame(frame);
Desktop.click();
String actual=Desktoptext.getText();
String expected=getReadData("Desktop");
asse.assertEquals(actual,expected);
asse.assertAll();
System.out.println("validation Sucessful done for Desktop");
driver.switchTo().defaultContent();
}
}
