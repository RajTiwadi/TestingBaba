package automationSinglePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestingBaba_Automation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://testingbaba.com/old/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[3]")).click();	
		 driver.findElement(By.xpath("//*[@id=\"tab_3\"]/div[1]/label")).click();	
		 driver.findElement(By.xpath("//*[@id=\"tab_3\"]/div[2]/label")).click();	
		 driver.findElement(By.xpath("//*[@id=\"no\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys("Rajesh");
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys("Raju@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys("indirapuram near Noida Sector- 63 ");
		driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys("Dehradun uttrakhand");
		driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
	List<WebElement> list=	driver.findElements(By.xpath("//*[@id=\"tab_1\"]/div/div[2]"));
		for(WebElement ele: list) {
			String Value=ele.getText();
			System.out.println(Value);
		}
	}
	}