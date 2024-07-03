package baseLibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import propertyUtility.PropertyUtility;
import screenshotUtility.ScreenShotUtility;


public class BaseLibrary implements ExcelUtility,PropertyUtility,ApplicationUtility,ScreenShotUtility {

public static WebDriver driver=null;
String path="";
public void launchUrl(String browser)
{
if(browser.equals("chrome"))
{
	path="C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\Webdriver2\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	 driver=new ChromeDriver();
}
else if(browser.equals("Firefox")) {
	path="C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\Webdriver\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",path);
	 driver=new FirefoxDriver();
}
else if(browser.equals("edge")) {
	path="C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\Webdriver\\msedgedriver.exe";
	System.setProperty("webdriver.edge.driver",path);
	 driver=new EdgeDriver();
}
	driver.get("https://www.testingbaba.com/old/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement (By.xpath("//button[text()='×']")).click();
		driver.findElement (By.xpath("//a[text()='Practice']")).click();
}
@Override
public String getReadData(int sheetNo, int rowno, int colno) {
	String path= "C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\testData\\data._excel.xlsx";
	String val="";
	try {
FileInputStream fis=new FileInputStream(path);
XSSFWorkbook wb =new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheetAt(sheetNo);
 val=sheet.getRow(rowno).getCell(colno).getStringCellValue();
wb.close();
} catch (Exception e) {
System.out.println("issue in getReadData :" + e);
}
	return val;
}
@Override
public String getReadData(String key) {
	String path="C:\\Users\\Rajesh Tiwari\\eclipse-workspace\\automationSinglePage\\testData\\config.properties";
	String value="";
	try {
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty(key);
	}catch(Exception e) 
	{
		System.out.println("Issue in get read data :"+ e);
		
	}
			
			return value;
}
@Override
public void doubleclick(WebElement ele) {
Actions act=new Actions(driver);
	act.doubleClick(ele).perform();
}
@Override
public void rightclick(WebElement ele) {
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
}
@Override
public void clickme(WebElement ele) {
	Actions act=new Actions(driver);
	act.click(ele).perform();
}
@Override
public void switchtowindow(int index) {
	Set<String>handles=driver.getWindowHandles();
	ArrayList<String> listOfHandles=new ArrayList<String>(handles);
	driver.switchTo().window(listOfHandles.get(index));

}
@Override
public void waitforClick(WebElement ele) {
	WebDriverWait wait=new WebDriverWait(driver,25);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
}
@Override
public void waitforalert() {
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
}
@Override
public void waitforVisibility(WebElement ele) {
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(ele));
	
}
@Override
public void SelectByVisibleText(WebElement ele, String text) {
	Select sel=new Select(ele);
	sel.selectByVisibleText(text);
	
}
@Override
public void SelectByvalue(WebElement ele, String value) {
	Select sel=new Select(ele);
	sel.selectByValue(value);
	sel.getOptions();
}
@Override
public void SelectByindex(WebElement ele, int index) {
	Select sel=new Select(ele);
	sel.selectByIndex(index);
	
}
@Override
public void getScreenshot(String FolderName, String FileName) {
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
	String currentDate = sdf.format(date);
	
	String Loc=System.getProperty("user.dir");
	String path=Loc+"//Screenshot//"+FolderName+"//"+FileName+ currentDate +" .png";
try {
	EventFiringWebDriver efw=new EventFiringWebDriver(driver);
File src=efw.getScreenshotAs(OutputType.FILE);
File des=new File(path);
FileUtils.copyFile(src, des);

} catch (Exception e) {
	System.out.println("issue in take Screenshot" + e);
}
}
@AfterMethod
public void getResultanalysis(ITestResult result)
{
	String Filename=result.getMethod().getMethodName();
	if(result.getStatus()==ITestResult.SUCCESS)
	{
	getScreenshot("pass", Filename);
	}
	else if(result.getStatus()==ITestResult.FAILURE);
	{
		getScreenshot("failed", Filename);
}
}
@Override
public void mouseover(WebElement ele) {
	Actions act=new Actions(driver);
	act.click(ele).build().perform();
}
@Override
public void UploadFile(String path) {
try {
	StringSelection Sel=new StringSelection(path);
Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(Sel,null);
	
	Robot rob=new Robot();
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.keyRelease(KeyEvent.VK_ENTER);
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_V);
	rob.keyPress(KeyEvent.VK_ENTER);
	rob.delay(300);
	rob.keyRelease(KeyEvent.VK_ENTER);
	
} catch (Exception e) {
	System.out.println("Issue in Upload file" +e);
}

	
}
}