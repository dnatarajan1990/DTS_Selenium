package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 03.07.2017.
 */
public class UserPrivilegesPage extends BaseMethods {

    public UserPrivilegesPage(WebDriver driver) {
        super(driver);
    }

    public static final String ACMT = "//input[@id='roleInput_ACMT']";
    public static final String ACMT_VIEW = "#roleInput_ACMT_VIEW";
    public static final String SAVE_BUTTON ="//button[contains(text(),'Save')]";
    public static final String AUDIT = "#roleInput_AUDIT";
    public static final String DFLOW_MASTER ="#roleInput_FORMS_USER";
    public static final String SYSTEM_ADMINISTRATOR = "#roleInput_SYS_ADMIN";
    public static final String SYSTEM_ADMINISTRATOR_VIEW = "#roleInput_DSAT_VIEW";
    public static final String USER_MANAGEMENT = "#roleInput_USER_ADMIN";
    public static final String MPID_ROLE_MANAGEMENT = "roleInput_MPID_ADMIN";


    @FindBy(xpath = ACMT)
    public WebElement acmt;

    @FindBy(css = ACMT_VIEW)
    public WebElement acmtView;

    @FindBy(css = AUDIT)
    public WebElement audit;

    @FindBy(css = DFLOW_MASTER)
    public WebElement dflowMaster;

    @FindBy(css = SYSTEM_ADMINISTRATOR)
    public WebElement systemAdministrator;

    @FindBy(css = SYSTEM_ADMINISTRATOR_VIEW)
    public WebElement systemAdministratorView;

    @FindBy(css = USER_MANAGEMENT)
    public WebElement userManagement;

    @FindBy(css = MPID_ROLE_MANAGEMENT)
    public WebElement mpidRoleManagement;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;



    public WebElement getAcmt(){return acmt;}
    public WebElement getAcmtView(){return acmtView;}
    public WebElement getSaveButton(){return saveButton;}
    public WebElement getAudit(){return audit;}
    public WebElement getDflowMaster(){return dflowMaster;}
    public WebElement getSystemAdministrator(){return systemAdministrator;}
    public WebElement getSystemAdministratorView() {return systemAdministratorView;}
    public WebElement getUserManagement(){return userManagement;}
    public WebElement getMpidRoleManagement() {return mpidRoleManagement;}
}
