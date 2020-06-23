package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.WebToolsPageObjects.DatabasePageObjects.HostDetailsPage;
import org.testng.Assert;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;




public class HostListPage extends BaseMethods {


    public HostListPage(WebDriver driver) {
        super(driver);}


    // public static final String HOST_LIST_ELEMENT_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*";
    public static final String HOST_LIST_ELEMENT_XPATH = "//div[@class='hidden-content ng-scope']/hidden-content[contains(@host,'item')][2]/uib-accordion/div/div/div/h4/a/span/div/div/div/div[2][contains(text(),'1host')]";
    public static final String HOST_LIST_ELEMENT_EDIT_BUTTON_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../div[4]/button";
    public static final String HOST_LIST_ELEMENT_MORE_DETAILS_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../div[1]/div/div[1]/i";
    public static final String HOST_LIST_ELEMENT_MORE_DETAILS_EDIT_TEMPLATES_BUTTON_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../../../../../../div[2]/div/div[2]/h4[2]/button";
    public static final String HOST_LIST_ELEMENT_MORE_DETAILS_EDIT_DIRECTORIES_BUTTON_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../../../../../../div[2]/div/div[2]/h4[3]/button";
    public static final String HOST_LIST_ELEMENT_TYPE_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../div[1]/div/div[3]";
    public static final String HOST_LIST_ELEMENT_ACTIVE_XPATH = "//*/text()[normalize-space(.)='%s']/parent::*/../../../div[1]/div/div[4]";

   @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-list")
  // @FindBy(xpath = "/html[1]/body[1]/ui-view[1]/webtools[1]/div[1]/div[2]/webtools-menu[1]/div[1]/div[1]/div[2]/ui-view[1]/host-list[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    public WebElement hostList;

    @FindBy(xpath = "//*[@id=\"gateway\"]")
    public WebElement gatewayDropdown;

    //@FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-list/div/div[3]/hidden-content[1]/uib-accordion/div/div/div[1]/h4/a/span/div/div[1]/div/div[2]")
    @FindBy(xpath = "//div[contains(text(),'ADMIN')]")
    public WebElement adminHost;

   // @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-list/div/div[3]/hidden-content[1]/uib-accordion/div/div/div[1]/h4/a/span/div/div[4]/button")
   @FindBy(xpath = "/html[1]/body[1]/ui-view[1]/webtools[1]/div[1]/div[2]/webtools-menu[1]/div[1]/div[1]/div[2]/ui-view[1]/host-list[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
    public WebElement adminHostEditButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-list/div/div[1]/div[2]/button")
    public WebElement newHostButton;

    @FindBy(xpath = "//div[contains(text(),'Success')]")
    public WebElement successToast;

    public boolean verifyIfHostListContainsGivenHost(String hostName) {
        return driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_XPATH, hostName))).isDisplayed();
    }

    public void clickOnEditHostButton(String hostName) {
        waitAndClick(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_EDIT_BUTTON_XPATH, hostName))));
    }

    public void clickOnMoreDetails(String hostName) {
        waitAndClick(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_MORE_DETAILS_XPATH, hostName))));
    }

    public WebElement getMoreDetailsElement(String hostName) {
       return driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_MORE_DETAILS_XPATH, hostName)));
    }

    public void clickOnEditTemplates(String hostName) {
        waitAndClick(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_MORE_DETAILS_EDIT_TEMPLATES_BUTTON_XPATH, hostName))));
    }

    public void clickOnEditDirectories(String hostName) {
        waitAndClick(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_MORE_DETAILS_EDIT_DIRECTORIES_BUTTON_XPATH, hostName))));
    }

    public boolean verifyHostType(String expectedValue, String hostName) {
        return expectedValue.equals(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_TYPE_XPATH, hostName))).getText());
    }

    public boolean verifyHostActive(String expectedValue, String hostName) {
        return expectedValue.equals(driver.findElement(By.xpath(String.format(HOST_LIST_ELEMENT_ACTIVE_XPATH, hostName))).getText());
    }

    public void selectAdminFromHostList() throws InterruptedException {
        List<WebElement> adminHost=driver.findElements(By.xpath("/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-list"));
         for(WebElement hostList : adminHost)
         waitForElement(hostList);
        Assert.assertTrue(hostList.isDisplayed());
    }
    public void getMoreDetailsOnAdmin() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(""))).click().perform();
    }


}
