package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import com.WebToolsPageObjects.ApplicationDataEnumsPageObjects.UserPageTableButtons;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.Optional;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by sciborek on 14.06.2017.
 */
public class UserCopyPage extends BaseMethods {
    public UserCopyPage(WebDriver driver) {
        super(driver);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }

    UserPage userPage;

    public static final String COPY_USER_LABEL_TEXT = "Copy from User:";
    public static final String COPY_USER_LABEL = "h2.ng-binding";
    public static final String USER_NAME_BOX = "#username";
    public static final String USER_PASSWORD_BOX = "#password";
    public static final String USER_CONF_PASS_BOX = "#passConf";
    public static final String USER_FIRST_NAME = "#firstName";
    public static final String USER_LAST_NAME = "#lastName";
    public static final String DESCRIPTION_BOX = "#description";
    public static final String EMAIL_BOX = "//input[@name='email']";
    public static final String USER_GROUP_DROPDOWN = "//select[@id='userGroup']";
    public static final String ACCOUNT_ACTIVE_CHECKBOX = "//input[@type='checkbox']";
    public static final String SAVE_BUTTON = "//button[text()='Save']";
    public static final String CANCEL_BUTTON = "//button[text()='Cancel']";

    public static final String ERROR_TO_LONG_USERNAME = "//div[contains(@has-error,'userCopyForm.userName')]/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_USERNAME_REQUIRED = "//div[contains(@has-error,'userCopyForm.userName')]/validation-errors/div/div[@ng-message='required']";
    public static final String ERROR_TO_SHORT_USERNAME = "//div[contains(@has-error,'userCopyForm.userName')]/validation-errors/div/div[@ng-message='minlength']";
    public static final String ERROR_PASSWORD_REQUIRED = "//div[contains(@has-error,'userCopyForm.password')]/validation-errors/div/div[@ng-message='required']";
    public static final String ERROR_CONFIRM_PASSWORD_REQUIRED = "//div[contains(@has-error,'userCopyForm.passConf')]/validation-errors/div/div[@ng-message='required']";
    public static final String ERROR_PASSWORD_DONT_MATCH = "//div[@ng-message='matchPassword']";
    public static final String ERROR_PASSWORD_CONTAINS_USERNAME = "//div[@ng-message='containsUserName']";
    public static final String ERROR_PASSWORD_TO_LONG = "//div[contains(@has-error,'userCopyForm.password')]/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_FIRSTNAME_TO_LONG = "//div[contains(@has-error,'userCopyForm.firstName')]/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_LASTNAME_TOLONG = "//div[contains(@has-error,'userCopyForm.lastName')]/validation-errors/div/div[@ng-message='maxlength']";
    public static final String ERROR_INVALID_EMAIL = "//div[contains(@ng-if,'userCopyForm.email')]";

    @FindBy(xpath = ERROR_TO_LONG_USERNAME)
    public WebElement errorToLongUserName;

    @FindBy(xpath = ERROR_USERNAME_REQUIRED)
    public WebElement errorUsernameRequired;

    @FindBy(xpath = ERROR_TO_SHORT_USERNAME)
    public WebElement errorToShortUsername;

    @FindBy(xpath = ERROR_PASSWORD_REQUIRED)
    public WebElement errorPasswordRequired;

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

    @FindBy(css = COPY_USER_LABEL)
    public WebElement copyFromUserLabel;

    @FindBy(css = USER_NAME_BOX)
    public WebElement userNameBox;

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

    @FindBy(xpath = USER_GROUP_DROPDOWN)
    public WebElement userGroupDropdown;

    @FindBy(xpath = ACCOUNT_ACTIVE_CHECKBOX)
    public WebElement accountActiveCheckbox;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;


    public WebElement getCopyFromUserLabel() {
        return copyFromUserLabel;
    }

    public WebElement getUserNameBox() {
        return userNameBox;
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

    public WebElement getErrorToLongUserName() {
        return errorToLongUserName;
    }

    public WebElement getErrorUsernameRequired() {
        return errorUsernameRequired;
    }

    public WebElement getErrorToShortUsername() {
        return errorToShortUsername;
    }

    public WebElement getErrorPasswordRequired() {
        return errorPasswordRequired;
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


    public void getAndCopyUser(String copyFromUserName, String username, String password, String confirmPassword, Optional<String> userFirstName, Optional<String> userLastName, Optional<String> descrip, Optional<String> email, Optional<String> groupToSelectByName, Optional<Boolean> accountActive) throws InterruptedException {
        userPage.getAndClickMoreOptionsButton(copyFromUserName, UserPageTableButtons.CopyUser);
        waitForElement(getCancelButton());

        String firstName = userFirstName.isPresent() ? userFirstName.get() : "";
        String lastName = userLastName.isPresent() ? userFirstName.get() : "";
        String description = descrip.isPresent() ? descrip.get() : "";
        String mail = email.isPresent() ? email.get() : "";
        String group = groupToSelectByName.isPresent() ? groupToSelectByName.get() : "";
        Boolean isActive = accountActive.isPresent() ? accountActive.get() : true;

        if (!isActive) getAccountActiveCheckbox().click();
        waitAndType(getUserNameBox(), username);
        waitAndType(getUserPasswordBox(), password);
        waitAndType(getUserConfPasswordBox(), confirmPassword);

        waitAndType(getUserFirstName(), firstName);
        waitAndType(getUserLastName(), lastName);
        waitAndType(getDescriptionBox(), description);
        waitAndType(getEmailBox(), mail);
        selectVisibleOptionFromMenu(group, getUserGroupDropdown());
        getSaveButton().click();
        waitForElement(userPage.getUserNameContainsSearchBox());
        waitAndType(userPage.getUserNameContainsSearchBox(), username);
        waitForElement(userPage.getAnyMoreActionsButton());

        assertTrue("User was not created", !userPage.verifyIsElementNotDisplayed(userPage.getAnyEditButton()));
    }

    public void tryToCopyUser(String username, Optional<String> userFirstName, Optional<String> userLastName, Optional<String> descrip, Optional<String> email, Optional<String> groupToSelectByName, String password, String confirmPassword) throws InterruptedException {
        waitForElement(userPage.getAnyMoreActionsButton());

        userPage.getAndClickMoreOptionsButton(username, UserPageTableButtons.CopyUser);
        waitForElement(getCancelButton());



        String firstName = userFirstName.isPresent() ? userFirstName.get() : "";
        String lastName = userLastName.isPresent() ? userLastName.get() : "";
        String description = descrip.isPresent() ? descrip.get() : "";
        String mail = email.isPresent() ? email.get() : "";
        String group = groupToSelectByName.isPresent() ? groupToSelectByName.get() : "";
        /*Boolean isActive = accountActive.isPresent() ? accountActive.get() : true;

        if (!isActive) {
            getAccountActiveCheckbox().click();
        }*/
        waitAndType(getEmailBox(), mail);
        waitAndType(getUserPasswordBox(), password);
        if (getUserConfPasswordBox().isEnabled()) {
            waitAndType(getUserConfPasswordBox(), confirmPassword);
        }

       // waitAndType(getUserNameBox(), username);
        waitAndType(getUserFirstName(), firstName);
        waitAndType(getUserLastName(), lastName);
        waitAndType(getDescriptionBox(), description);
        selectVisibleOptionFromMenu(group, getUserGroupDropdown());

        waitAndClick(getSaveButton());
    }
}
