package com.WebToolsPageObjects.CheckItPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckItPage extends BaseMethods {
    public CheckItPage(WebDriver driver) {
        super(driver);}

    @FindBy(xpath = "/html/body/ui-view/webtools/div/div[2]/webtools-menu/div/div/div[2]/ui-view/check-it-search/div/div/check-it-results/div/div[2]/div/table/tbody/tr/td[2]")
    public WebElement checkItList;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    public WebElement checkItSearchButton;
    @FindBy(xpath = "//button[contains(text(),'Extract')]")
    public WebElement checkItExtractButton;
    @FindBy(xpath = "//button[contains(text(),'Extract Audit Records')]")
    public WebElement checkItExtractAuditRecordsButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/table/tbody/tr[1]/td[1]/button")
    public WebElement checkItExtractDownloadButton;
    @FindBy(xpath = "//button[contains(text(),'Close')]")
    public WebElement checkItExtractCloseButton;
}