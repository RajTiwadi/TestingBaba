package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class NestedFrames extends BaseLibrary{
public NestedFrames()
{
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//button[@data-target='#alerts']")
private WebElement AlertWindows;

@FindBy (xpath="//a[text()='nested frames']")
private WebElement NestedFrames;

@FindBy(xpath="//iframe[@src='text.html']")
private WebElement Parent;

@FindBy (xpath="//iframe[@src='target1.html']")
private WebElement SuperParent;
@FindBy(xpath="//iframe[@src='example.html']")
private WebElement Child;

@FindBy(xpath="//a[text()='Click Here']")
private WebElement Click;


public void Windows()
{
	waitforClick(AlertWindows);
}
public void Nested()
{
waitforClick(NestedFrames);
}


public void ClickFunction()
{
	driver.switchTo().frame(SuperParent);
	driver.switchTo().frame(Parent);
driver.switchTo().frame(Child);
	waitforClick(Click);
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();
}
}
