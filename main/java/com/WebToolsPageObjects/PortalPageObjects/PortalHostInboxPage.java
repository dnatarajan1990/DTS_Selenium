package com.WebToolsPageObjects.PortalPageObjects;

import com.CommonPages.BaseMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by iwanicki on 13.11.2017.
 */
public class PortalHostInboxPage extends BaseMethods {

    public PortalHostInboxPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Created by iwanicki on 03.11.2017.
     */
    public static final String FLOW = "//select";
    public static final String INBOX = "//div[@id='collapseELNKTESTPH']/ul/li[@folder='Inbox']";
    public static final String CREATE_BUTTON = "//button[contains(@class, 'btn-success')]";
    public static final String RESET_BUTTON = "//button[contains(@ng-click, 'clickOnReset')]";
    public static final String ACTIONS = "//button[contains(text(),'Action')]";
    public static final String SELECT_ALL_FILES_IN_FOLDER = "(//li[contains(@ng-click,'selectAll')])[1]";
    public static final String DESELECT_ALL_FILES_IN_FOLDER = "//li[contains(@ng-click,'deselectAll')]";
    public static final String EXTRACT_TO_CSV_AND_DOWNLOAD = "//a[contains(@aria-label,'CSV')]";
    public static final String EXTRACT_TO_ZIP_AND_DOWNLOAD = "//li[contains(@ng-click,'openZip')]";
    public static final String INBOX_DFLOW_CHECKBOX = "//input[contains(@ng-click,'selectRow')]";
    public static final String SEARCH_INPUT = "//input[contains(@ng-model,'searchText')]";
    public static final String FILES_IN_INBOX = "//div[contains(@ng-click,'select')]//strong[not(contains(text(),'D0'))]";
    public static final String SELECT_FILES_DISPLAYED_LIMIT = "//select[contains(@ng-model,'limit')]";

    @FindBy(xpath = FLOW)
    public WebElement flows;

    @FindBy(xpath = INBOX)
    public WebElement inbox_folder;

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

    @FindBy(xpath = INBOX_DFLOW_CHECKBOX)
    public List<WebElement> inboxFileChckbxs;

    @FindBy(xpath = FILES_IN_INBOX)
    public List<WebElement> inboxFileIds;

    public void clickOnInbox() {
        waitAndClick(inbox_folder);
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
    public void typeSearchQuery(String searchQuery){
        waitAndType(searchInput,searchQuery);
    }
    public int getInboxCheckboxesCount(){
        return inboxFileChckbxs.size();
    }
    public List<WebElement> getInboxCheckboxList(){
        return inboxFileChckbxs;
    }
    public void clickOnInboxCheckbox(int checkboxIndex) {
        waitAndClick(getInboxCheckboxList().get(checkboxIndex));
    }
    public void selectSingleFile() throws InterruptedException{
        getInboxCheckboxList();
        waitForElement(actionsBtn);
        waitForElement(getInboxCheckboxList().get(0));
        clickOnInboxCheckbox(0);
        waitForElement(actionsBtn);
    }
    public void selectMultipleFiles(int filesCount)  throws InterruptedException{
        getInboxCheckboxList();
        waitForElement(actionsBtn);
        for(int i=0; i<filesCount; i++) {
            waitForElement(getInboxCheckboxList().get(i));
            clickOnInboxCheckbox(i);
        }
        waitForElement(actionsBtn);
    }
    public void goToInbox(){
        try {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("arguments[0].scrollIntoView(true);", inbox_folder);
            waitForElement(inbox_folder);
            clickOnInbox();
        } catch (InterruptedException nsee) {
            nsee.printStackTrace();
        }
    }
    public boolean isInboxListContainTypedQuery(String searchQuery){
        for(WebElement e : inboxFileIds) {
            if (e.getText().contains(searchQuery))
                return true;
        }
        return false;
    }
    public void selectShowEntriesOption(int entriesCount){
        waitAndSelect(selectFilesDisplayedLimit,"number:"+entriesCount);
    }

    public boolean isInboxFileIdExistsInDrafts(String fileId){
        for(WebElement e : inboxFileIds) {
            if (e.getText().equals(fileId))
                return true;
        }
        return false;
    }
}
