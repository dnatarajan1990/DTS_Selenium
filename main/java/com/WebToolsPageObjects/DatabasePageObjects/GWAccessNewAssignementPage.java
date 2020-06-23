package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GWAccessNewAssignementPage extends BaseMethods {
    public GWAccessNewAssignementPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "//*[@id=\"host\"]")
    public WebElement hostDropdown;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[2]/button[2]")
    public WebElement cancelButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[1]/div/div/div[1]/select/option[1]")
    public WebElement firstAvaialbleOption;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[1]/div/div/div[3]/select/option")
    public WebElement firstOptionToRemove;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[1]/div/div/div[2]/div[1]/button")
    public WebElement addRoleButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-access-gateway-host-mpid-role-assignment/div/div[2]/div/div[1]/div/div/div[2]/div[2]/button")
    public WebElement removeRoleButton;


}
