package com.WebToolsPageObjects.UserGroupPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserGroupNewPage extends BaseMethods {

    public UserGroupNewPage(WebDriver driver) {
        super(driver);
    }

    public final String SAVE_BUTTON  = "//button[text()='Save']";
    public final String CANCEL_BUTTON = "//button[text()='Cancel']";
    public final String DESCRIPTION_FIELD ="//textarea";
    public final String USER_GROUP_NAME_FIELD = "//input";



    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = DESCRIPTION_FIELD)
    public WebElement descriptionField;

    @FindBy(xpath = USER_GROUP_NAME_FIELD)
    public WebElement userGroupNameField;


    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getDescriptionField() {
        return descriptionField;
    }

    public WebElement getUserGroupNameField() {
        return userGroupNameField;
    }
}
