package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FilenameTemplatesEditPage extends BaseMethods {
    public FilenameTemplatesEditPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-list/div/p/button[1]")
    public WebElement newButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[1]/td[2]/select")
    public WebElement templatePartDropdown1;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[1]/td[4]/select")
    public WebElement partTerminatorDropdown1;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[1]/td[3]/input")
    public WebElement textOrPatternTextfield1;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[2]/td[2]/select")
    public WebElement templatePartDropdown2;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[2]/td[3]/input")
    public WebElement textOrPatternTextfield2;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[2]/td[4]/select")
    public WebElement partTerminatorDropdown2;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/table/tbody/tr[3]/td[2]/select")
    public WebElement templatePartDropdown3;


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/template-details/div/div/form/div[2]/div[2]/button[1]")
    public WebElement saveButton;

}
