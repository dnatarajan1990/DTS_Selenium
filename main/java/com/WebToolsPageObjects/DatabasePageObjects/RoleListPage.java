package com.WebToolsPageObjects.DatabasePageObjects;
import com.CommonPages.BaseMethods;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RoleListPage extends BaseMethods {

    @FindBy(xpath = "/html/body/div/div/div/button")
    public WebElement warnButton;

    public RoleListPage(WebDriver driver) {
        super(driver);
    }

    //@FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/role-list")
    @FindBy(xpath = "//div[@class='ng-scope']/table[@class='table table-striped']/tbody")
    public WebElement roleList;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/role-list/div/div[2]/div/table/tbody/tr")
    public List<WebElement> roleRowsList;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/role-list/div/div/button")
    public WebElement mapMtcDescriptionsButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/role-mapping/div/div/div/span")
    public WebElement marketRoleTitle;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/role-mapping/div/div[2]/div/div/div")
    public WebElement avilableDTCExternalEntitiesTitle;

    @FindBy(xpath = "//*[@id='host']/option")
    public List<WebElement> marketRoleOptions;

    @FindBy(xpath = "//select[contains(@data-side,'left')]")
    public WebElement marketRoleLeftOptions;

    @FindBy(xpath = "//select[contains(@data-side,'left')]")
    public WebElement marketRoleRightOptions;

    @FindBy(xpath = "//button[@type='button']/span[@class='glyphicon glyphicon-step-forward']")
    public WebElement forwardButton;

    @FindBy(xpath = "//*[@id='host']")
    public WebElement marketRolefield;

    @FindBy(xpath = "//*[@selected='selected']")
    public WebElement marketRoleSelected;

    @FindBy(xpath = "//*[@name='role-assignment-area-left']")
    public WebElement roleAssignmentAreaLeft;

    @FindBy(xpath = "//*[@name='role-assignment-area-right']")
    public WebElement roleAssignmentAreaRight;

    @FindBy(xpath = "//*[@name='role-assignment-area-left']/option")
    public List<WebElement> roleAssignmentAreaLeftOptions;

    @FindBy(xpath = "//*[@name='role-assignment-area-right']/option")
    public List<WebElement> roleAssignmentAreaRightOptions;

    @FindBy(xpath = "//*[@data-ng-click='moveElements(optionsList.left, picked.left, optionsList.right);']")
    public WebElement moveElementRightButton;

    @FindBy(xpath = "//*[@data-ng-click='moveElements(optionsList.right, picked.right, optionsList.left);']")
    public WebElement moveElementLeftButton;

    @FindBy(xpath = "//*[@ng-click='$ctrl.save()']")
    public WebElement buttonSave;

    @FindBy(xpath = "//*[@ng-click='$ctrl.goToRoleList()']")
    public WebElement buttonCancel;

    public void moveAvailableDtcEntityToAssignedDtc() {
        Select select=new Select(marketRoleLeftOptions);
        select.selectByVisibleText("CFD Generator");
        waitAndClick(forwardButton);
    }
    public void verifyAssignedDtc() {
        Select select=new Select(marketRoleRightOptions);
        select.selectByVisibleText("CFD Generator");

    }

}
