package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseLibrary.BaseLibrary;


public class AlertPage extends BaseLibrary {
public AlertPage()
{
PageFactory.initElements(driver, this);
}
@FindBy (xpath="//a[text()='alerts']")
private WebElement alertButton;

@FindBy (xpath="//button[@data-target='#alerts']")
private WebElement AlertPage;

@FindBy (xpath="//button[@onclick='myalert()']")
private WebElement Click;

@FindBy (xpath="//button[@onclick='aftersec5()']")
private WebElement ClickMe5Sec;

@FindBy (xpath="//button[@onclick='myconfirm()']")
private WebElement confirmBox;

@FindBy (xpath="//button[@onclick='myprompt()']")
private WebElement PromptBox;

public void alertPage()
{
	waitforClick(AlertPage);
}

public void alertButton()
{
	waitforClick(alertButton);
}

public void Clickme()
{
	waitforClick(Click);
}
public void AlertInSec()
{
waitforClick(ClickMe5Sec);
}

public void ConfirmationButton()
{
waitforClick(confirmBox);
}

public void promptBoxAlert()
{
waitforClick(PromptBox);
}
}
