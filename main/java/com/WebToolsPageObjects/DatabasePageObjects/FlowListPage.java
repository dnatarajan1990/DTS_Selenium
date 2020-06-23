package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FlowListPage extends BaseMethods {
    public FlowListPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/flow-list/div/div/table")
    public WebElement flowListTable;
}
