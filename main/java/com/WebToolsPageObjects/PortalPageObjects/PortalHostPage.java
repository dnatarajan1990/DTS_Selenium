package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalHostPage extends BaseMethods {
    private static final String HEADER = "//*[@id='portal-template']/div[1]/div/div/div";
    private static final String PANEL = "accordion";

    @FindBy(xpath = HEADER)
    private WebElement header;

    @FindBy(id = PANEL)
    private WebElement panel;

    public PortalHostPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPage() throws InterruptedException {
        waitForElement(header);
        waitForElement(panel);
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getPanel() {
        return panel;
    }

    public void clickOnPanel(WebElement panel) {
        waitAndClick(panel);
    }
}
