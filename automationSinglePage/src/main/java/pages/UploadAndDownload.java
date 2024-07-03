package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class UploadAndDownload extends BaseLibrary {
	String Path="C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\testData\\data._excel.xlsx";
public UploadAndDownload(){
	PageFactory.initElements(driver, this);
}

@FindBy (xpath="//button[@data-target='#elements']")
public WebElement element;

 @FindBy(xpath="//a[text()='upload and download']")
	private WebElement Uploaddownload;
 
 @FindBy(xpath="//label[@for='File1']")
 private WebElement chooseFile;
 
 public void clickonElement()
	{
		element.click();
	}
 public void ClickUpload()
 {
	 waitforClick(Uploaddownload);
 }
 
 public void ChooseFile()
 {
	 waitforClick(chooseFile);
	UploadFile(Path);
 } 
}
