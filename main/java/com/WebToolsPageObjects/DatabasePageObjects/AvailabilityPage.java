package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AvailabilityPage extends BaseMethods {
    public AvailabilityPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/availability-statistics/div[1]/div/form/div/div[3]/div/button[1]")
    public WebElement graphButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/availability-statistics/div[1]/div/form/div/div[3]/div/button[2]")
    public WebElement tableButton;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/availability-statistics/div[2]/div[1]/div/div[1]/div")
    public WebElement firstChart;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/availability-statistics/div[2]/table-view")
    public WebElement table;

}
