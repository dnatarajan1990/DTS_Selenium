package com.WebToolsPageObjects.DatabasePageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GatewayStatsPage extends BaseMethods {
    public GatewayStatsPage(WebDriver driver) {
        super(driver);}


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-statistics/div[1]/div/form/div/div[3]/div/button[1]")
    public WebElement graphButton;

    @FindBy(xpath = "//button[contains(text(),'Show Table')]")
    public WebElement tableButton;


    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-statistics/div[2]/div[1]/div/div[1]/div")
    public WebElement firstChart;

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/gateway-statistics/div[2]/table-view")
    public WebElement table;

}
