package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class ButtonPage extends BaseLibrary{

	public ButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
		
		@FindBy (xpath="//button[@data-target='#elements']")
		private WebElement element;
		
		@FindBy (xpath="//a[@href='#tab_5']")
		private WebElement Buttons;
		
		@FindBy(xpath="//button[@ondblclick='doubletext()']")
		private WebElement Doubleclick;
		
		@FindBy(xpath="//button[@oncontextmenu='righttext()']")
		private WebElement Rightclick;
		
		@FindBy(xpath="//button[@onclick='clicktext()']")
		private WebElement Singleclick;
		
	
	
		public void clickonElement()
		{
			element.click();
		}
		
		public void clickOnButtons()
		{
			Buttons.click();
		}
		public void DoubleClick()
		{
	doubleclick(Doubleclick);
		}
		
		public void clickRightClick()
		{
			rightclick(Rightclick);
		}
		
		public void clickSingleClick()
		{
clickme(Singleclick);
		}
}

