package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NonDefaultDirectoriesListPage extends BaseMethods {

    public NonDefaultDirectoriesListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'toast toast-success')]")
    public WebElement successToast;

    @FindBy(xpath = "//*[@id=\"type\"]")
    public WebElement directoryTypeDropdown;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/non-default-directory/div/div/table/tbody/tr/td[2]/input")
    public WebElement directoryNameTextfield;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/non-default-directory/div/div/table/tbody/tr[1]/td[1]/input")
    public WebElement directoryNameEditTextfield;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/non-default-directory/div/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/non-default-directory/div/div/table/tbody/tr[1]/td[2]/button")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    public WebElement confirmDeleteButton;

}
