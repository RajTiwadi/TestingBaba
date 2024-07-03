package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class ToolTipsPage extends BaseLibrary {
public ToolTipsPage()
{ 
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//button[@data-target='#widget']")
	private WebElement Widget;
	
	@FindBy(xpath="//a[text()='tool tips']")
	private WebElement Tooltip;
	
	@FindBy(xpath="//button[@data-toggle='tooltip']")
	private WebElement Hoverme;
	
	public void widget()
	{
		waitforClick(Widget);
	}
	
	public void tooltip()
	{
		waitforClick(Tooltip);
	}
	
	public void getattribute()
	{
		mouseover(Hoverme);
		String Title=Hoverme.getAttribute("title");
		SoftAssert asse=new SoftAssert();
		String acutual=Title;
		String expected=getReadData("Hoverme");
		asse.assertEquals(acutual, expected);
		asse.assertAll();
				System.out.println("validation done for " +Title);
				
	}
	
}
