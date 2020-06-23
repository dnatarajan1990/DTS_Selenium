package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MpidListPage extends BaseMethods {

    public MpidListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div/div/button")
    public WebElement warnButton;

    @FindBy(xpath = "//ui-view/mpid-list")
    public WebElement mpidList;

    @FindBy(xpath = "//mpid-list/div/div[2]/div/table/tbody/tr/td[1]")
    public List<WebElement> mpidRowsList;

    @FindBy(xpath = "//*[@id='gateway']")
    public WebElement industryField;

    @FindBy(xpath = "//*[@id='gateway']/option")
    public List<WebElement> industryOptions;

    @FindBy(xpath = "//*[@selected='selected']")
    public WebElement industrySelected;

    @FindBy(xpath = "//*[@ng-click='$ctrl.createNewMpid()']")
    public WebElement newMpidButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.goToMpidAssignment(item.id)'][1]")
    public WebElement editMpidButton;

    @FindBy(xpath = "//div[contains(@class,'toast toast-success')]")
    public WebElement successToast;

}
