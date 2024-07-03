package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class SelectMenuPage extends BaseLibrary {
	public SelectMenuPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@data-target='#widget']")
	private WebElement Widgets;
	
	@FindBy(xpath="//a[@href='#tab_24']")
	private WebElement selectmenuPage;
	
	@FindBy(xpath="//div[@class='tab-pane fade active show']")
	private WebElement List;
	
	@FindBy(xpath="//div[@class='form-group'][1]/select")
	private WebElement SelectMenu;
	
	@FindBy(xpath="//div[@class='form-group'][2]/select")
	private WebElement SelectTitle;
	
	@FindBy(xpath="//div[@class='form-group'][3]//select")
	private WebElement OldStyle;
	
	@FindBy(xpath="//div[@class='form-group'][5]//select")
	private WebElement MultiSelect;
	
	
	public void SelectWidget() {
		waitforClick(Widgets);
	}
	
	public void SelectMenu() {
		waitforClick(selectmenuPage);
		}
	
	public void MenuPage()
	{
	waitforClick(SelectMenu);	
	SelectByVisibleText(SelectMenu,"Group 1, Option 1");
	SelectByindex(SelectMenu, 1);

	}
	
	public void selectTitle()
	{
		waitforClick(SelectTitle);
		SelectByindex(SelectTitle, 1);
	}
	public void OldPage()
	{
		waitforClick(OldStyle);
		SelectByindex(OldStyle, 1);
	}
	public void MultiselecT()
	{
		SelectByindex(MultiSelect, 0);
	}
	}
	