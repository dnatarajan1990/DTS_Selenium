package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MpidDetailstPage extends BaseMethods {

    public MpidDetailstPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@id='type']")
    public WebElement industryField;

    @FindBy(xpath = "//*[@id='type']/option")
    public List<WebElement> industryOptions;

    @FindBy(xpath = "//*[@selected='selected']")
    public WebElement industrySelected;

    @FindBy(xpath = "//*[@ng-click='$ctrl.createNewMpid()']")
    public WebElement newMpidButton;

    @FindBy(xpath = "//*[@id='mpid']")
    public WebElement mpidField;

    @FindBy(xpath = "//*[@id='type']")
    public WebElement mpidTypefield;

    @FindBy(xpath = "//*[@name='mpid-assignement-area-left']")
    public WebElement leftRolesSelect;

    @FindBy(xpath = "//*[@name='mpid-assignement-area-left']/option")
    public List<WebElement> leftRolesList;

    @FindBy(xpath = "//*[@name='mpid-assignement-area-right']")
    public WebElement rightRolesSelect;

    @FindBy(xpath = "//*[@name='mpid-assignement-area-right']/option")
    public List<WebElement> rightRolesList;

    @FindBy(xpath = "//*[@data-ng-click='moveElements(optionsList.left, picked.left, optionsList.right);']")
    public WebElement mpidMoveRoleRightButton;

    @FindBy(xpath = "//*[@data-ng-click='moveElements(optionsList.right, picked.right, optionsList.left);']")
    public WebElement mpidMoveRoleLeftButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.save(form)']")
    public WebElement newMpidSaveButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.save()']")
    public WebElement editMpidSaveButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.goToMpidSummary()']")
    public WebElement newtMpidCancelButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.goToMpidList()']")
    public WebElement editMpidCancelButton;

}
