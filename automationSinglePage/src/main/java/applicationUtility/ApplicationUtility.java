package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
public void doubleclick(WebElement ele);
public void rightclick(WebElement ele);
public void clickme(WebElement ele);
public void switchtowindow(int index);
public void waitforClick(WebElement ele);
public void waitforVisibility(WebElement ele);
public void waitforalert();
public void SelectByVisibleText(WebElement ele,String text);
public void SelectByvalue(WebElement ele,String value);
public void SelectByindex(WebElement ele,int index);
public void mouseover(WebElement ele);
public void UploadFile(String path);
}
