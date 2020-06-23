package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import com.WebToolsPageObjects.ApplicationDataEnumsPageObjects.UserPageTableButtons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import pageObjects.ElectraLink.applicationDataEnums.UserPageTableButtons;

import java.util.Optional;

/**
 * Created by sciborek on 14.06.2017.
 */
public class UserEditPage extends BaseMethods {
    public UserEditPage(WebDriver driver) {
        super(driver);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }

    UserPage userPage;

    public static final String EDIT_USER_LABEL_TEXT = "Edit User";

    public static final String EDIT_USER_LABEL = ".h2";
    public static final String USER_PASSWORD_BOX = "#password";
    public static final String USER_CONF_PASS_BOX = "#passConf";
    public static final String USER_FIRST_NAME = "#firstName";
    public static final String USER_LAST_NAME = "#lastName";
    public static final String DESCRIPTION_BOX = "#description";
    public static final String EMAIL_BOX = "//input[@name='email']";
    public static final String ACCOUNT_ACTIVE_CHECKBOX = "//input[@type='checkbox']";
    public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";
    public static final String CANCEL_BUTTON = "//button[text()='Cancel']";
    public static final String USER_GROUP_DROPDOWN = "//select[@id='userGroup']";

    public static final String ERROR_CONFIRM_PASSWORD_REQUIRED = "//div[contains(@has-error,'$ctrl.userForm.passConf')]/validation-errors/div/div[@ng-message='required']";
    public static final String ERROR_PASSWORD_DONT_MATCH = "//div[@ng-message='matchPassword']";
    public static final String ERROR_PASSWORD_CONTAINS_USERNAME = "//div[@ng-message='containsUserName']";
    public static final String ERROR_PASSWORD_TO_LONG = "//div[contains(@has-error,'userForm.password')]/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_FIRSTNAME_TO_LONG = "//div[@has-error='userForm.firstName']/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_LASTNAME_TOLONG = "//div[@has-error='userForm.lastName']/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_INVALID_EMAIL = "//div[contains(@ng-if,'userForm.email')]";

    @FindBy(xpath = ERROR_CONFIRM_PASSWORD_REQUIRED)
    public WebElement errorConfirmPasswordRequired;

    @FindBy(xpath = ERROR_PASSWORD_DONT_MATCH)
    public WebElement errorPassDontMatch;

    @FindBy(xpath = ERROR_PASSWORD_CONTAINS_USERNAME)
    public WebElement errorPassContainsUsername;

    @FindBy(xpath = ERROR_PASSWORD_TO_LONG)
    public WebElement errorPasswordToLong;

    @FindBy(xpath = ERROR_FIRSTNAME_TO_LONG)
    public WebElement errorFirstnameToLong;

    @FindBy(xpath = ERROR_LASTNAME_TOLONG)
    public WebElement errorLastnameToLong;

    @FindBy(xpath = ERROR_INVALID_EMAIL)
    public WebElement errorInvalidMail;

    @FindBy(css = EDIT_USER_LABEL)
    public WebElement editUserLabel;


    @FindBy(css = USER_PASSWORD_BOX)
    public WebElement userPasswordBox;

    @FindBy(css = USER_CONF_PASS_BOX)
    public WebElement userConfPasswordBox;

    @FindBy(css = USER_FIRST_NAME)
    public WebElement userFirstName;

    @FindBy(css = USER_LAST_NAME)
    public WebElement userLastName;

    @FindBy(css = DESCRIPTION_BOX)
    public WebElement descriptionBox;

    @FindBy(xpath = EMAIL_BOX)
    public WebElement emailBox;

    @FindBy(xpath = ACCOUNT_ACTIVE_CHECKBOX)
    public WebElement accountActiveCheckbox;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = USER_GROUP_DROPDOWN)
    public WebElement userGroupDropdown;


    public WebElement getEditUserLabel() {
        return editUserLabel;
    }

    public WebElement getUserPasswordBox() {
        return userPasswordBox;
    }

    public WebElement getUserConfPasswordBox() {
        return userConfPasswordBox;
    }

    public WebElement getUserFirstName() {
        return userFirstName;
    }

    public WebElement getUserLastName() {
        return userLastName;
    }

    public WebElement getDescriptionBox() {
        return descriptionBox;
    }

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getUserGroupDropdown() {
        return userGroupDropdown;
    }

    public WebElement getAccountActiveCheckbox() {
        return accountActiveCheckbox;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getErrorConfirmPasswordRequired() {
        return errorConfirmPasswordRequired;
    }

    public WebElement getErrorPassDontMatch() {
        return errorPassDontMatch;
    }

    public WebElement getErrorPassContainsUsername() {
        return errorPassContainsUsername;
    }

    public WebElement getErrorPasswordToLong() {
        return errorPasswordToLong;
    }

    public WebElement getErrorFirstnameToLong() {
        return errorFirstnameToLong;
    }

    public WebElement getErrorLastnameToLong() {
        return errorLastnameToLong;
    }

    public WebElement getErrorInvalidMail() {
        return errorInvalidMail;
    }


    public void getAndEditUser(String userName, Optional<String> userFirstName, Optional<String> userLastName, Optional<String> descrip, Optional<String> email, Optional<String> groupToSelectByName, Optional<String> password, Optional<String> confirmPassword, Optional<Boolean> accountActive) throws InterruptedException {
        userPage.getAndClickMoreOptionsButton(userName, UserPageTableButtons.Edit);
        waitForElement(getCancelButton());

        String firstName = userFirstName.isPresent() ? userFirstName.get() : "";
        String lastName = userLastName.isPresent() ? userFirstName.get() : "";
        String description = descrip.isPresent() ? descrip.get() : "";
        String mail = email.isPresent() ? email.get() : "";
        String group = groupToSelectByName.isPresent() ? groupToSelectByName.get() : "";
        String pass = password.isPresent() ? password.get() : "";
        String confPass = confirmPassword.isPresent() ? confirmPassword.get() : "";
        Boolean isActive = accountActive.isPresent() ? accountActive.get() : true;

        if (!isActive) getAccountActiveCheckbox().click();

        waitAndType(getUserPasswordBox(), pass);
        waitAndType(getUserConfPasswordBox(), confPass);

        waitAndType(getUserFirstName(), firstName);
        waitAndType(getUserLastName(), lastName);
        waitAndType(getDescriptionBox(), description);
        waitAndType(getEmailBox(), mail);
        selectVisibleOptionFromMenu(group, getUserGroupDropdown());

        getSaveButton().click();
        waitForElement(userPage.getUserNameContainsSearchBox());
    }

    public void tryEditUser(String userName, Optional<String> userFirstName, Optional<String> userLastName, Optional<String> descrip, Optional<String> email, Optional<String> groupToSelectByName, Optional<String> password, Optional<String> confirmPassword, Optional<Boolean> accountActive) throws InterruptedException {
        waitForElement(userPage.getAnyMoreActionsButton());

        userPage.getAndClickMoreOptionsButton(userName, UserPageTableButtons.Edit);
        waitForElement(getCancelButton());

        String firstName = userFirstName.isPresent() ? userFirstName.get() : "";
        String lastName = userLastName.isPresent() ? userLastName.get() : "";
        String description = descrip.isPresent() ? descrip.get() : "";
        String mail = email.isPresent() ? email.get() : "";
        String group = groupToSelectByName.isPresent() ? groupToSelectByName.get() : "";
        String pass = password.isPresent() ? password.get() : "";
        String confPass = confirmPassword.isPresent() ? confirmPassword.get() : "";
        Boolean isActive = accountActive.isPresent() ? accountActive.get() : true;

        if (!isActive) getAccountActiveCheckbox().click();

        waitAndType(getUserPasswordBox(), pass);
        if (getUserConfPasswordBox().isEnabled()) {
            waitAndType(getUserConfPasswordBox(), confPass);
        }
        waitAndType(getUserFirstName(), firstName);
        waitAndType(getUserLastName(), lastName);
        waitAndType(getDescriptionBox(), description);
        waitAndType(getEmailBox(), mail);
        selectVisibleOptionFromMenu(group, getUserGroupDropdown());
        waitAndType(getDescriptionBox(), description);
    }
}
