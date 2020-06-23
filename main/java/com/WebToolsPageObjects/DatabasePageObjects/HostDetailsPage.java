package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HostDetailsPage extends BaseMethods {
    public HostDetailsPage(WebDriver driver) {
        super(driver);}

    @FindBy(xpath = "//*[@id='hostName']")
    public WebElement hostNameTextfield;

    @FindBy(xpath = "//button[text()='Save']")
    public WebElement saveHostButton;

    @FindBy(xpath = "//*[@id='hostType']")
    public WebElement hostTypeDrowpdown;

    @FindBy(xpath = "//*[@id='active']")
    public WebElement hostActiveCheckbox;

    @FindBy(xpath = "//div[contains(@class,'toast-message')]")
    public WebElement failureToast;

    @FindBy(xpath = "//*[@id=\"sendMode\"]")
    public WebElement sendModeDropdown;

    @FindBy(xpath = "//*[@id=\"receivesMode\"]")
    public WebElement receivesModeDropdown;

    @FindBy(xpath = "//*[@id=\"fileCollectOrder\"]")
    public WebElement fileCollectOrderDropdown;

    @FindBy(xpath = "//*[@id=\"offlineAlerts\"]")
    public WebElement offlineAlertsDropdown;

    @FindBy(xpath = "//*[@id=\"ftpDetails\"]")
    public WebElement ftpDetailsDropdown;

    @FindBy(xpath = "//*[@id=\"pollInterval\"]")
    public WebElement pollIntervaTextfield;

    // @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/host-details/div/div/form/div[10]/div/div/span/button")
    @FindBy(xpath = "/html[1]/body[1]/ui-view[1]/webtools[1]/div[1]/div[2]/webtools-menu[1]/div[1]/div[1]/div[2]/ui-view[1]/host-details[1]/div[1]/div[1]/form[1]/div[11]/div[1]/div[1]/span[1]/button[1]")
    public WebElement editDefaultFilenameTemplateButton;




}
