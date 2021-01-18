package com.emamiweb.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.emamiweb.pageobjects.LoginPage;

public class TC_LoginTest_1 extends BaseClass {
	
	@Test
	@Parameters("User")
	
	 public void loginTest(String User) {
		driver.get(baseURL);
		LoginPage lp = new LoginPage(driver);
		if(User.equalsIgnoreCase("Admin"))
		{
		lp.setUsername(AdminUsername);
		lp.setPassword(AdminPassword);
		lp.captchaclick();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.clicksubmit();
	}
	
	if(User.equalsIgnoreCase("LooseAdmin"))
	{
	lp.setUsername(LooseUsername);
	lp.setPassword(LoosePassword);
	lp.captchaclick();
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	lp.clicksubmit();
}

}

	
}
