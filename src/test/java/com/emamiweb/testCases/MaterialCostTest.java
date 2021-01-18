package com.emamiweb.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;
import com.emamiweb.pageobjects.MaterialcostPage;
import com.emamiweb.pageobjects.LoginPage;

public class MaterialCostTest extends BaseClass
{
    @Test
    @Parameters("User")
    public void MCP(String User) throws InterruptedException, IOException {
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
		MaterialcostPage MCP = new MaterialcostPage(driver);
	    MCP.Create_MaterialCost();
	    MCP.AdminDropdownSelection();
	    System.out.println("====  MAterial cost created for HBC  ====");
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
	MaterialcostPage MCP = new MaterialcostPage(driver);
    MCP.Create_MaterialCost();
    MCP.LooseDropdownSelection();
    System.out.println("====  MAterial cost created for Loose  ====");

}

		
		/*MaterialcostPage MCP = new MaterialcostPage(driver);
		//MCP = new MaterialcostPage(MaterialCostTest.driver);
        MCP.Create_MaterialCost();
        //MCP.AdminDropdownSelection();
        //MCP.MaterialCostListvalll();
        MCP.LooseDropdownSelection();
        System.out.println("MAterial cost created");*/
    }
}
