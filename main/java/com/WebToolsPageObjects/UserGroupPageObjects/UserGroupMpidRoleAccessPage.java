package com.WebToolsPageObjects.UserGroupPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserGroupMpidRoleAccessPage extends BaseMethods {

    public UserGroupMpidRoleAccessPage(WebDriver driver) {
        super(driver);
    }

    public static final String ALL_MPID_ROLE_CHECKBOX = "#allMpidRoleInput";
    public static final String ALL_ROLES_FOR_SELECTED_MPID_CHECKBOX ="#allRoleInput";
    public static final String MPID_DROPDOWN = "#mpidInput";
    public static final String BACK_BUTTON = "//button[contains(text(),'Back')]";
    public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
    public static final String ROLE_CHECKBOX = "//input[@ng-checked='$ctrl.markAllRoles']";

    public static final String ROLE_DASH = "//input[@id='roleInput_-']";
    public static final String ROLE_ONE = "//input[@id='roleInput_1']";
    public static final String ROLE_FOUR = "//input[@id='roleInput_4']";
    public static final String CONFIRMATION_MSG = "//div[@ng-if='$ctrl.message.text']";


    @FindBy(css= ALL_MPID_ROLE_CHECKBOX)
    public WebElement allMpidRoleCheckbox;

    @FindBy(css= ALL_ROLES_FOR_SELECTED_MPID_CHECKBOX)
    public WebElement allRolesForSelectedMpidCheckbox;

    @FindBy(css= MPID_DROPDOWN)
    public WebElement mpidDropdown;

    @FindBy(xpath= BACK_BUTTON)
    public WebElement backButton;

    @FindBy(xpath= SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath= ROLE_CHECKBOX)
    public WebElement roleCheckbox;

    @FindBy(xpath= ROLE_DASH)
    public WebElement roleDash;

    @FindBy(xpath= ROLE_ONE)
    public WebElement roleOne;

    @FindBy(xpath= ROLE_FOUR)
    public WebElement roleFour;

    @FindBy(xpath= CONFIRMATION_MSG)
    public WebElement confirmationMsg;

    public WebElement getAllMpidRoleCheckbox() {return allMpidRoleCheckbox;}
    public WebElement getAllRolesForSelectedMpidCheckbox() {return allRolesForSelectedMpidCheckbox;}
    public WebElement getMpidDropdown() {return mpidDropdown;}
    public WebElement getBackButton() {return backButton;}
    public WebElement getSaveButton() {return saveButton;}
    public WebElement getRoleCheckbox() {return roleCheckbox;}
    public WebElement getRoleDash(){return roleDash;}
    public WebElement getRoleOne(){return roleOne;}
    public WebElement getRoleFour(){return roleFour;}
    public WebElement getConfirmationMsg() {return confirmationMsg;}
}
