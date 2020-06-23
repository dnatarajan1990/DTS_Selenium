package com.WebToolsPageObjects.BulletinPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sciborek on 26.06.2017.
 */
public class BulletinNewPage extends BaseMethods {
    public BulletinNewPage(WebDriver driver) {
        super(driver);}

    public static final String CANCEL_BUTTON = "//button[text()='Cancel']";
    public static final String SAVE_BUTTON = "//button[text()='Save']";
    public static final String START_DATE_BOX ="//date-picker[@model='$ctrl.model.startDt']/div/input";
    public static final String END_DATE_BOX ="//date-picker[@model='$ctrl.model.endDt']/div/input";
    public static final String DESCRIPTION_BOX ="//div[contains(@id,'taTextElement')]";
    public static final String PREVIEW_BOX =".preview";

    @FindBy(xpath = CANCEL_BUTTON)
    public WebElement cancelButton;

    @FindBy(xpath = SAVE_BUTTON)
    public WebElement saveButton;

    @FindBy(xpath = START_DATE_BOX)
    public WebElement startDateBox;

    @FindBy(xpath = END_DATE_BOX)
    public WebElement endDateBox;

    @FindBy(xpath = DESCRIPTION_BOX)
    public WebElement descriptionBox;

    @FindBy(css = PREVIEW_BOX)
    public WebElement previewBox;

    public WebElement getCancelButton() {return cancelButton;}
    public WebElement getSaveButton() { return  saveButton;}
    public WebElement getStartDateBox() {return startDateBox;}
    public WebElement getEndDateBox() {return endDateBox;}
    public WebElement getDescriptionBox() {return descriptionBox;}
    public WebElement getPreviewBox(){return previewBox;}

}
