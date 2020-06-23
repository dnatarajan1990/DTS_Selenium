package com.WebToolsPageObjects.AuditPageObjects;


import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedQueriesPage extends BaseMethods {

    public SavedQueriesPage(WebDriver driver) {
        super(driver);
    }

    private static final String EDIT_BUTTON = "//td[text() = 'SrchTstVm']/../td/div[@class = 'btn-group']/button[@title = 'Edit']";
    private static final String DELETE_BUTTON = "//td[text() = 'SrchTstVm']/../td/div[@class = 'btn-group']/button[@title = 'Delete']";
    private static final String RUN_BUTTON = "//td[text() = 'SrchTstVm']/../td/div[@class = 'btn-group']/button[@title = 'Search']";
    private static final String CONFIRM_DELETE_BUTTON = "//div/button[@class ='btn btn-primary']";
    private static final String CONFIRM_EDIT_BUTTON = "//button[contains(@ng-click,'ok')]";
    public static final String SUCCESSFULLY_EDITED_CRITERIA_TOAST_MESSAGE = "//div[contains(@aria-label,'Success')]";

    @FindBy(xpath = EDIT_BUTTON)
    private WebElement editBtn;

    @FindBy(xpath = DELETE_BUTTON)
    private WebElement delBtn;

    @FindBy(xpath = RUN_BUTTON)
    private WebElement runBtn;

    @FindBy(xpath = CONFIRM_DELETE_BUTTON)
    private WebElement confDelBtn;

    @FindBy(xpath = CONFIRM_EDIT_BUTTON)
    private WebElement confEditBtn;

    @FindBy(xpath = SUCCESSFULLY_EDITED_CRITERIA_TOAST_MESSAGE)
    private WebElement succEditedCritToastMsg;

    public WebElement getEditBtn() { return editBtn; }
    public WebElement getDelBtn() { return delBtn; }
    public WebElement getRunBtn() { return runBtn; }
    public WebElement getConfDelBtn() { return confDelBtn; }
    public WebElement getConfEditBtn() { return confEditBtn; }
    public WebElement getSuccEditedCritToastMsg() { return succEditedCritToastMsg; }

    public void clickOnEditBtn() {
        waitAndClick(editBtn);
    }

    public void clickOnDelBtn() {
        waitAndClick(delBtn);
    }

    public void clickOnRunBtn() {
        waitAndClick(runBtn);
    }

    public void clickOnConfDel() {
        waitAndClick(confDelBtn);
    }

    public void clickOnConfEditBtn() { waitAndClick(confEditBtn); }


    public static String getEditButton() {
        return EDIT_BUTTON;
    }

    public static String getDeleteButton() {
        return DELETE_BUTTON;
    }

    public static String getRunButton() {
        return RUN_BUTTON;
    }

    public static String getConfirmDeleteButton() {
        return CONFIRM_DELETE_BUTTON;
    }

    public static String getConfirmEditButton() { return CONFIRM_EDIT_BUTTON; }

    public static String getSuccessfullyEditedCriteriaToastMessage() { return SUCCESSFULLY_EDITED_CRITERIA_TOAST_MESSAGE; }
}
