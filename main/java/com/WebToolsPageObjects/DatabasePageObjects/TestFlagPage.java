package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TestFlagPage extends BaseMethods {
    public TestFlagPage(WebDriver driver) {
        super(driver);}

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/test-flag-list/div[2]/div/div[2]/table/tbody/tr")
    public List<WebElement> testFlagList;

    @FindBy(xpath = "//button[contains(text(),'New')]")
    public WebElement testFlagButtonNew;

    @FindBy(xpath = "//button[contains(@title,'Edit Test Flag')][1]")
    public WebElement testFlagButtonEdit;

    @FindBy(xpath = "//*[@id=\"gateway\"]")
    public WebElement testFlagGatewayDropdown;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    public WebElement testFlagEditButtonSave;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]")
    public WebElement testFlagEditButtonCancel;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement testFlagEditDecriptionField;

    @FindBy(xpath = "//*[@id=\"display_position\"]")
    public WebElement testFlagEditDisplayPositionField;

    @FindBy(xpath = "//*[@id=\"code\"]")
    public WebElement testFlagNewTestFlagNameField;

    @FindBy(xpath = "//*[@id=\"indCode\"]")
    public WebElement testFlagNewIndustryField;

}
