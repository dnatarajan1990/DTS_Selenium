package com.WebToolsPageObjects.UserPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAcmtGatewayAccessPage extends BaseMethods {

    public UserAcmtGatewayAccessPage(WebDriver driver) {
        super(driver);
    }

    public static final String SAVE_BUTTON ="//button[contains(text(),'Save')]";
    public static final String CANCEL_BUTTON = "//button[contains(text(),'Cancel')]";
    public static final String GATEWAY_ONE_CHECKBOX = "//input[@id='gatewayInput_1']";
    public static final String GATEWAY_TWO_CHECKBOX = "//input[@id='gatewayInput_2']";
    public static final String GATEWAY_EIGHT_CHECKBOX = "//input[@id='gatewayInput_8']";


    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = GATEWAY_ONE_CHECKBOX)
    public WebElement gatewayOneCheckbox;

    @FindBy(xpath = GATEWAY_TWO_CHECKBOX)
    public WebElement gatewayTwoCheckbox;

    @FindBy(xpath = GATEWAY_EIGHT_CHECKBOX)
    public WebElement gatewayEightCheckbox;


    public WebElement getSaveButton(){return saveButton;}
    public WebElement getCancelButton(){return cancelButton;}
    public WebElement getGatewayOneCheckbox() {
        return gatewayOneCheckbox;
    }
    public WebElement getGatewayTwoCheckbox() {
        return gatewayTwoCheckbox;
    }

    public WebElement getGatewayEightCheckbox() {
        return gatewayEightCheckbox;
    }
}
