package com.emamiweb.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public String baseURL="http://eal-alb1-1784752582.ap-south-1.elb.amazonaws.com:90/";
	public String AdminUsername = "9000000001";
	public String AdminPassword = " Deal@2019";
	public String LooseUsername = "8336815606";
	public String LoosePassword = "123456";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		
	}
	
	/*@AfterClass
	public void teardown()
	{
		driver.quit();
	}*/

}
