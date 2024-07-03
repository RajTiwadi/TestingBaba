package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.Loginpage;

public class Loginpagetest extends BaseLibrary {
	Loginpage ob;
	@BeforeTest
	
	
	
	public void launchUrl() {
		launchUrl();
		ob=new Loginpage();
	}
@Test
public void Title() {
	ob.getTitle();
}

@Test
public void getURL() {
	ob.getUrl();
}
}
