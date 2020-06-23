package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PortalHostPreferencesPage extends BaseMethods {
    private static final String REFRESH_INTERVAL = "refreshInterval";
    private static final String NUMBER_OF_DAYS_VISIBLE = "input";
    private static final String SAVE_BUTTON = "html/body/div[1]/div/div/div[3]/button[1]";
    private static final String CANCEL_BUTTON = "html/body/div[1]/div/div/div[3]/button[3]";

    @FindBy(id = REFRESH_INTERVAL)
    private WebElement refreshInterval;

    @FindBy(id = NUMBER_OF_DAYS_VISIBLE)
    private WebElement numberOfDaysVisible;

    @FindBy(xpath = SAVE_BUTTON)
    private WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    private WebElement cancelButton;

    public PortalHostPreferencesPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Set refresh interval value in seconds.
     * @param refreshValue Refresh interval. Available options: 0, 10, 30, 60, 120, 300
     */
    public void changeRefreshInterval(int refreshValue) {
        Select select = new Select(refreshInterval);
        select.deselectAll();
        select.selectByValue(String.valueOf(refreshValue));
    }

    public void changeNumberOfDaysVisible(int numberOfDays) {
        waitAndType(numberOfDaysVisible, String.valueOf(numberOfDays));
    }

    public void savePreferences() {
        waitAndClick(saveButton);
    }

    public void cancelPreferences() {
        waitAndClick(cancelButton);
    }
}
