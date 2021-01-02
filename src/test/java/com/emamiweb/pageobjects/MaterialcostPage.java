package com.emamiweb.pageobjects;

/*import org.openqa.selenium.interactions.Actions;
import java.util.function.Function;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class MaterialcostPage {

	WebDriver ldriver;
    String Vertical;
    String Oil_Type;
    String Plant;
    String RateMT;
    @FindBy(xpath = "//span[text()='Pricings']")
    WebElement Pricings;
    @FindBy(xpath = "//span[text()='Material Cost']")
    WebElement Material_Cost;
    @FindBy(xpath = "//a[@href='/Pricing/MaterialCostEditRedirect']")
    WebElement MaterialCostEditRedirect;
    @FindBy(id = "txtRateOrMT")
    WebElement RateOrMT;
    @FindBy(id = "btnSave")
    WebElement btnSave;
    @FindBy(xpath = "//span[text()='Select Vertical']")
    WebElement Select_Vertical;
    @FindBy(xpath = "//ul[@id='ddlVertical_listbox']/child::li[@class='k-item']")
    WebElement Vertical_listbox;
    @FindBy(xpath = "//span[text()='Select Oil Type']")
    WebElement Select_Oil;
    @FindBy(xpath = "//ul[@id='ddlOilType_listbox']/child::li[@class='k-item']")
    WebElement OilType_listbox;
    @FindBy(xpath = "//li[text()='Palm']")
    WebElement Palmselection;
    @FindBy(xpath = "//span[text()='Select Plant']")
    WebElement Select_Plant;
    @FindBy(xpath = "//li[text()='Haldia']")
    WebElement Haldiaselection;
    @FindBy(xpath = "//ul[@id='ddlPlant_listbox']/child::li[@class='k-item']")
    WebElement Plant_listbox;
    @FindBy(xpath = "//label[text()='Show Filter']")
    WebElement checkboxselection;
    @FindBy(xpath = "(//input[@class='k-input'])[3]")
    WebElement verticalinputselection;
    @FindBy(xpath = "(//input[@class='k-input'])[4]")
    WebElement oiltypeinputselection;
    @FindBy(xpath = "(//input[@class='k-input'])[5]")
    WebElement plantinputselection;
    @FindBy(xpath = "//input[@role='spinbutton']")
    WebElement Rateinputinputselection;
    @FindBy(xpath = "(//input[@value='true'])[2]")
    WebElement activetrue;
    @FindBy(xpath = "(//span[@class='k-dropdown-wrap k-state-default'])[5]")
    WebElement ratemtfilter;
    @FindBy(xpath = "(//li[text()='Is equal to'])[4]")
    WebElement isequalto;
    
    public MaterialcostPage(WebDriver rdriver) {
        Vertical = "HBC";
        Oil_Type = "Palm";
        Plant = "Haldia";
        RateMT = "100";
        //PageFactory.initElements(ldriver = rdriver, (Object)this);
    }
    
    public void PricingMaterial() throws InterruptedException {
        Pricings.click();
        Thread.sleep(3000);
        Material_Cost.click();
        Thread.sleep(3000);
    }
    
    public void Create_MaterialCost() throws InterruptedException {
        Pricings.click();
        Thread.sleep(3000);
        Material_Cost.click();
        Thread.sleep(3000);
        MaterialCostEditRedirect.click();
        RateOrMT.sendKeys("100");
        System.out.println("MAterial cost clicked");
    }
    
    public void DropdownSelection() throws InterruptedException {
        System.out.println("Performing droop down selection");
        Select_Vertical.click();
        ((WebElement)new WebDriverWait(ldriver, 20).until((Function)ExpectedConditions.elementToBeClickable(By.cssSelector("li.k-item[data-offset-index='0']")))).click();
        WebDriverWait wait = new WebDriverWait(ldriver, 30);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Oil Type']")));
        Select_Oil.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Palm']")));
        Palmselection.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Plant']")));
        Select_Plant.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Haldia']")));
        Haldiaselection.click();
        btnSave.click();
    }
    
    public void MaterialCostListvalll() throws InterruptedException {
        System.out.println("MaterialCostListvalll");
        WebDriverWait wait = new WebDriverWait(ldriver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Show Filter']")));
        checkboxselection.click();
        verticalinputselection.sendKeys("Vertical");
        oiltypeinputselection.sendKeys("Oil_Type ");
        plantinputselection.sendKeys("Plant");
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Haldia']")));
        Haldiaselection.click();
        Thread.sleep(2000);
        Rateinputinputselection.sendKeys("RateMT");
        activetrue.click();
        ratemtfilter.click();
        Actions action = new Actions(ldriver);
        action.moveToElement(isequalto);
        isequalto.click();
        Thread.sleep(2000);
    }	
}*/

import org.openqa.selenium.interactions.Actions;
import java.util.function.Function;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class MaterialcostPage
{
    WebDriver ldriver;
    String Vertical;
    String Oil_Type;
    String Plant;
    String RateMT;
    @FindBy(xpath = "//span[text()='Pricings']")
    WebElement Pricings;
    @FindBy(xpath = "//span[text()='Material Cost']")
    WebElement Material_Cost;
    @FindBy(xpath = "//a[@href='/Pricing/MaterialCostEditRedirect']")
    WebElement MaterialCostEditRedirect;
    @FindBy(id = "txtRateOrMT")
    WebElement RateOrMT;
    @FindBy(id = "btnSave")
    WebElement btnSave;
    @FindBy(xpath = "//span[text()='Select Vertical']")
    WebElement Select_Vertical;
    @FindBy(xpath = "//ul[@id='ddlVertical_listbox']/child::li[@class='k-item']")
    WebElement Vertical_listbox;
    @FindBy(xpath = "//span[text()='Select Oil Type']")
    WebElement Select_Oil;
    @FindBy(xpath = "//ul[@id='ddlOilType_listbox']/child::li[@class='k-item']")
    WebElement OilType_listbox;
    @FindBy(xpath = "//li[text()='Palm']")
    WebElement Palmselection;
    @FindBy(xpath = "//span[text()='Select Plant']")
    WebElement Select_Plant;
    @FindBy(xpath = "//li[text()='Haldia']")
    WebElement Haldiaselection;
    @FindBy(xpath = "//ul[@id='ddlPlant_listbox']/child::li[@class='k-item']")
    WebElement Plant_listbox;
    @FindBy(xpath = "//label[text()='Show Filter']")
    WebElement checkboxselection;
    @FindBy(xpath = "(//input[@class='k-input'])[3]")
    WebElement verticalinputselection;
    @FindBy(xpath = "(//input[@class='k-input'])[4]")
    WebElement oiltypeinputselection;
    @FindBy(xpath = "(//input[@class='k-input'])[5]")
    WebElement plantinputselection;
    @FindBy(xpath = "//input[@role='spinbutton']")
    WebElement Rateinputinputselection;
    @FindBy(xpath = "(//input[@value='true'])[2]")
    WebElement activetrue;
    @FindBy(xpath = "(//span[@class='k-dropdown-wrap k-state-default'])[5]")
    WebElement ratemtfilter;
    @FindBy(xpath = "(//li[text()='Is equal to'])[4]")
    WebElement isequalto;
    
    public MaterialcostPage(WebDriver rdriver) {
        Vertical = "HBC";
        Oil_Type = "Palm";
        Plant = "Haldia";
        RateMT = "100";
        ldriver = rdriver;
        
        PageFactory.initElements(rdriver,this);
    }
    
    /*public void PricingMaterial() throws InterruptedException {
        Pricings.click();
        Thread.sleep(3000);
        Material_Cost.click();
        Thread.sleep(3000);
    }*/
    
    public void Create_MaterialCost() throws InterruptedException {
        Pricings.click();
        Thread.sleep(3000);
        Material_Cost.click();
        Thread.sleep(3000);
        MaterialCostEditRedirect.click();
        RateOrMT.sendKeys("100" );
        System.out.println("MAterial cost clicked");
    }
    
    public void DropdownSelection() throws InterruptedException {
        System.out.println("Performing droop down selection");
        Select_Vertical.click();
        //((WebElement)new WebDriverWait(ldriver, 20).until((Function)ExpectedConditions.elementToBeClickable(By.cssSelector("li.k-item[data-offset-index='0']")))).click();
        new WebDriverWait(ldriver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("li.k-item[data-offset-index='0']"))).click();
        WebDriverWait wait = new WebDriverWait(ldriver, 30);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Oil Type']")));
        Select_Oil.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Palm']")));
        Palmselection.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Select Plant']")));
        Select_Plant.click();
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Haldia']")));
        Haldiaselection.click();
        btnSave.click();
    }
    
    public void MaterialCostListvalll() throws InterruptedException {
        System.out.println("MaterialCostListvalll");
        WebDriverWait wait = new WebDriverWait(this.ldriver, 30);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Show Filter']")));
        checkboxselection.click();
        verticalinputselection.sendKeys(Vertical );
        oiltypeinputselection.sendKeys(Oil_Type );
        plantinputselection.sendKeys(Plant);
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='Haldia']")));
        Haldiaselection.click();
        Thread.sleep(2000);
        Rateinputinputselection.sendKeys(RateMT);
        activetrue.click();
        ratemtfilter.click();
        Actions action = new Actions(ldriver);
        action.moveToElement(isequalto);
        isequalto.click();
        Thread.sleep(2000);
    }
}
