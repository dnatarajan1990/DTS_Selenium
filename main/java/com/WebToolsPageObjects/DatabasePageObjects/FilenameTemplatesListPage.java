package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FilenameTemplatesListPage extends BaseMethods {
    public FilenameTemplatesListPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[contains(@class,'toast toast-success')]")
    public WebElement successToast;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-list/div/div[2]/div[2]/table/tbody/tr/td[4]/button[1]")
    public WebElement editButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-list/div/div[2]/div[2]/table/tbody/tr/td[4]/button[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    public WebElement confirmDeleteButton;

}
