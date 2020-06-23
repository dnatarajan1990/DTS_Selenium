package com.WebToolsPageObjects.UserGroupPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserGroupAccessLevelsPage extends BaseMethods {

    public UserGroupAccessLevelsPage(WebDriver driver) {
                super(driver);
    }


    public final String BACK_BUTTON = "//button[contains(text(),'Back')]";
    public final String MPID_EDIT_BUTTON = "//button[@title='Modify MPID Access']";
    public final String MPID_ROLE_EDIT_BUTTON = "//button[@title='Modify Role Access']";



    @FindBy(xpath = BACK_BUTTON)
    public WebElement backButton;

    @FindBy(xpath = MPID_EDIT_BUTTON)
    public WebElement mpidEditButton;

    @FindBy(xpath = MPID_ROLE_EDIT_BUTTON)
    public WebElement mpidRoleEditButton;




    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getMpidEditButton() {
        return mpidEditButton;
    }

    public WebElement getMpidRoleEditButton() {
        return mpidRoleEditButton;
    }
}
