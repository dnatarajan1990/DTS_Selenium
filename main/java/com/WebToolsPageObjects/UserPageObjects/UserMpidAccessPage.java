package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 03.07.2017.
 */
public class UserMpidAccessPage extends BaseMethods {

    public UserMpidAccessPage(WebDriver driver) {
        super(driver);
    }

    public static final String NO_MPID_DEFINED_INFORMATION = "//div[@ng-if ='$ctrl.mpids.length == 0']";
    public static final String CANCEL_BUTTON = "//button[contains(text(),'Cancel')]";
    public static final String SAVE_BUTTON = "//button[contains(text(),'Save')]";

    public static final String MPID_ONE_CHECKBOX = "//input[@id='mpidInput_--01']";
    public static final String MPID_TWO_CHECKBOX = "//input[@id='mpidInput_--02']";
    public static final String MPID_THREE_CHECKBOX = "//input[@id='mpidInput_--03']";
    public static final String MPID_FOUR_CHECKBOX = "//input[@id='mpidInput_--04']";
    public static final String MPID_TA_CHECKBOX = "//input[@id='mpidInput_tA']";
    public static final String MPID_TA_TWO_CHECKBOX = "//input[@id='mpidInput_tA02']";

    @FindBy(xpath = NO_MPID_DEFINED_INFORMATION)
    public WebElement noMpidDefinedInformation;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = MPID_ONE_CHECKBOX)
    public WebElement mpidOneCheckbox;
    @FindBy(xpath = MPID_TWO_CHECKBOX)
    public WebElement mpidTwoCheckbox;
    @FindBy(xpath = MPID_THREE_CHECKBOX)
    public WebElement mpidThreeCheckbox;
    @FindBy(xpath = MPID_FOUR_CHECKBOX)
    public WebElement mpidFourCheckbox;
    @FindBy(xpath = MPID_TA_CHECKBOX)
    public WebElement mpidTaCheckbox;
    @FindBy(xpath = MPID_TA_TWO_CHECKBOX)
    public WebElement mpidTaTwoCheckbox;


    public WebElement getNoMpidDefinedInformation() {return noMpidDefinedInformation;}
    public WebElement getCancelButton(){return cancelButton;}
    public WebElement getSaveButton() {return  saveButton;}
    public WebElement getMpidOneCheckbox(){return mpidOneCheckbox;}
    public WebElement getMpidTwoCheckbox(){return mpidTwoCheckbox;}
    public WebElement getMpidThreeCheckbox(){return mpidThreeCheckbox;}
    public WebElement getMpidFourCheckbox(){return mpidFourCheckbox;}
    public WebElement getMpidTaCheckbox() {return mpidTaCheckbox;}
    public WebElement getMpidTaTwoCheckbox() {return mpidTaTwoCheckbox;}


}