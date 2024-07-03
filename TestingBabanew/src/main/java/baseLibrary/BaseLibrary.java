package baseLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseLibrary {
	public static WebDriver driver=null;
	public void launchUrl()
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.testingbaba.com/old/index.html" );	
	driver.manage().window().maximize();
	driver.findElement(By.xpath ("//button[text()='×']")).click();
	}
}