package com.emamiweb.testCases;

/*import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.io.IOException;
import com.emamiweb.pageobjects.MaterialcostPage;
import com.emamiweb.pageobjects.LoginPage;



public class MaterialCostTest extends BaseClass {

	

	    @Test
	    public void MCP() throws InterruptedException, IOException {
	        MaterialCostTest.driver.get(this.baseURL);
	        final LoginPage LC = new LoginPage(MaterialCostTest.driver);
	        LC.setUsername(this.Username);
	        LC.setPassword(this.Password);
	        Thread.sleep(10000L);
	        LC.clicksubmit();
	        final MaterialcostPage MCP = new MaterialcostPage(MaterialCostTest.driver);
	        MCP.PricingMaterial();
	        MCP.MaterialCostListvalll();
	        System.out.println("MAterial cost created");
	    }
	
	
}*/

import org.testng.annotations.Test;
import java.io.IOException;
import com.emamiweb.pageobjects.MaterialcostPage;
import com.emamiweb.pageobjects.LoginPage;

public class MaterialCostTest extends BaseClass
{
    @Test
    public void MCP() throws InterruptedException, IOException {
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
		
		MaterialcostPage MCP = new MaterialcostPage(driver);
		MCP = new MaterialcostPage(MaterialCostTest.driver);
        MCP.Create_MaterialCost();
        MCP.DropdownSelection();
        MCP.MaterialCostListvalll();
        System.out.println("MAterial cost created");
    }
}
