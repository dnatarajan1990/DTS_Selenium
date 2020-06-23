package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 14.06.2017.
 */
public class UserAccessLevelsPage extends BaseMethods {

    public UserAccessLevelsPage(WebDriver driver) {
        super(driver);
    }

    public static final String ACCESS_LEVELS_LABEL_TEXT = "Access Levels for:";

    public static final String ACCESS_LEVELS_LABEL = "div h2.ng-binding";
    public static final String BACK_BUTTON = "//button[text()='Back']";
    public static final String MPID_EDIT_BUTTON = "//button[@title='Modify MPID Access']";
    public static final String MPID_ROLE_EDIT_BUTTON = "//button[@title='Modify Role Access']";
    public static final String MODIFY_ACMT_EDIT_BUTTON = "//button[@title='Modify ACMT Gateway Access']";
    public static final String MODIFY_AUDIT_EDIT_BUTTON = "//button[@title='Modify Audit Gateway Access']";
    public static final String MODIFY_FLOW_ACCESS_EDIT_BUTTON = "//button[@title='Modify Flow Access']";
    public static final String MODIFY_PRIVILEGES_BUTTON = "//button[@title='Modify User Privileges']";

    @FindBy(css = ACCESS_LEVELS_LABEL)
    public WebElement accessLevelsLabel;

    @FindBy(xpath = BACK_BUTTON)
    public WebElement backButton;

    @FindBy(xpath = MPID_EDIT_BUTTON)
    public WebElement mpidEditButton;

    @FindBy(xpath = MPID_ROLE_EDIT_BUTTON)
    public WebElement mpidRoleEditButton;

    @FindBy(xpath = MODIFY_ACMT_EDIT_BUTTON)
    public WebElement modifyAcmtEditButton;

    @FindBy(xpath = MODIFY_AUDIT_EDIT_BUTTON)
    public WebElement modifyAuditEditButton;

    @FindBy(xpath = MODIFY_FLOW_ACCESS_EDIT_BUTTON)
    public WebElement modifyFlowAccessEditButton;

    @FindBy(xpath = MODIFY_PRIVILEGES_BUTTON)
    public WebElement modifyPrivilegesButton;


    public WebElement getAccessLevelsLabel() {
        return accessLevelsLabel;
    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getMpidEditButton() {
        return mpidEditButton;
    }

    public WebElement getMpidRoleEditButton() {
        return mpidRoleEditButton;
    }

    public WebElement getModifyAcmtEditButton() {
        return modifyAcmtEditButton;
    }

    public WebElement getModifyAutiEditButton() {
        return modifyAuditEditButton;
    }

    public WebElement getModifyFlowAccessEditButton() {
        return modifyFlowAccessEditButton;
    }

    public WebElement getModifyPrivilegesButton() {
        return modifyPrivilegesButton;
    }


}
