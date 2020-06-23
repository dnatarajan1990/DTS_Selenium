package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FtpDetailsPage extends BaseMethods {
    public FtpDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='adressHost']")
    public WebElement ipAddressHostNameTextfield;

    @FindBy(xpath = "//*[@id='userName']")
    public WebElement userNameTextfield;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordTextfield;

    @FindBy(xpath = "//*[@id='confirmPassword']")
    public WebElement confirmPasswordTextfield;

    @FindBy(xpath = "//*[@id='hostType']")
    public WebElement hostTypefield;

    @FindBy(xpath = "//*[@id='description']")
    public WebElement descriptionfield;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/ftp-details/div/div/form/div[7]/button[1]")
    public List<WebElement> ftpSaveButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/ftp-details/div/div/form/div[7]/button[2]")
    public List<WebElement> ftpCancelButton;

    @FindBy(xpath = "//div[contains(@class,'toast toast-success')]")
    public WebElement successToast;

}
