package com.emamiweb.testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="http://eal-alb1-1784752582.ap-south-1.elb.amazonaws.com:90/";
	public String Username = "9000000001";
	public String Password = " Deal@2019";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	/*@AfterClass
	public void teardown()
	{
		driver.quit();
	}*/

}
