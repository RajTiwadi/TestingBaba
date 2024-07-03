package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import baseLibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary{
	public TextBoxPage(){
		PageFactory.initElements(driver, this);
			}
	
	@FindBy (xpath="//button[@data-target='#elements']")
	public WebElement element;
	
	@FindBy (xpath="//a[text()='text box']")
	public WebElement textbox;
	
	@FindBy (xpath="//input[@id='fullname1']")
	public WebElement fullname;
			
	@FindBy (xpath="//input[@id='fullemail1']")
	private WebElement email;	
			
	@FindBy (xpath="//textarea[@id='fulladdresh1']")
	private WebElement CurrentAddress;
	
	@FindBy (xpath="//textarea[@id='paddresh1']")
	private WebElement PAddress;
	
	@FindBy (xpath="//input[@value='Submit']")
		private WebElement button;
	
	@FindBy (xpath="//div[@class='col-md-6 mt-5']/label")
	private List <WebElement> list;
	
	

	public void clickonElement()
	{
		element.click();
	}
	
	public void clickonText() 
	{
		textbox.click();
	}
	public void filldetails()
	{
		fullname.sendKeys(getReadData(0,1,0));
		email.sendKeys(getReadData(0,1,1));
		CurrentAddress.sendKeys(getReadData(0,1,2));
		PAddress.sendKeys(getReadData(0,1,3));
			button.click();
	}
	public void getValidate()
	{
		SoftAssert asse=new SoftAssert();
		ArrayList<String> expected =new ArrayList<>();
		ArrayList<String> actual =new ArrayList<>();
		for (int i=0;i<=3;i++)
		expected.add(getReadData(0,1,i));
		for(int i=1;i<list.size();i=i+2)
		{
	actual.add(list.get(i).getText());
	}
		for (int i=0;i<=3;i++)
		{
		asse.assertEquals(actual.get(i),expected.get(i));
		}
		asse.assertAll();
		System.out.println("validation done");
	}
}