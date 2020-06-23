package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PortalHostSentPage extends BaseMethods {
    private static final String PREFERENCES = ".btn.btn-default.pull-right.cog-margin.setting-position";
    public static final String SENT = "//div[@id='collapseELNKTESTPH']/ul/li[@folder='Sent']";
    public static final String CREATE_BUTTON = "//button[contains(@class, 'btn-success')]";
    public static final String RESET_BUTTON = "//button[contains(@ng-click, 'clickOnReset')]";
    public static final String ACTIONS = "//button[contains(text(),'Action')]";
    public static final String SELECT_ALL_FILES_IN_FOLDER = "(//li[contains(@ng-click,'selectAll')])[1]";
    public static final String DESELECT_ALL_FILES_IN_FOLDER = "//li[contains(@ng-click,'deselectAll')]";
    public static final String EXTRACT_TO_CSV_AND_DOWNLOAD = "//a[contains(@aria-label,'CSV')]";
    public static final String EXTRACT_TO_ZIP_AND_DOWNLOAD = "//li[contains(@ng-click,'openZip')]";
    public static final String SENT_DFLOW_CHECKBOX = "//input[contains(@ng-click,'selectRow')]";
    public static final String SEARCH_INPUT = "//input[contains(@ng-model,'searchText')]";
    public static final String FILES_IN_SENT = "//div[contains(@ng-click,'select')]//strong[not(contains(text(),'D0'))]";
    public static final String SELECT_FILES_DISPLAYED_LIMIT = "//select[contains(@ng-model,'limit')]";

    private PortalHostPreferencesPage preferencesPage;

    @FindBy(css = PREFERENCES)
    private WebElement preferences;

    @FindBy(xpath = SENT)
    public WebElement sent_folder;

    @FindBy(xpath = ACTIONS)
    public WebElement actionsBtn;

    @FindBy(xpath = SELECT_ALL_FILES_IN_FOLDER)
    public WebElement selectAllInFolderOption;

    @FindBy(xpath = DESELECT_ALL_FILES_IN_FOLDER)
    public WebElement deselectAllInFolderOption;

    @FindBy(xpath = EXTRACT_TO_CSV_AND_DOWNLOAD)
    public WebElement extractToCSVAndDownloadOption;

    @FindBy(xpath = EXTRACT_TO_ZIP_AND_DOWNLOAD)
    public WebElement extractToZIPAndDownloadOption;

    @FindBy(xpath = SEARCH_INPUT)
    public WebElement searchInput;

    @FindBy(xpath = SELECT_FILES_DISPLAYED_LIMIT)
    public WebElement selectFilesDisplayedLimit;

    @FindBy(xpath = SENT_DFLOW_CHECKBOX)
    public List<WebElement> sentFileChckbxs;

    @FindBy(xpath = FILES_IN_SENT)
    public List<WebElement> sentFileIds;

    public PortalHostSentPage(WebDriver driver) {
        super(driver);
    }

    public void goToSent() {
        try {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", sent_folder);
            waitForElement(sent_folder);
            clickOnSent();
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }

    public void clickOnSent() {
        waitAndClick(sent_folder);
    }

    public void clickOnAction() {
        waitAndClick(actionsBtn);
    }

    public void clickOnSelectAllFilesInFolder() {
        waitAndClick(selectAllInFolderOption);
    }

    public void clickOnDeselectAllFilesInFolder() {
        waitAndClick(deselectAllInFolderOption);
    }

    public void clickExtractToCsvAndDownload() {
        waitAndClick(extractToCSVAndDownloadOption);
    }

    public void clickOnExtractToZIPAndDownload() {
        waitAndClick(extractToZIPAndDownloadOption);
    }

    public void typeSearchQuery(String searchQuery) {
        waitAndType(searchInput, searchQuery);
    }

    public int getSentCheckboxesCount() {
        return sentFileChckbxs.size();
    }

    public List<WebElement> getSentCheckboxList() {
        return sentFileChckbxs;
    }

    public void clickOnSentCheckbox(int checkboxIndex) {
        waitAndClick(getSentCheckboxList().get(checkboxIndex));
    }

    public void selectSingleFile() throws InterruptedException {
        waitForElement(actionsBtn);
        waitForElement(getSentCheckboxList().get(0));
        clickOnSentCheckbox(0);
        waitForElement(actionsBtn);
    }

    public void selectMultipleFiles(int filesCount) throws InterruptedException {
        waitForElement(actionsBtn);
        for (int i = 0; i < filesCount; i++) {
            waitForElement(getSentCheckboxList().get(i));
            clickOnSentCheckbox(i);
        }
        waitForElement(actionsBtn);
    }

    public void changePreferences(int panelNumber, int refreshInterval, int numberOfDaysVisible, boolean save) {
        List<WebElement> preferencesList = driver.findElements(By.cssSelector(PREFERENCES));
        preferencesList.get(panelNumber).click();

        if (refreshInterval > 0) {
            preferencesPage.changeRefreshInterval(refreshInterval);
        }

        if (numberOfDaysVisible > 0) {
            preferencesPage.changeNumberOfDaysVisible(numberOfDaysVisible);
        }

        if (save) {
            preferencesPage.savePreferences();
        } else {
            preferencesPage.cancelPreferences();
        }
    }

    public boolean isSentListContainTypedQuery(String searchQuery) {
        for (WebElement e : sentFileIds) {
            if (e.getText().contains(searchQuery))
                return true;
        }
        return false;
    }

    public void selectShowEntriesOption(int entriesCount) {
        waitAndSelect(selectFilesDisplayedLimit, "number:" + entriesCount);
    }

    public boolean isSentFileIdExistsInDrafts(String fileId) {
        for (WebElement e : sentFileIds) {
            if (e.getText().equals(fileId))
                return true;
        }
        return false;
    }
}
