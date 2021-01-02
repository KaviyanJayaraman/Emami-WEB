package com.emamiweb.testCases;

import org.testng.annotations.Test;

import com.emamiweb.pageobjects.LoginPage;

public class TC_LoginTest_1 extends BaseClass {
	
	@Test
	 public void loginTest() {
		 
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(Username);
		lp.setPassword(Password);
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lp.clicksubmit();
	}
	
	

}
