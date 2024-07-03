package pages;

import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class Loginpage extends BaseLibrary {
	public Loginpage(){
		PageFactory.initElements(driver, this);
	}
	
		public void getTitle() {
			String val=driver.getTitle();
			System.out.println(val);
		}
		public void getUrl()
		{
			String url=driver.getCurrentUrl();
			System.out.println(url);
		}
	}
