package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GWAccessListPage extends BaseMethods {
    public GWAccessListPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-summary/div/div[2]/div/table")
    public WebElement assigmentTable;

    @FindBy(xpath = "//*[@id=\"gateway\"]")
    public WebElement gatewayDropdown;

    @FindBy(xpath = "//*[@id=\"host\"]")
    public WebElement hostDropdown;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-summary/div/div[1]/div[2]/button")
    public WebElement assignMpidRolesButton;

    @FindBy(xpath = "//div[contains(@class,'toast toast-success')]")
    public WebElement successToast;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-summary/div/div[2]/p")
    public WebElement noAssignmentsText;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-summary/div/div[2]/div/table/tbody/tr/td[2]")
    public WebElement assigmentItemOnList;
}
