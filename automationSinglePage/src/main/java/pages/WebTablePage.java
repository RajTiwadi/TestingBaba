package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class WebTablePage extends BaseLibrary{

	public  WebTablePage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath="//a[@href=\"#tab_4\"]")
	private WebElement Webtables;
	
	@FindBy(xpath="//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement FillName;
	
	 @FindBy(xpath="//input[@name='email']")
	private WebElement FillEmail;
	 
	 @FindBy (xpath="//button[@class='btn btn-success save-btn']" )
	 private WebElement Save;
	 
	 @FindBy(xpath="//iframe[@src='Webtable.html']")
	 private WebElement frame;
	 
	 @FindBy(xpath="//button[@class='btn btn-info btn-xs btn-edit']")
	 private List <WebElement> list;
	 
	 @FindBy(xpath="//input [@name='edit_name']")
	public WebElement editName;
	 
	 @FindBy(xpath="//input[@name='edit_email']")
	 public WebElement editEmail;
	 
	@FindBy(xpath="//button[@class='btn btn-info btn-xs btn-update']")
	public WebElement Update;
	 

	 public void clickonElement()
	 {
	 	element.click();
	 }
	 public void clickonWebTables()
	 {
	 	Webtables.click();
	 }
	 public void Table()
	 {
		 driver.switchTo().frame(frame);
		for(int i=1;i<=5;i++)
		{
	 	FillName.sendKeys(getReadData(1,i,0));
	 	FillEmail.sendKeys(getReadData(1,i,1));
	 	Save.click();
	 }
	 	driver.switchTo().defaultContent();
	 }
	 public void UpdateTable()
	 { int i=1;
		 driver.switchTo().frame(frame);
	 
		 for(WebElement edit:list)
		 {
			 edit.click();
			 editName.clear();
			 editName.sendKeys(getReadData(1,i,2));
			 editEmail.clear();
			 editEmail.sendKeys(getReadData(1,i,3));
			 Update.click();
			 i++;
		 }
		 driver.switchTo().defaultContent();
	 } 
}
